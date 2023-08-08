package pl.kurs.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PhaseServiceTest {
    private PhaseService phaseService;

    @Before
    public void init() {
        phaseService = new PhaseService();
    }

    @Test
    public void shouldReturnFirstIsLonger() {
        String result = phaseService.compareStrings("sss", "s");
        assertEquals("First is longer!", result);
    }

    @Test
    public void shuldReturnSecondIsLonger() {
        String result = phaseService.compareStrings("s", "sss");
        assertEquals("Second is longer!", result);
    }

    @Test
    public void shouldReturnAreEqualAndLongerThan5() {
        String result = phaseService.compareStrings("123456", "123456");
        assertEquals("The same and longer that 5", result);
    }

    @Test
    public void shouldReturnAreEqual() {
        String result = phaseService.compareStrings("bbb", "ccc");
    }
}