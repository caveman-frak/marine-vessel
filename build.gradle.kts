plugins {
    id("marine.application-conventions")
}

dependencies {
    implementation(project(":shared"))
    implementation(project(":wire"))
}

testing {
    suites {
        withType<JvmTestSuite> {
            dependencies {
                implementation(project(":shared"))
                implementation(project(":wire"))
                implementation(project(":test"))
                implementation(testFixtures(project(":shared")))
                implementation(testFixtures(project(":wire")))
            }
        }
    }
}

application {
    mainClass.set("uk.co.bluegecko.marine.vessel.VesselApplication")
}