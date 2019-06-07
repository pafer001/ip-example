package com.ip.dbip.cache;

import com.google.common.net.InetAddresses;
import com.ip.dbip.domain.GeoAttributes;
import com.ip.dbip.domain.GeoEntity;
import com.ip.dbip.utils.Assert;
import com.ip.dbip.utils.IPUtils;
import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Objects;
import java.util.TreeMap;

/**
 *
 * as repository.
 * @author Ankush Sharma
 */
@Slf4j
public final class JavaTreeMapDbIpCacheImpl implements DbIpCache {


	private static final TreeMap<Integer, GeoEntity> IPV4_CACHE = new TreeMap<>();
	private static final TreeMap<BigInteger,GeoEntity> IPV6_CACHE = new TreeMap<>();

	@Override
	public GeoEntity get(final InetAddress inetAddress) {
		Assert.notNull(inetAddress, "inetAddress must not be null");
		GeoEntity result;
		if(inetAddress instanceof Inet4Address) {
			Integer startIpNum = InetAddresses.coerceToInteger(inetAddress);
			result = Objects.isNull(IPV4_CACHE.floorEntry(startIpNum)) ? GeoEntity.EMPTY
					: IPV4_CACHE.floorEntry(startIpNum).getValue() ;
		}
		else {
			BigInteger startIpBigInt = IPUtils.ipv6ToBigInteger(inetAddress);
			result =  Objects.isNull(IPV6_CACHE.floorEntry(startIpBigInt)) ? GeoEntity.EMPTY
					: IPV6_CACHE.floorEntry(startIpBigInt).getValue();
		}
		return result;
	}


	@Override
	public void put(final GeoAttributes geoAttributes) {
		Assert.notNull(geoAttributes, "geoAttributes must not be null");
		InetAddress startInetAddress = null;
		InetAddress endInetAddress = null;
		GeoEntity geoEntity = geoAttributes.getGeoEntity();

		if(startInetAddress instanceof Inet6Address && endInetAddress instanceof Inet6Address) {
			BigInteger startIpBigInt = IPUtils.ipv6ToBigInteger(startInetAddress);
			IPV6_CACHE.put(startIpBigInt, geoEntity);
		}
		else if (startInetAddress instanceof Inet4Address && endInetAddress instanceof Inet4Address) {
			Integer startIpNum = InetAddresses.coerceToInteger(startInetAddress);
			IPV4_CACHE.put(startIpNum,geoEntity);
		}
		else {
			log.error("This should never happen. startInetAddress : {}, endInetAddress : {} ", startInetAddress, endInetAddress);
		}
	}
}
