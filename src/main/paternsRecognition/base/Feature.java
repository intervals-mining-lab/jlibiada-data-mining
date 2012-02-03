package paternsRecognition.base;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 03.02.12
 * Time: 19:25
 */
public class Feature {
    private String name = "";

    public Feature(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != getClass())
            return false;
        else if (((Feature)obj).name.compareTo(name) != 0)
            return false;
        else
            return true;
    }

    public String getName() {
        return name;
    }
}
