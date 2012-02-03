package paternsRecognition.base;

import junit.framework.TestCase;
import main.Root.SimpleTypes.ValueChar;
import main.Root.SimpleTypes.ValueInt;
import main.Root.SimpleTypes.ValueString;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 03.02.12
 * Time: 20:47
 */
public class PatternTest extends TestCase {
    public void testToString() throws Exception {
        Pattern pattern = new Pattern(new ValueString("123"));
        assertEquals(pattern.toString(), "123");
    }

    public void testClone() throws Exception {
        Pattern pattern1 = new Pattern(new ValueInt(1));
        Pattern pattern2 = (Pattern) pattern1.clone();
        assertNotSame(pattern1, pattern2);
        assertEquals(pattern1.toString(), pattern2.toString());
    }

    public void testEquals() throws Exception {
        Pattern pattern1 = new Pattern(new ValueInt(1));
        Pattern pattern2 = (Pattern) pattern1.clone();
        Pattern pattern3 = new Pattern(new ValueInt(3));
        Pattern pattern4 = new Pattern(new ValueChar('1'));
        Pattern pattern5 = (Pattern) pattern1.clone();
        pattern5.addFeatureValue(new Feature("S"), new ValueInt(1));
        assertTrue(pattern1.equals(pattern2));
        assertTrue(pattern1.equals(pattern1));
        assertFalse(pattern1.equals(pattern3));
        assertFalse(pattern1.equals(pattern4));
        assertFalse(pattern1.equals(pattern5));
    }

    public void testGetFeatureSize() throws Exception {
        Pattern pattern = new Pattern(new ValueInt(1));
        pattern.addFeatureValue(new Feature("S"), new ValueInt(1));
        pattern.addFeatureValue(new Feature("A"), new ValueInt(2));
        pattern.addFeatureValue(new Feature("C"), new ValueInt(4));
        assertEquals(pattern.getFeatureSize(), 3);
    }

    public void testAddFeatureValue() throws Exception {
        Pattern pattern = new Pattern(new ValueInt(1));
        pattern.addFeatureValue(new Feature("S"), new ValueInt(1));
        pattern.addFeatureValue(new Feature("S"), new ValueInt(2));
        pattern.addFeatureValue(new Feature("C"), new ValueInt(4));
        assertEquals(pattern.getFeatureSize(), 2);
    }
}
