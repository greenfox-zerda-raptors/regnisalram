import java.util.Arrays;

/**
 * Created by regnisalram on 11/4/16.
 */
public class Workshop10{
    public static void main(String[] args) {
        // Task 1: Create an array (jagged) which can contain the different shades of specified colors
        // in colors[0] store the shades of green: "lime", "forest green", "olive", "pale green", "spring green"
        // in colors[1] store the shades of red: "orange red", "red", "tomato"
        // in colors[2] store the shades of pink: "orchid", "violet", "pink", "hot pink"
        String[][] colors = new String[][] {{"lime", "forest green", "olive", "pale green", "spring green"}, {"orange red", "red", "tomato"}, {"orchid", "violet", "pink", "hot pink"}};
        // Task 2: Print the values of the array to the console
        String[] colorColl = new String[] {"green", "red", "pink"};
        for (int i = 0; i < colors.length; i++) {
            System.out.print("shades of " + colorColl[i] + " : ");
            for (int j = 0; j < colors[i].length; j++){
                if (j == colors[i].length -1) {
                    System.out.print(colors[i][j]);
                } else {
                    System.out.print(colors[i][j] + ", ");
                }
            }
            System.out.println();
        }
    }
}
// there's a big bunch of stuff here that's probably unnecessary but i wanted to make sure it prints out like a nice list