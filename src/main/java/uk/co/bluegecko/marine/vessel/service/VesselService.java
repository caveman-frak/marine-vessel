package uk.co.bluegecko.marine.vessel.service;

import java.util.List;
import java.util.Optional;
import org.slf4j.event.Level;
import org.springframework.stereotype.Service;
import uk.co.bluegecko.marine.shared.advice.Timed;
import uk.co.bluegecko.marine.vessel.data.Vessel;

@Service
public class VesselService {

	@Timed
	public List<Vessel> all() {
		return List.of(Vessel.builder().code("boaty").name("McBoatFace").build());
	}

	@Timed(level = Level.WARN)
	public Optional<Vessel> find(String code) {
		return Optional.of(Vessel.builder().code("boaty").name("McBoatFace").build());
	}
}