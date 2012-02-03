package paternsRecognition.base;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 03.02.12
 * Time: 19:30
 */
public class PatternsPicks implements Iterable<Pattern> {
    private ArrayList<Pattern> patterns = new ArrayList<Pattern>();

    public void add(Pattern pattern) {
        patterns.add(pattern);
    }

    public int size() {
        return patterns.size();
    }

    public void sortByKey() {
        for (int i = 0; i < patterns.size(); i++) {
            for (int j = 0; j < patterns.size()-1; j++) {
                Pattern first = patterns.get(j);
                Pattern second = patterns.get(j+1);
                if (first.compareTo(second) == 1) {
                    patterns.set(j, second);
                    patterns.set(j+1, first);
                }
            }
        }
    }

    @Override
    public Iterator<Pattern> iterator() {
        return patterns.iterator();
    }
}
