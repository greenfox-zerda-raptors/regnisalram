/**
 * Created by regnisalram on 11/7/16.
 */
import java.util.*;

public class Workshop05{
    public static void main(String... args){
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(12, 1, 532, 23, 0, 7, 54, 32));
        Integer newArray[] = new Integer[numList.size()];
        newArray = numList.toArray(newArray);
        // Copy every element of "numList" to an Array

        int[] result = new int[numList.size()];
        for (int i = 0; i <result.length; i++) {
            result[i] = numList.get(i);
        } // group solution, not mine :(


        System.out.println(numList);
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(result));
    }
}