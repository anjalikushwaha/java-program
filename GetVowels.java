import java.util.Scanner; 
public class GetVowels
 {
  public static void main(String[] args)
 {
    String vowels = "AEIOUaeiou";
    int total = 0;
 
    System.out.print("Enter a string: ");
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
 
    for(int i=0;i<str.length();i++){
      String onechar = str.substring(i,i+1);
      if( vowels.indexOf(onechar) != -1){
        System.out.print(onechar);
        total = total + 1;
      }
    }
    System.out.println();
    System.out.println("Total vowels: " + total);
  }
}