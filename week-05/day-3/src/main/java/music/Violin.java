package main.java.music;

/**
 * Created by regnisalram on 11/16/16.
 */
public class Violin extends StringedInstrument{

    public Violin(){
        this(4);
    }

    public Violin(int i){
        super(i);
    }

    public void play() {
        System.out.printf(formatForPlay, name, numberOfStrings, "Screech");
    }

}
