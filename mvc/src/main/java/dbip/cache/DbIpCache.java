package dbip.cache;


import com.ip.dbip.domain.GeoAttributes;
import com.ip.dbip.domain.GeoEntity;

import java.net.InetAddress;

/**
 **
 * @author Ankush Sharma
 */
public interface DbIpCache {

	/**
	 * Resolve ip to geolocation
	 * @param inetAddress
	 * @return
	 */
	GeoEntity get(InetAddress inetAddress);

	/**
	 * Save a GeoEntity to Cache
	 * @param geoAttributes
	 */
	void put(GeoAttributes geoAttributes);

}
