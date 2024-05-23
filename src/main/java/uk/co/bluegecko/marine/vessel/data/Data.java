package uk.co.bluegecko.marine.vessel.data;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.Instant;
import java.util.UUID;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Data {

	Source source;
	UUID vesselId;
	String data;
	Instant updated;

	public JsonNode asJson(ObjectMapper objectMapper) throws JsonProcessingException {
		return objectMapper.readTree(data);
	}

}