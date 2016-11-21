/**
 * Created by regnisalram on 11/21/16.
 */
public class App {

    public static void main(String[] args) {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
        System.out.println ("countHowMany(\'\')=" + wSource.countHowMany('0')); // countHowMany("")=0
    }
}
