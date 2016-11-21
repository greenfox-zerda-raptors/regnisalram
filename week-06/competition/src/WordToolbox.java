/**
 * Created by regnisalram on 11/21/16.
 */
public class WordToolbox implements IWordToolbox {

    private String stringHeld;

    public WordToolbox(String stringHeld) {
        this.stringHeld = stringHeld;
    }

    public boolean isAnAnagram(String stringToCheck) {
        return false;
    }

    @Override
    public void WaitingItOut() {

    }

    public int countHowMany(char charToFind) {
        int sum = 0;
        for (int i = 0; i < stringHeld.length(); i++) {
            if (stringHeld.toLowerCase().charAt(i) == Character.toLowerCase(charToFind)) {
                sum +=1;
            }
        }
        return sum;
    }

    @Override
    public void setS(String s) {
        this.stringHeld = s;
    }

    @Override
    public String getS() {
        return stringHeld;
    }
}
