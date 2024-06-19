package uk.co.bluegecko.marine.vessel.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import uk.co.bluegecko.marine.shared.SharedPackage;
import uk.co.bluegecko.marine.shared.configuration.SharedConfiguration;
import uk.co.bluegecko.marine.vessel.VesselApplication;

/**
 * Configuration beans for general application use.
 */
@Configuration
@EntityScan(basePackageClasses = {SharedPackage.class, VesselApplication.class})
@EnableJpaRepositories(basePackageClasses = {SharedPackage.class, VesselApplication.class})
public class ApplicationConfiguration extends SharedConfiguration {

}