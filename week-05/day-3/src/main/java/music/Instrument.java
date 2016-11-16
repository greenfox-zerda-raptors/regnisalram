package main.java.music;

/**
 * Created by regnisalram on 11/16/16.
 */
abstract public class Instrument {

    protected String name;

    abstract void play();

    public Instrument() {
        this.name = getClass().getSimpleName();
    }

}
