package uk.co.bluegecko.marine.vessel.data;

import static uk.co.bluegecko.marine.vessel.data.Identifier.Validators.simple;

import java.util.function.Predicate;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Identifier {

	IMO("International Maritime Organisation", simple()),
	MMSI("Maritime Mobile Service Identity", simple()),
	CALL_SIGN("Call Sign", simple()),
	HIN("Hull Identification Number", simple()),
	SAIL("Sail Number", simple());

	private final String name;
	private final Predicate<String> validator;

	protected static final class Validators {

		static Predicate<String> simple() {
			return v -> true;
		}
	}
}