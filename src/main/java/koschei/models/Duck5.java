package koschei.models;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Duck5 {
    private final Egg6 egg;
    @Autowired
    public Duck5(Egg6 egg){
        this.egg=egg;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }
}
