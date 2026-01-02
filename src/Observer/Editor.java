package Observer;

//Publisher
public class Editor {
    private EventManager eventManager;

    public Editor(){
        eventManager = new EventManager();
    }

    public void subscribe(Listeners listener){
        eventManager.subscribe(listener);
    }
    public void unsubscribe(Listeners listener){
        eventManager.unsubscribe(listener);
    }
    public void openFile(String filePath){
        System.out.println("File " + filePath + " opened.");
        eventManager.update("open", new java.io.File(filePath));
    }

    public void saveFile(String filePath){
        System.out.println("File " + filePath + " saved.");
        eventManager.update("save", new java.io.File(filePath));
    }
}
