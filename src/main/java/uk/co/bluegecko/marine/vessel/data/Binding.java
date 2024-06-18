package uk.co.bluegecko.marine.vessel.data;

import java.util.UUID;

public record Binding(
		UUID vesselId,
		String field,
		Data data) {

}