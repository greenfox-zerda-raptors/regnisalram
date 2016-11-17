package main.java.music;

/**
 * Created by regnisalram on 11/16/16.
 */
public class ElectricBassGuitar extends StringedInstrument{

    public ElectricBassGuitar(){
        this(6);
    }

    public ElectricBassGuitar(int i){
        super(i);
    }

    public void play() {
        System.out.printf(formatForPlay, name, numberOfStrings, "Duum-duum-duum");
    }

}
