package Observer;

import java.io.File;

//Observer Interface
public interface Listeners {
    default void update(String eventType, File file){};
}
