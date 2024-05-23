package uk.co.bluegecko.marine.vessel.data;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "shipType", title = "Ship Type", description = "Ship Type")
public enum ShipType {
	@Schema(name = "wig", title = "Wing in Ground", description = "Wing in Ground (also Other)")
	WIG,
	@Schema(name = "other", title = "Other", description = "Other type of craft")
	OTHER,
	@Schema(name = "fishing", title = "Fishing", description = "Fishing vessel")
	FISHING,
	@Schema(name = "tug", title = "Tug", description = "Tug boat")
	TUG,
	@Schema(name = "dredger", title = "Dredger", description = "Dredger")
	DREDGER,
	@Schema(name = "dive", title = "Dive", description = "Dive support craft")
	DIVE,
	@Schema(name = "military", title = "Military", description = "Military vessel")
	MILITARY,
	@Schema(name = "sailing", title = "Sailing", description = "Sailing boat")
	SAILING,
	@Schema(name = "pleasure", title = "Pleasure", description = "Pleasure craft")
	PLEASURE,
	@Schema(name = "high-speed", title = "High Speed", description = "High speed craft")
	HIGH_SPEED,
	@Schema(name = "pilot", title = "Pilot", description = "Pilot craft")
	PILOT,
	@Schema(name = "search-rescue", title = "Search & Rescue", description = "Search and rescue craft")
	SEARCH_RESCUE,
	@Schema(name = "tender", title = "Port Tender", description = "Port Tender")
	TENDER,
	@Schema(name = "anti-pollution", title = "Anti-Pollution", description = "Anti-pollution equipment")
	ANTI_POLLUTION,
	@Schema(name = "law-enforcement", title = "Law Enforcement", description = "Law enforcement craft")
	LAW_ENFORCEMENT,
	@Schema(name = "medical", title = "Medical", description = "Medical transport")
	MEDICAL,
	@Schema(name = "special", title = "Special",
			description = "Non-combatant vessel, according to RR Resolution no. 18")
	SPECIAL,
	@Schema(name = "passenger", title = "Passenger", description = "Passenger craft")
	PASSENGER,
	@Schema(name = "cargo", title = "Cargo", description = "Cargo vessel")
	CARGO,
	@Schema(name = "tanker", title = "Tanker", description = "Tanker")
	TANKER
}