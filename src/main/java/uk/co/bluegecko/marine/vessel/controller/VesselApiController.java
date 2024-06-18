package uk.co.bluegecko.marine.vessel.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.util.List;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@Tag(name = "Vessel", description = "API for vessel details")
public class VesselApiController {

	VesselService service;

	@GetMapping
	@Operation(summary = "Retrieve all vessels", description = "Retrieve all active vessels")
	public ResponseEntity<List<Vessel>> retrieveAll() {
		return ResponseEntity.ok(service.all());
	}

	@GetMapping("/{code}")
	@Operation(summary = "Retrieve one vessel", description = "Retrieve one vessel by code")
	public ResponseEntity<Vessel> retrieveByCode(
			@NotBlank
			@Size(min = 7, max = 9)
			@Pattern(regexp = "^\\d{7,9}$", message = "not between 7 and 9 numeric characters")
			@Parameter(description = "The vessel identifier", example = "123456789")
			@PathVariable
			String code) {
		return ResponseEntity.of(service.find(code));
	}

	@PostMapping
	@Operation(summary = "Retrieve one vessel", description = "Retrieve one vessel by code")
	public ResponseEntity<Vessel> retrieveByCode(
			@NonNull
			@Validated
			@Parameter(description = "The vessel identifier", example = """
					{ "code": "123456789"}""")
			@RequestBody
			Id id) {
		return ResponseEntity.of(service.find(id.code()));
	}

	public record Id(
			@NotBlank
			@Size(min = 7, max = 9)
			@Pattern(regexp = "^\\d{7,9}$", message = "not between 7 and 9 numeric characters")
			String code) {

	}

}