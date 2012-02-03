package paternsRecognition.base;

import junit.framework.TestCase;
import main.Root.SimpleTypes.ValueInt;

import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 03.02.12
 * Time: 21:33
 */
public class PatternsPicksTest extends TestCase {
    public void testAdd() throws Exception {
        PatternsPicks picks = new PatternsPicks();
        picks.add(new Pattern(new ValueInt(1)));
        picks.add(new Pattern(new ValueInt(2)));
        assertEquals(picks.size(), 2);
    }

    public void testSortByKey() throws Exception {
        PatternsPicks picks = new PatternsPicks();
        picks.add(new Pattern(new ValueInt(1)));
        picks.add(new Pattern(new ValueInt(10)));
        picks.add(new Pattern(new ValueInt(2)));

        picks.sortByKey();
        Iterator<Pattern> iter = picks.iterator();
        assertEquals(iter.next().toString(), "1");
        assertEquals(iter.next().toString(), "2");
        assertEquals(iter.next().toString(), "10");
    }

    public void testIterator() throws Exception {

    }
}
