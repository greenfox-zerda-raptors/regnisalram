/**
 * Created by regnisalram on 11/2/16.
 */
public class Workshop21{
    public static void main(String... args){
        String proverb = "If it ain't broke, don't fix it.";
        // Print the "don't fix it" part using the proverb variable
        String subString = proverb.substring(proverb.indexOf("don't fix it"), proverb.lastIndexOf("."));

        System.out.println(subString);
    }
}