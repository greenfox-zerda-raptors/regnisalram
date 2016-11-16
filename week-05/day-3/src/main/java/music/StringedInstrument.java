package main.java.music;

/**
 * Created by regnisalram on 11/16/16.
 */
abstract public class StringedInstrument extends Instrument{

    public int numberOfStrings;

    final String formatForPlay = "%s, a %d-stringed instrument that %s\n";


    public StringedInstrument() {
        super();
    }

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
