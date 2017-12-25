package it.polimi.ingsw.day6;

public class LazyPrintManager {

    private static LazyPrintManager instance;

    private LazyPrintManager(){}

    public static synchronized LazyPrintManager getInstance() {
        if (instance == null)
            instance = new LazyPrintManager();

        return instance;
    }
}
