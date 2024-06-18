package uk.co.bluegecko.marine.vessel.data;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import uk.co.bluegecko.marine.shared.utility.Codified;
import uk.co.bluegecko.marine.shared.utility.Described;
import uk.co.bluegecko.marine.shared.utility.Named;

class ShipTypeTest {

	@Test
	void lookupValidCode() {
		assertThat(ShipType.fromCode("dive")).isPresent().get().isEqualTo(ShipType.DIVE);
	}

	@Test
	void lookupInvalidCode() {
		assertThat(ShipType.fromCode("foo")).isNotPresent();
	}

	@Test
	void isCodified() {
		Codified codified = ShipType.LAW_ENFORCEMENT;
		assertThat(codified.getCode()).isEqualTo("law-enforcement");
	}

	@Test
	void isNamed() {
		Named named = ShipType.LAW_ENFORCEMENT;
		assertThat(named.getName()).isEqualTo("Law Enforcement");
	}

	@Test
	void isDescribed() {
		Described described = ShipType.LAW_ENFORCEMENT;
		assertThat(described.getDescription()).isEqualTo("Law enforcement craft");
	}

}