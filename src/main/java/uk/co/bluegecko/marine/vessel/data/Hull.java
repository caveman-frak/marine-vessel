package uk.co.bluegecko.marine.vessel.data;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;
import lombok.Builder;
import lombok.NonNull;
import org.hibernate.validator.constraints.Range;

@Schema(name = "hull", title = "Hull", description = "Hull Characteristics")
@Builder
public record Hull(
		@Schema(name = "length", title = "Length", description = "Length of vessel")
		@Range(min = 1, max = 9_999)
		@Nullable
		Double length,
		@Schema(name = "beam", title = "Beam/Width ", description = "Beam/Width of vessel")
		@Range(min = 1, max = 499)
		@Nullable
		Double beam,
		@Schema(name = "draught", title = "Draught", description = "Draught of vessel, below water line")
		@Range(min = 1, max = 50)
		@Nullable
		Double draught,
		@Schema(name = "airDraught", title = "Air Draught", description = "Air Draught of vessel, above water line")
		@Range(min = 1, max = 50)
		@Nullable
		Double airDraught,
		@Schema(name = "netTonnage", title = "Net Tonnage", description = "Net Tonnage of vessel")
		@Range(min = 1, max = 999_999)
		@Nullable
		Double netTonnage,
		@Schema(name = "grossTonnage", title = "Gross Tonnage", description = "Gross Tonnage of vessel")
		@Range(min = 1, max = 999_999)
		@Nullable
		Double grossTonnage,
		@Schema(name = "material", title = "Material", description = "Primary hull material")
		@NonNull
		Material material,
		@Schema(name = "hullType", title = "Hull Type", description = "Type of hull construction")
		@NonNull
		HullType hullType) {

}