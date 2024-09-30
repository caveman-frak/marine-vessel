plugins {
    id("marine.application-conventions")
}

dependencies {
}

testing {
    suites {
        withType<JvmTestSuite> {
            dependencies {
            }
        }
    }
}

application {
    mainClass.set("uk.co.bluegecko.marine.vessel.VesselApplication")
}