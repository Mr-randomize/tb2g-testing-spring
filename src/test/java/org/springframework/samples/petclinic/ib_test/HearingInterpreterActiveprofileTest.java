package org.springframework.samples.petclinic.ib_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ActiveProfiles("yanny")
@SpringJUnitConfig(classes = HearingInterpreterActiveprofileTest.TestConfig.class)
class HearingInterpreterActiveprofileTest {

    @Configuration
    @ComponentScan("org.springframework.samples.petclinic.ib_test")
    static class TestConfig {
    }

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIHeard() {
        String word = hearingInterpreter.whatIHeard();

        assertEquals("Yanny", word);
    }
}