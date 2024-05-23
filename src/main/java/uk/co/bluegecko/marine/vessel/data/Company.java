package uk.co.bluegecko.marine.vessel.data;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Company {

	@NotBlank
	String name;
	@Nullable
	Long code;
	@Nullable
	Country control;
	@Nullable
	Country domicile;
	@Nullable
	Country registration;

}