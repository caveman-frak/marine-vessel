package uk.co.bluegecko.marine.vessel.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.bluegecko.marine.vessel.data.Vessel;
import uk.co.bluegecko.marine.vessel.service.VesselService;
import uk.co.bluegecko.marine.wire.geo.Country;

/**
 * Read-only REST end-point for {@link Country}.
 */
@Slf4j
@Value
@RestController
@RequestMapping(path = "/vessel", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class VesselApiController {

	VesselService service;
	Environment env;

	@GetMapping
	@Operation(summary = "Retrieve all vessels", description = "Retrieve all active vessels")
	public ResponseEntity<List<Vessel>> retrieveAll() {
		return ResponseEntity.ok(service.all());
	}

	@GetMapping("/{code}")
	@Operation(summary = "Retrieve one vessel", description = "Retrieve one vessel by code")
	public ResponseEntity<Vessel> retrieveByCode(
			@NotBlank @Size(min = 2, max = 3)
			@Parameter(description = "The country code", example = "GB") @PathVariable String code) {
		return ResponseEntity.of(service.find(code));
	}

}