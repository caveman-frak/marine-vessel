package uk.co.bluegecko.marine.vessel;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import uk.co.bluegecko.marine.shared.application.AbstractApplication;

@SpringBootApplication
public class VesselApplication extends AbstractApplication {

	public static void main(String[] args) {
		run(VesselApplication.class, args);
	}

}