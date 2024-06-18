package uk.co.bluegecko.marine.vessel.data;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;
import java.time.Instant;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.NonNull;
import lombok.Singular;
import lombok.Value;
import lombok.experimental.FieldNameConstants;
import org.hibernate.validator.constraints.Length;
import uk.co.bluegecko.marine.shared.utility.Identified;
import uk.co.bluegecko.marine.shared.utility.Named;

@Value
@Builder
@Schema(description = "Representation of a standard vessel")
@FieldNameConstants
public class Vessel implements Identified<UUID>, Named {

	@Schema(name = "id", title = "Identity", description = "Internal identity of vessel")
	@NonNull
	UUID id;
	@Schema(name = "name", title = "Name", description = "Name of vessel")
	@NotBlank
	@Length(max = 100)
	String name;
	@Schema(name = "flag", title = "Country", description = "Country of Registration")
	@NotBlank
	@Length(min = 2, max = 3)
	Country flag;
	@Schema(name = "identities", title = "Identifiers", description = "Official Vessel Identifiers")
	@NotEmpty
	@Singular
	Map<Identifier, String> identities;
	@Schema(name = "registrations", title = "Registrations", description = "Official Registrations")
	@NonNull
	@Singular
	Map<Registrar, String> registrations;
	@Schema(name = "hull", title = "Hull", description = "Hull Characteristics")
	@NonNull
	Hull hull;
	@Schema(name = "shipCode", title = "Ship Code", description = "Ship's Code and Type")
	@NonNull
	ShipCode shipCode;
	@Schema(name = "companies", title = "Companies", description = "Companies associated with the vessel")
	@NonNull
	@Singular
	Map<Association, Company> companies;
	@Schema(name = "classifiers", title = "Classifiers", description = "Classification society and registries")
	@NonNull
	@Singular
	Set<ClassificationRegistry> classifiers;

	@Schema(name = "updated", title = "Updated", description = "Date and time this entry was last updated")
	@PastOrPresent
	@Default
	Instant updated = Instant.now();
}