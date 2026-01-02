package Observer;

import java.util.ArrayList;
import java.util.List;

//Publisher
public class EventManager {
    private List<Listeners> list = new ArrayList<>();

    void subscribe(Listeners listener){
        list.add(listener);
    }

    void unsubscribe(Listeners listener){
        list.remove(listener);
    }

    void update(String eventType, java.io.File file){
        for (Listeners listener : list) {
            listener.update(eventType, file);
        }
    }
}
