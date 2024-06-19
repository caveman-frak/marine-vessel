package uk.co.bluegecko.marine.vessel.service;

import java.time.Month;
import java.time.YearMonth;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.slf4j.event.Level;
import org.springframework.boot.actuate.audit.listener.AuditApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
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
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class VesselService {

	ApplicationEventPublisher publisher;

	@Timed
	public List<Vessel> all() {
		return List.of(createVessel("ALL"));
	}

	@Timed(level = Level.WARN)
	public Optional<Vessel> find(String code) {
		return Optional.of(createVessel(code));
	}

	private Vessel createVessel(String code) {
		Vessel vessel = Vessel.builder()
				.id(UUID.randomUUID())
				.name("McBoatFace")
				.flag(Country.builder().code("GBR").name("United Kingdom").build())
				.identity(Identifier.IMO, code)
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

		publisher.publishEvent(new AuditApplicationEvent("someone", "vessel",
				"code=" + code, "vessel=" + vessel.toString()));

		return vessel;
	}

}