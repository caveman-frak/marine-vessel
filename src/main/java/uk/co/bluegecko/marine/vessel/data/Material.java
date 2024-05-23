package uk.co.bluegecko.marine.vessel.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import uk.co.bluegecko.marine.shared.utility.enums.Described;

@RequiredArgsConstructor
@Getter
public enum Material implements Described {
	ST("Steel (Unspecified)"),
	AL("Aluminium Alloy"),
	RP("Reinforced Plastic"),
	WD("Wood"),
	WP("Composite (Wood & Plastic)"),
	SS("Stainless Steel"),
	CF("Carbon Fibre"),
	FC("Ferro Concrete"),
	IR("Iron"),
	IW("Composite (Iron & Wood)"),
	YY("Yes"),
	IS("Iron & Steel"),
	SC("Steel & Concrete"),
	RL("Rubber Lined"),
	UNKNOWN("Unknown");

	private final String description;
}