import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {
    List<T> mappableItems = new ArrayList<>();

    public void addMappableItem(T item) {
        mappableItems.add(item);
    }

    public void renderLayer(){
        //pass
        for(T t : mappableItems){
            t.render();
        }
    }
}
