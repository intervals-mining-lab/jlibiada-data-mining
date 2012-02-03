package paternsRecognition.base;

import junit.framework.TestCase;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 03.02.12
 * Time: 20:28
 */
public class FeatureTest extends TestCase {
    public void testGetName() {
        Feature feature = new Feature("Nucleotide");
        assertEquals(feature.getName(), "Nucleotide");
    }

    public void testToString() {
        Feature feature = new Feature("Nucleotide");
        assertEquals(feature.toString(), "Nucleotide");
    }

    public void testEquals() {
        Feature feature = new Feature("1");
        assertFalse(feature.equals(new Object()));
    }
}
