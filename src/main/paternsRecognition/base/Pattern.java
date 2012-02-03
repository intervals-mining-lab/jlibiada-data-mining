package paternsRecognition.base;

import main.Root.BaseObject;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 03.02.12
 * Time: 18:44
 */
public class Pattern extends BaseObject {
    private BaseObject patternName = null;
    private HashMap<Feature, BaseObject> features = new HashMap<Feature, BaseObject>();

    public Pattern(BaseObject patternName) {
        this.patternName = patternName;
    }

    @Override
    public int compareTo(BaseObject object) {
        return patternName.compareTo(((Pattern)object).patternName);
    }

    @Override
    public String toString() {
        return patternName.toString();
    }

    @Override
    public BaseObject clone() {
        Pattern pattern = new Pattern(patternName);
        return pattern;
    }

    @Override
    public boolean equals(Object o) {
        if (patternName.getClass() != ((Pattern)o).patternName.getClass())
            return false;
        if (this == o)
            return true;
        else if (this.toString().compareTo(o.toString()) == 0 && this.features.equals(((Pattern)o).features))
            return true;
        else
            return false;
    }

    public int getFeatureSize() {
        return features.size();
    }

    public void addFeatureValue(Feature feature, BaseObject value) {
        if (isContainsFeature(feature)) {
            features.remove(feature);
            return;
        }
        features.put(feature, value);
    }

    private boolean isContainsFeature(Feature feature) {
        Iterator<Feature> iter = features.keySet().iterator();
        while (iter.hasNext()) {
            if (iter.next().equals(feature))
                return true;
        }
        return false;
    }
}
