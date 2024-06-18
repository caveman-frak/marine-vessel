package uk.co.bluegecko.marine.vessel.data;

import static uk.co.bluegecko.marine.vessel.data.Identifier.Validators.simple;

import java.util.function.Predicate;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import uk.co.bluegecko.marine.shared.utility.Named;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum Identifier implements Named {

	IMO("International Maritime Organisation", simple()),
	MMSI("Maritime Mobile Service Identity", simple()),
	CALL_SIGN("Call Sign", simple()),
	HIN("Hull Identification Number", simple()),
	SAIL("Sail Number", simple());

	String name;
	Predicate<String> validator;

	protected static final class Validators {

		static Predicate<String> simple() {
			return v -> true;
		}

	}
}