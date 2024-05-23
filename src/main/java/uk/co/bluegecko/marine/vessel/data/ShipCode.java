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

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import uk.co.bluegecko.marine.shared.utility.enums.Described;
import uk.co.bluegecko.marine.shared.utility.enums.Identified;

@RequiredArgsConstructor
@Getter
public enum ShipCode implements Identified<ShipCode>, Described {
	CODE_20(20, "Wing in Ground (WIG), All ships in class", ALL, WIG),
	CODE_21(21, "Wing in Ground (WIG), Hazard Category A", CATEGORY_A, WIG),
	CODE_22(22, "Wing in Ground (WIG), Hazard Category B", CATEGORY_B, WIG),
	CODE_23(23, "Wing in Ground (WIG), Hazard Category C", CATEGORY_C, WIG),
	CODE_24(24, "Wing in Ground (WIG), Hazard Category D", CATEGORY_D, WIG),
	CODE_25(25, "Wing in Ground (WIG), Reserved", RESERVED, WIG),
	CODE_26(26, "Wing in Ground (WIG), Reserved", RESERVED, WIG),
	CODE_27(27, "Wing in Ground (WIG), Reserved", RESERVED, WIG),
	CODE_28(28, "Wing in Ground (WIG), Reserved", RESERVED, WIG),
	CODE_29(29, "Wing in Ground (WIG), No additional information", NO_INFORMATION, WIG),

	CODE_30(30, "Fishing", NONE, FISHING),
	CODE_31(31, "Towing", NONE, TUG),
	CODE_32(32, "Towing", NONE, TUG),
	CODE_33(33, "Dredging or underwater ops", NONE, DREDGER),
	CODE_34(34, "Diving ops", NONE, DIVE),
	CODE_35(35, "Military Ops", NONE, MILITARY),
	CODE_36(36, "Sailing", NONE, SAILING),
	CODE_37(37, "Pleasure Craft", NONE, PLEASURE),
	CODE_38(38, "Reserved", RESERVED, OTHER),
	CODE_39(39, "Reserved", RESERVED, OTHER),

	CODE_40(40, "High Speed Craft, All ships in class", ALL, HIGH_SPEED),
	CODE_41(41, "High Speed Craft, Hazard Category A", CATEGORY_A, HIGH_SPEED),
	CODE_42(42, "High Speed Craft, Hazard Category B", CATEGORY_B, HIGH_SPEED),
	CODE_43(43, "High Speed Craft, Hazard Category C", CATEGORY_C, HIGH_SPEED),
	CODE_44(44, "High Speed Craft, Hazard Category D", CATEGORY_D, HIGH_SPEED),
	CODE_45(45, "High Speed Craft, Reserved", RESERVED, HIGH_SPEED),
	CODE_46(46, "High Speed Craft, Reserved", RESERVED, HIGH_SPEED),
	CODE_47(47, "High Speed Craft, Reserved", RESERVED, HIGH_SPEED),
	CODE_48(48, "High Speed Craft, Reserved", RESERVED, HIGH_SPEED),
	CODE_49(49, "High Speed Craft, No additional information", NO_INFORMATION, HIGH_SPEED),

	CODE_50(50, "Pilot Vesse;", NONE, PILOT),
	CODE_51(51, "Search and Rescue Vessel", NONE, SEARCH_RESCUE),
	CODE_52(52, "Tug", NONE, TUG),
	CODE_53(53, "Port Tender", NONE, TENDER),
	CODE_54(54, "Anti-pollution Equipment", NONE, ANTI_POLLUTION),
	CODE_55(55, "Law Enforcement", NONE, LAW_ENFORCEMENT),
	CODE_56(56, "Spare - Local Vessel", NONE, OTHER),
	CODE_57(57, "Spare - Local Vessel", NONE, OTHER),
	CODE_58(58, "Medical Transport", NONE, MEDICAL),
	CODE_59(59, "Non-Combatant Ship", NONE, SPECIAL),

	CODE_60(60, "Passenger, All ships in class", ALL, PASSENGER),
	CODE_61(61, "Passenger, Hazard Category A", CATEGORY_A, PASSENGER),
	CODE_62(62, "Passenger, Hazard Category B", CATEGORY_B, PASSENGER),
	CODE_63(63, "Passenger, Hazard Category C", CATEGORY_C, PASSENGER),
	CODE_64(64, "Passenger, Hazard Category D", CATEGORY_D, PASSENGER),
	CODE_65(65, "Passenger, Reserved", RESERVED, PASSENGER),
	CODE_66(66, "Passenger, Reserved", RESERVED, PASSENGER),
	CODE_67(67, "Passenger, Reserved", RESERVED, PASSENGER),
	CODE_68(68, "Passenger, Reserved", RESERVED, PASSENGER),
	CODE_69(69, "Passenger, No additional information", NO_INFORMATION, PASSENGER),

	CODE_70(70, "Cargo, All ships in class", ALL, CARGO),
	CODE_71(71, "Cargo, Hazard Category A", CATEGORY_A, CARGO),
	CODE_72(72, "Cargo, Hazard Category B", CATEGORY_B, CARGO),
	CODE_73(73, "Cargo, Hazard Category C", CATEGORY_C, CARGO),
	CODE_74(74, "Cargo, Hazard Category D", CATEGORY_D, CARGO),
	CODE_75(75, "Cargo, Reserved", RESERVED, CARGO),
	CODE_76(76, "Cargo, Reserved", RESERVED, CARGO),
	CODE_77(77, "Cargo, Reserved", RESERVED, CARGO),
	CODE_78(78, "Cargo, Reserved", RESERVED, CARGO),
	CODE_79(79, "Cargo, No additional information", NO_INFORMATION, CARGO),

	CODE_80(80, "Tanker, All ships in class", ALL, TANKER),
	CODE_81(81, "Tanker, Hazard Category A", CATEGORY_A, TANKER),
	CODE_82(82, "Tanker, Hazard Category B", CATEGORY_B, TANKER),
	CODE_83(83, "Tanker, Hazard Category C", CATEGORY_C, TANKER),
	CODE_84(84, "Tanker, Hazard Category D", CATEGORY_D, TANKER),
	CODE_85(85, "Tanker, Reserved", RESERVED, TANKER),
	CODE_86(86, "Tanker, Reserved", RESERVED, TANKER),
	CODE_87(87, "Tanker, Reserved", RESERVED, TANKER),
	CODE_88(88, "Tanker, Reserved", RESERVED, TANKER),
	CODE_89(89, "Tanker, No additional information", NO_INFORMATION, TANKER),

	CODE_90(90, "Other, All ships in class", ALL, OTHER),
	CODE_91(91, "Other, Hazard Category A", CATEGORY_A, OTHER),
	CODE_92(92, "Other, Hazard Category B", CATEGORY_B, OTHER),
	CODE_93(93, "Other, Hazard Category C", CATEGORY_C, OTHER),
	CODE_94(94, "Other, Hazard Category D", CATEGORY_D, OTHER),
	CODE_95(95, "Other, Reserved", RESERVED, OTHER),
	CODE_96(96, "Other, Reserved", RESERVED, OTHER),
	CODE_97(97, "Other, Reserved", RESERVED, OTHER),
	CODE_98(98, "Other, Reserved", RESERVED, OTHER),
	CODE_99(99, "Other, No additional information", NO_INFORMATION, OTHER);

	private final int id;
	private final String description;
	private final Hazard hazard;
	private final ShipType shipType;

	@Override
	public ShipCode fromId(int id) {
		return ShipCode.values()[id - 20];
	}
}