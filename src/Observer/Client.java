package Observer;

//Client
//Observer Design Pattern used in Notification Systems, Event Handling Systems, and Real-time Data Feeds
//It allows objects (observers) to subscribe to events or changes in another object (subject) and get notified when those events occur
//This pattern promotes loose coupling between the subject and observers, making the system more flexible and easier to maintain
//It is commonly used in GUI frameworks, messaging systems, and publish-subscribe systems
public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();

        Listeners emailListener = new EmailListener("xyz@gmail.com");
        Listeners logListener = new LogOpenListener("/path/to/log/file.txt");
        editor.subscribe(emailListener);
        editor.subscribe(logListener);
        editor.openFile("test.txt");
        editor.saveFile("test.txt");
    }
}
