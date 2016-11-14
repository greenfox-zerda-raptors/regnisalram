import java.util.*;
import java.io.*;

/**
 * Created by regnisalram on 11/11/16.
 */
public class FuckingTrump {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Did you vote for Trump? y/n");

        System.out.println(vote(input.nextLine()));
        System.out.println();
        System.out.println("Also, here is a random thing that he promised to do:\n" + scared());
        System.out.println();
        System.out.println("facts are from mashable.com (http://mashable.com/2016/11/10/donald-trump-campaign-promises/#h_sjIOHVimqP)");
    }

    public static String vote(String answer) {
        String message;
        if (answer.equals("y")) {
            message = "What the fuck did you just do?";
        } else if (answer.equals("n")) {
            message = "What the fuck are we gonna do?";
        } else {
            message = "Well, if you can't decide, that's already scary.";
        }
        return message;
    }

    public static String scared() {
        List<String> lines = new ArrayList<String>();

        File promiseList = new File("/Users/regnisalram/greenfox/regnisalram/week-04/projects/promises.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(promiseList));
            String line = reader.readLine();

            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
        } catch (Exception e) {

        }
        Random r = new Random();
        String randomLine = lines.get(r.nextInt(lines.size()));

        return randomLine;
    }

}