package uk.co.bluegecko.marine.vessel;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class VesselApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(VesselApplication.class).registerShutdownHook(true).run(args);
	}

}