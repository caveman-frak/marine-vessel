package uk.co.bluegecko.marine.vessel.data;

import static uk.co.bluegecko.marine.vessel.data.Hazard.ALL;
import static uk.co.bluegecko.marine.vessel.data.Hazard.CATEGORY_A;
import static uk.co.bluegecko.marine.vessel.data.Hazard.CATEGORY_B;
import static uk.co.bluegecko.marine.vessel.data.Hazard.CATEGORY_C;
import static uk.co.bluegecko.marine.vessel.data.Hazard.CATEGORY_D;
import static uk.co.bluegecko.marine.vessel.data.Hazard.NONE;
import static uk.co.bluegecko.marine.vessel.data.Hazard.NO_INFORMATION;
import static uk.co.bluegecko.marine.vessel.data.Hazard.RESERVED;
import static uk.co.bluegecko.marine.vessel.data.ShipType.ANTI_POLLUTION;
import static uk.co.bluegecko.marine.vessel.data.ShipType.CARGO;
import static uk.co.bluegecko.marine.vessel.data.ShipType.DIVE;
import static uk.co.bluegecko.marine.vessel.data.ShipType.DREDGER;
import static uk.co.bluegecko.marine.vessel.data.ShipType.FISHING;
import static uk.co.bluegecko.marine.vessel.data.ShipType.HIGH_SPEED;
import static uk.co.bluegecko.marine.vessel.data.ShipType.LAW_ENFORCEMENT;
import static uk.co.bluegecko.marine.vessel.data.ShipType.MEDICAL;
import static uk.co.bluegecko.marine.vessel.data.ShipType.MILITARY;
import static uk.co.bluegecko.marine.vessel.data.ShipType.OTHER;
import static uk.co.bluegecko.marine.vessel.data.ShipType.PASSENGER;
import static uk.co.bluegecko.marine.vessel.data.ShipType.PILOT;
import static uk.co.bluegecko.marine.vessel.data.ShipType.PLEASURE;
import static uk.co.bluegecko.marine.vessel.data.ShipType.SAILING;
import static uk.co.bluegecko.marine.vessel.data.ShipType.SEARCH_RESCUE;
import static uk.co.bluegecko.marine.vessel.data.ShipType.SPECIAL;
import static uk.co.bluegecko.marine.vessel.data.ShipType.TANKER;
import static uk.co.bluegecko.marine.vessel.data.ShipType.TENDER;
import static uk.co.bluegecko.marine.vessel.data.ShipType.TUG;
import static uk.co.bluegecko.marine.vessel.data.ShipType.WIG;

