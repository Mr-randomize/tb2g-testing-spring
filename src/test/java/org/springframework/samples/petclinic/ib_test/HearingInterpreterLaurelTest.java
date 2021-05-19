package org.springframework.samples.petclinic.ib_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("base-test")
@SpringJUnitConfig(classes = {BaseConfig.class, LaurelConfig.class})
class HearingInterpreterLaurelTest {

    @Autowired
    HearingInterpreter hearingInterpreter;

//    @BeforeEach
//    void setUp() throws Exception {
//        hearingInterpreter = new HearingInterpreter(new LaurelWordProducer());
//    }

    @Test
    void whatIHeard() {
        String word = hearingInterpreter.whatIHeard();

        assertEquals("Laurel", word);
    }
}