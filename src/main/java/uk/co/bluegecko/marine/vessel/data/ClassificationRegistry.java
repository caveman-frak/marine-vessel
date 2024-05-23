package uk.co.bluegecko.marine.vessel.data;

import java.time.YearMonth;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ClassificationRegistry {

	ClassificationSociety classificationSociety;
	YearMonth issue;
	Type type;


	public enum Type {
		STANDARD, CONTEMPLATING, TRANSFERRED
	}

}