package uk.co.bluegecko.marine.vessel.service;

import java.time.Month;
import java.time.YearMonth;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.event.Level;
import org.springframework.stereotype.Service;
import uk.co.bluegecko.marine.shared.advice.Timed;
import uk.co.bluegecko.marine.vessel.data.ClassificationRegistry;
import uk.co.bluegecko.marine.vessel.data.ClassificationRegistry.Type;
import uk.co.bluegecko.marine.vessel.data.ClassificationSociety;
import uk.co.bluegecko.marine.vessel.data.Country;
import uk.co.bluegecko.marine.vessel.data.Hull;
import uk.co.bluegecko.marine.vessel.data.HullType;
import uk.co.bluegecko.marine.vessel.data.Identifier;
import uk.co.bluegecko.marine.vessel.data.Material;
import uk.co.bluegecko.marine.vessel.data.Registrar;
import uk.co.bluegecko.marine.vessel.data.ShipCode;
import uk.co.bluegecko.marine.vessel.data.Vessel;

@Service
public class VesselService {

	@Timed
	public List<Vessel> all() {
		return List.of(createVessel());
	}

	@Timed(level = Level.WARN)
	public Optional<Vessel> find(String code) {
		return Optional.of(createVessel());
	}

	private static Vessel createVessel() {
		return Vessel.builder()
				.id(UUID.randomUUID())
				.name("McBoatFace")
				.flag(Country.builder().code("GBR").name("United Kingdom").build())
				.identity(Identifier.IMO, "123456789")
				.registration(Registrar.builder().code("FELIS").name("Fisheries Licensing").build(), "00-0000001")
				.hull(Hull.builder().hullType(HullType.S).material(Material.CF).length(10.0).beam(2.5).draught(1.5)
						.netTonnage(0.1).build())
				.shipCode(ShipCode.CODE_37)
				.classifier(ClassificationRegistry.builder()
						.classificationSociety(
								ClassificationSociety.builder().code("LR").name("LLoyd's Registry").build())
						.issue(YearMonth.of(2002, Month.JUNE)).type(Type.STANDARD)
						.build())
				.build();
	}

}