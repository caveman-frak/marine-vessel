package uk.co.bluegecko.marine.vessel.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import uk.co.bluegecko.marine.shared.utility.enums.Described;

@RequiredArgsConstructor
@Getter
public enum HullType implements Described {
	S("Single Hull"),
	D("Double Hull"),
	DM("Double Hull (Marpol)"),
	DBE("Double Bottom Entire Compartment Length"),
	DSE("Double Sides Entire Compartment Length"),
	DSP("Double Sides Partial Compartment Length"),
	DBESP("Double Bottom Entire, Double Sides Partial"),
	DBP("Double Bottom Partial Compartment Length"),
	DSPBP("Double Sides Partial, Double Bottom Partial"),
	DSEBP("Double Sides Entire, Double Bottom Partial"),
	UNKNOWN("Unknown"),
	UNSPECIFIED("Unspecified");

	private final String description;
}