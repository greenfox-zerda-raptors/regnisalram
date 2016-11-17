package main.java.music;

/**
 * Created by regnisalram on 11/16/16.
 */
public class ElectricGuitar extends StringedInstrument{

    public ElectricGuitar(){
        this(6);
    }

    public ElectricGuitar(int i){
        super(i);
    }

    public void play() {
        System.out.printf(formatForPlay, name, numberOfStrings, "Twang");
    }
}
