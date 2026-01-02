package Observer;

//Observer Implementation(Concrete Observer)
public class LogOpenListener implements Listeners{
    private String logFile;
    LogOpenListener(String logFile){
        this.logFile = logFile;
    }

    @Override
    public void update(String eventType, java.io.File file) {
        System.out.println("Log to " + logFile + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
