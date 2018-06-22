import java.util.Scanner;

public class MainClass {

public static void main(String[] args) {
    try {

        Scanner sc = new Scanner("asda ASA adad");
        String pattern = "[A-Z]+";

        while ((sc.hasNext(pattern))) {

            System.out.println(sc.next(pattern));
        }
        sc.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}