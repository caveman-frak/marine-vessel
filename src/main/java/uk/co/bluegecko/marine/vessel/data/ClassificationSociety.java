package uk.co.bluegecko.marine.vessel.data;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ClassificationSociety {

	String code;
	String name;

}