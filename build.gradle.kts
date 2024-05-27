import org.jooq.meta.jaxb.Logging

plugins {
    id("marine.application-conventions")
}

dependencies {
    implementation(project(":shared"))
    implementation(project(":wire"))
}

jooq {
    configuration {
        logging = Logging.TRACE
        generator {
            database {
                name = "org.jooq.meta.extensions.liquibase.LiquibaseDatabase"
                properties {
                    // Specify the classpath location of your XML, YAML, or JSON script.
                    property {
                        key = "scripts"
                        value = "config/liquibase/master.yaml"
                    }
                    // Whether you want to include liquibase tables in generated output
                    property {
                        key = "includeLiquibaseTables"
                        value = "false"
                    }
                    // Properties prefixed "database." will be passed on to the liquibase.database.Database class
                    // if a matching setter is found
                    property {
                        key = "database.liquibaseSchemaName"
                        value = "public"
                    }
                    // The property "changeLogParameters.contexts" will be passed on to the
                    // liquibase.database.Database.update() call (jOOQ 3.13.2+).
                    // See https://www.liquibase.org/documentation/contexts.html
                    property {
                        key = "changeLogParameters.contexts"
                        value = "ddl"
                    }
                }
            }
            generate {
                isFluentSetters = true
                isJavaTimeTypes = true
            }
            target {
                packageName = "uk.co.bluegecko.marine.vessel.data.jooq"
                directory = "src/main/generated"
                isClean = true
            }
        }
    }
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