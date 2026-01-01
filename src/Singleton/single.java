package Singleton;

public class single {

    static single instance = null;
    static int name;
    private single (){
        // private constructor to prevent instantiation
    }

    public static String getName(){
        return String.valueOf(name);
    }

    public static single getInstance(){
        if(instance == null){
            instance = new single();
            name = System.identityHashCode(instance);
        }
        return instance;
    }


}
