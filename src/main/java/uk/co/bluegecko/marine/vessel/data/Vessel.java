package uk.co.bluegecko.marine.vessel.data;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@Schema(description = "A vessel")
public class Vessel {

	@Schema(name = "code", description = "Code of vessel")
	String code;
	@Schema(name = "name", description = "Name of vessel")
	String name;

}