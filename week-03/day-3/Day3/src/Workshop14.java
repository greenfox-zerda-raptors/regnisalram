/**
 * Created by regnisalram on 11/4/16.
 */
public class Workshop14{
    public static void main(String[] args) {
        // Reverse the order of ah
        int[] ah = new int[]  { 3, 4, 5, 6, 7 };

        for (int i = 0, j = ah.length-1; i < ah.length/2; i ++, j--) {
            int temp = ah[i];
            ah[i] = ah[j];
            ah[j] = temp;
        }


        for(int i=0;i<5;i++){
            System.out.print(ah[i]);
        };

        System.out.println();
    }
}
