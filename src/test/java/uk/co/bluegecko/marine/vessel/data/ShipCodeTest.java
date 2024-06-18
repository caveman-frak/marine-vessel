package uk.co.bluegecko.marine.vessel.data;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import uk.co.bluegecko.marine.shared.utility.Described;
import uk.co.bluegecko.marine.shared.utility.Identified;

class ShipCodeTest {

	@Test
	void lookupValidId() {
		assertThat(ShipCode.fromId(45)).isPresent().get().isEqualTo(ShipCode.CODE_45);
	}

	@Test
	void lookupInvalidIdToLow() {
		assertThat(ShipCode.fromId(15)).isNotPresent();
	}

	@Test
	void lookupInvalidIdTooHigh() {
		assertThat(ShipCode.fromId(100)).isNotPresent();
	}

	@Test
	void isIdentified() {
		Identified<Integer> identified = ShipCode.CODE_62;
		assertThat(identified.getId()).isEqualTo(62);
	}

	@Test
	void isDescribed() {
		Described described = ShipCode.CODE_62;
		assertThat(described.getDescription()).isEqualTo("Passenger, Hazard Category B");
	}

	@Test
	void hasHazard() {
		assertThat(ShipCode.CODE_62.getHazard()).isEqualTo(Hazard.CATEGORY_B);
	}

	@Test
	void hasShipType() {
		assertThat(ShipCode.CODE_62.getShipType()).isEqualTo(ShipType.PASSENGER);
	}

}