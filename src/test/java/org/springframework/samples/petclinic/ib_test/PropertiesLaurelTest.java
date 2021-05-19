package org.springframework.samples.petclinic.ib_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestPropertySource("classpath:laurel.properties")
@ActiveProfiles("laurel-props")
@SpringJUnitConfig(classes = PropertiesLaurelTest.TestConfig.class)
class PropertiesLaurelTest {

    @Configuration
    @ComponentScan("org.springframework.samples.petclinic.ib_test")
    static class TestConfig {
    }

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIHeard() {
        String word = hearingInterpreter.whatIHeard();

        assertEquals("LaUREl", word);
    }

}