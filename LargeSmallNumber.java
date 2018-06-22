import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agurchand
 */
public class LargeSmallNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        //create buffer to capture input
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        //define list and integers
        List list = new ArrayList();
        int len, largest, smallest, number;

        //get the limit from user
        System.out.println("Enter the limit (Better give below 10): ");
        len = Integer.parseInt(in.readLine());

        //get the list from user
        System.out.println("Now enter the list:");

        for (int i = 0; i < len; i++) {
            list.add(Integer.parseInt(in.readLine()));
        }

        //assign the first value of list into largest, smallest
        largest = (int) list.get(0);
        smallest = (int) list.get(0);

        //now loop through each list and find largest and smallest number in the list
        for (Object list1 : list) {
            number = (int) list1;
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Largest Number is : " + largest);
        System.out.println("Smallest Number is : " + smallest);
    }

}