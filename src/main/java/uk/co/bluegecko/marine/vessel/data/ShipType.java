package uk.co.bluegecko.marine.vessel.data;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Optional;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import uk.co.bluegecko.marine.shared.utility.Described;
import uk.co.bluegecko.marine.shared.utility.Named;
import uk.co.bluegecko.marine.shared.utility.enums.Codified;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Schema(name = "shipType", title = "Ship Type", description = "Ship Type")
public enum ShipType implements Codified<ShipType>, Named, Described {
	@Schema(name = "wig", title = "Wing in Ground", description = "Wing in Ground (also Other)")
	WIG("wig", "Wing in Ground", "Wing in Ground (also Other)"),
	@Schema(name = "other", title = "Other", description = "Other type of craft")
	OTHER("other", "Other", "Other type of craft"),
	@Schema(name = "fishing", title = "Fishing", description = "Fishing vessel")
	FISHING("fishing", "Fishing", "Fishing vessel"),
	@Schema(name = "tug", title = "Tug", description = "Tug boat")
	TUG("tug", "Tug", "Tug boat"),
	@Schema(name = "dredger", title = "Dredger", description = "Dredger")
	DREDGER("dredger", "Dredger", "Dredger"),
	@Schema(name = "dive", title = "Dive", description = "Dive support craft")
	DIVE("dive", "Dive", "Dive support craft"),
	@Schema(name = "military", title = "Military", description = "Military vessel")
	MILITARY("military", "Military", "Military vessel"),
	@Schema(name = "sailing", title = "Sailing", description = "Sailing boat")
	SAILING("sailing", "Sailing", "Sailing boat"),
	@Schema(name = "pleasure", title = "Pleasure", description = "Pleasure craft")
	PLEASURE("pleasure", "Pleasure", "Pleasure craft"),
	@Schema(name = "high-speed", title = "High Speed", description = "High speed craft")
	HIGH_SPEED("high-speed", "High Speed", "High speed craft"),
	@Schema(name = "pilot", title = "Pilot", description = "Pilot craft")
	PILOT("pilot", "Pilot", "Pilot craft"),
	@Schema(name = "search-rescue", title = "Search & Rescue", description = "Search and rescue craft")
	SEARCH_RESCUE("search-rescue", "Search & Rescue", "Search and rescue craft"),
	@Schema(name = "tender", title = "Port Tender", description = "Port Tender")
	TENDER("tender", "Port Tender", "Port Tender"),
	@Schema(name = "anti-pollution", title = "Anti-Pollution", description = "Anti-pollution equipment")
	ANTI_POLLUTION("anti-pollution", "Anti-Pollution", "Anti-pollution equipment"),
	@Schema(name = "law-enforcement", title = "Law Enforcement", description = "Law enforcement craft")
	LAW_ENFORCEMENT("law-enforcement", "Law Enforcement", "Law enforcement craft"),
	@Schema(name = "medical", title = "Medical", description = "Medical transport")
	MEDICAL("medical", "Medical", "Medical transport"),
	@Schema(name = "special", title = "Special",
			description = "Non-combatant vessel, according to RR Resolution no. 18")
	SPECIAL("special", "Special", "Non-combatant vessel, according to RR Resolution no. 18"),
	@Schema(name = "passenger", title = "Passenger", description = "Passenger craft")
	PASSENGER("passenger", "Passenger", "Passenger craft"),
	@Schema(name = "cargo", title = "Cargo", description = "Cargo vessel")
	CARGO("cargo", "Cargo", "Cargo vessel"),
	@Schema(name = "tanker", title = "Tanker", description = "Tanker")
	TANKER("tanker", "Tanker", "Tanker");

	String code;
	String name;
	String description;

	public static Optional<ShipType> fromCode(String code) {
		return Codified.fromCode(ShipType.values(), code);
	}

}