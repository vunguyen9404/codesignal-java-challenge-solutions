package challenges.makeArrayConsentive;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MakeArrayConsentiveTest {
    @Test
    public void makeArrayConsentiveTest() {
        MakeArrayConsentive m = new MakeArrayConsentive();
        assertEquals(3, m.makeArrayConsentive(Arrays.asList(6, 2, 3, 8)));
        assertEquals(2, m.makeArrayConsentive(Arrays.asList(0, 3)));
        assertEquals(0, m.makeArrayConsentive(Arrays.asList(5, 4, 6)));
        assertEquals(2, m.makeArrayConsentive(Arrays.asList(6, 3)));
        assertEquals(0, m.makeArrayConsentive(Arrays.asList(1)));
    }
}