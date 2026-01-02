package Observer;

import java.io.File;

//Concrete Observer
public class EmailListener implements  Listeners{
    private String Email;
    EmailListener(String mail){
        Email = mail;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + Email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