import java.util.Optional;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import uk.co.bluegecko.marine.shared.utility.Described;
import uk.co.bluegecko.marine.shared.utility.enums.Identified;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum ShipCode implements Identified<ShipCode>, Described {
	CODE_20(20, WIG, ALL, "Wing in Ground (WIG), All ships in class"),
	CODE_21(21, WIG, CATEGORY_A, "Wing in Ground (WIG), Hazard Category A"),
	CODE_22(22, WIG, CATEGORY_B, "Wing in Ground (WIG), Hazard Category B"),
	CODE_23(23, WIG, CATEGORY_C, "Wing in Ground (WIG), Hazard Category C"),
	CODE_24(24, WIG, CATEGORY_D, "Wing in Ground (WIG), Hazard Category D"),
	CODE_25(25, WIG, RESERVED, "Wing in Ground (WIG), Reserved"),
	CODE_26(26, WIG, RESERVED, "Wing in Ground (WIG), Reserved"),
	CODE_27(27, WIG, RESERVED, "Wing in Ground (WIG), Reserved"),
	CODE_28(28, WIG, RESERVED, "Wing in Ground (WIG), Reserved"),
	CODE_29(29, WIG, NO_INFORMATION, "Wing in Ground (WIG), No additional information"),

	CODE_30(30, FISHING, NONE, "Fishing"),
	CODE_31(31, TUG, NONE, "Towing"),
	CODE_32(32, TUG, NONE, "Towing"),
	CODE_33(33, DREDGER, NONE, "Dredging or underwater ops"),
	CODE_34(34, DIVE, NONE, "Diving ops"),
	CODE_35(35, MILITARY, NONE, "Military Ops"),
	CODE_36(36, SAILING, NONE, "Sailing"),
	CODE_37(37, PLEASURE, NONE, "Pleasure Craft"),
	CODE_38(38, OTHER, RESERVED, "Reserved"),
	CODE_39(39, OTHER, RESERVED, "Reserved"),

	CODE_40(40, HIGH_SPEED, ALL, "High Speed Craft, All ships in class"),
	CODE_41(41, HIGH_SPEED, CATEGORY_A, "High Speed Craft, Hazard Category A"),
	CODE_42(42, HIGH_SPEED, CATEGORY_B, "High Speed Craft, Hazard Category B"),
	CODE_43(43, HIGH_SPEED, CATEGORY_C, "High Speed Craft, Hazard Category C"),
	CODE_44(44, HIGH_SPEED, CATEGORY_D, "High Speed Craft, Hazard Category D"),
	CODE_45(45, HIGH_SPEED, RESERVED, "High Speed Craft, Reserved"),
	CODE_46(46, HIGH_SPEED, RESERVED, "High Speed Craft, Reserved"),
	CODE_47(47, HIGH_SPEED, RESERVED, "High Speed Craft, Reserved"),
	CODE_48(48, HIGH_SPEED, RESERVED, "High Speed Craft, Reserved"),
	CODE_49(49, HIGH_SPEED, NO_INFORMATION, "High Speed Craft, No additional information"),

	CODE_50(50, PILOT, NONE, "Pilot Vesse;"),
	CODE_51(51, SEARCH_RESCUE, NONE, "Search and Rescue Vessel"),
	CODE_52(52, TUG, NONE, "Tug"),
	CODE_53(53, TENDER, NONE, "Port Tender"),
	CODE_54(54, ANTI_POLLUTION, NONE, "Anti-pollution Equipment"),
	CODE_55(55, LAW_ENFORCEMENT, NONE, "Law Enforcement"),
	CODE_56(56, OTHER, NONE, "Spare - Local Vessel"),
	CODE_57(57, OTHER, NONE, "Spare - Local Vessel"),
	CODE_58(58, MEDICAL, NONE, "Medical Transport"),
	CODE_59(59, SPECIAL, NONE, "Non-Combatant Ship"),

	CODE_60(60, PASSENGER, ALL, "Passenger, All ships in class"),
	CODE_61(61, PASSENGER, CATEGORY_A, "Passenger, Hazard Category A"),
	CODE_62(62, PASSENGER, CATEGORY_B, "Passenger, Hazard Category B"),
	CODE_63(63, PASSENGER, CATEGORY_C, "Passenger, Hazard Category C"),
	CODE_64(64, PASSENGER, CATEGORY_D, "Passenger, Hazard Category D"),
	CODE_65(65, PASSENGER, RESERVED, "Passenger, Reserved"),
	CODE_66(66, PASSENGER, RESERVED, "Passenger, Reserved"),
	CODE_67(67, PASSENGER, RESERVED, "Passenger, Reserved"),
	CODE_68(68, PASSENGER, RESERVED, "Passenger, Reserved"),
	CODE_69(69, PASSENGER, NO_INFORMATION, "Passenger, No additional information"),

	CODE_70(70, CARGO, ALL, "Cargo, All ships in class"),
	CODE_71(71, CARGO, CATEGORY_A, "Cargo, Hazard Category A"),
	CODE_72(72, CARGO, CATEGORY_B, "Cargo, Hazard Category B"),
	CODE_73(73, CARGO, CATEGORY_C, "Cargo, Hazard Category C"),
	CODE_74(74, CARGO, CATEGORY_D, "Cargo, Hazard Category D"),
	CODE_75(75, CARGO, RESERVED, "Cargo, Reserved"),
	CODE_76(76, CARGO, RESERVED, "Cargo, Reserved"),
	CODE_77(77, CARGO, RESERVED, "Cargo, Reserved"),
	CODE_78(78, CARGO, RESERVED, "Cargo, Reserved"),
	CODE_79(79, CARGO, NO_INFORMATION, "Cargo, No additional information"),

	CODE_80(80, TANKER, ALL, "Tanker, All ships in class"),
	CODE_81(81, TANKER, CATEGORY_A, "Tanker, Hazard Category A"),
	CODE_82(82, TANKER, CATEGORY_B, "Tanker, Hazard Category B"),
	CODE_83(83, TANKER, CATEGORY_C, "Tanker, Hazard Category C"),
	CODE_84(84, TANKER, CATEGORY_D, "Tanker, Hazard Category D"),
	CODE_85(85, TANKER, RESERVED, "Tanker, Reserved"),
	CODE_86(86, TANKER, RESERVED, "Tanker, Reserved"),
	CODE_87(87, TANKER, RESERVED, "Tanker, Reserved"),
	CODE_88(88, TANKER, RESERVED, "Tanker, Reserved"),
	CODE_89(89, TANKER, NO_INFORMATION, "Tanker, No additional information"),

	CODE_90(90, OTHER, ALL, "Other, All ships in class"),
	CODE_91(91, OTHER, CATEGORY_A, "Other, Hazard Category A"),
	CODE_92(92, OTHER, CATEGORY_B, "Other, Hazard Category B"),
	CODE_93(93, OTHER, CATEGORY_C, "Other, Hazard Category C"),
	CODE_94(94, OTHER, CATEGORY_D, "Other, Hazard Category D"),
	CODE_95(95, OTHER, RESERVED, "Other, Reserved"),
	CODE_96(96, OTHER, RESERVED, "Other, Reserved"),
	CODE_97(97, OTHER, RESERVED, "Other, Reserved"),
	CODE_98(98, OTHER, RESERVED, "Other, Reserved"),
	CODE_99(99, OTHER, NO_INFORMATION, "Other, No additional information");

	Integer id;
	ShipType shipType;
	Hazard hazard;
	String description;

	public static Optional<ShipCode> fromId(int id) {
		return Identified.fromId(ShipCode.values(), id, 20);
	}

}