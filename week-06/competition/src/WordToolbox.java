import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by regnisalram on 11/21/16.
 */
public class WordToolbox implements IWordToolbox {

    private String stringHeld;

    public WordToolbox(String stringHeld) {
        this.stringHeld = stringHeld;
    }

    private HashMap<Character, Integer> countAllLetters(String word) {
        char[] letterList = word.toCharArray();
        HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
        for (char aChar : letterList) {
            if (countMap.containsKey(aChar)) {
                countMap.put(aChar, countMap.get(aChar) + 1);
            } else {
                countMap.put(aChar,1);
            }
        }
        return countMap;
        // Here create the HashMap and go through the word letters, count them if the letter is not already counted
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
