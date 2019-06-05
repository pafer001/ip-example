package dbip.domain;

import com.ip.dbip.utils.Strings;
import lombok.Builder;
import lombok.Data;

/**
 *
 *
 * @author Ankush Sharma
 */
@Data
@Builder
public class GeoEntity {

	public static final GeoEntity EMPTY = empty();

	private final String city;
	private final String continentCode;
	private final String province ;
	private final String countryCode;
	private final String ip;


	private static GeoEntity empty() {
		return GeoEntity
				.builder()
					.city(Strings.EMPTY)
					.countryCode(Strings.EMPTY)
					.province(Strings.EMPTY)
					.ip(Strings.EMPTY)
					.continentCode(Strings.EMPTY)
				.build();
	}



}
