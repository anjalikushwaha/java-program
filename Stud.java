import java.util.*;  
 class Stud  
 {    
      public static void main(String args[])  
      {  
           Scanner in = new Scanner(System.in);  
           System.out.println("Student Records - 2013\n");  
           System.out.print("Name: ");  
           String name = in.nextLine();  
           System.out.print("USN: ");  
           String USN = in.nextLine();  
           System.out.println("Marks in 5 subjects: ");  
           int a[]=new int[5];  
           int tot=0;  
           boolean flag=false;  
           for(int i=0;i<5;i++)  
           {  
           System.out.print("Subject["+(i+1)+"]: ");  
                a[i] = in.nextInt();  
                if(a[i]<25)  
                {  
                     flag=true;  
                }  
                tot+=a[i];  
           }  
           float avg = tot/5;  
           System.out.println("Total: "+tot);  
           System.out.println("Percentage: "+avg+"%");  
           if(flag)  
           {  
                System.out.println("Status: FAIL");  
                return;  
           }   
           String grade="";  
           switch(Math.round(avg/10))  
           {  
                case 10:     grade="FCD";  
                case 9:      grade="FCD";  
                break;  
                case 8:      grade="FC";  
                case 7:      grade="FC";  
                break;       
                case 6 :     grade="SC";  
                case 4 :     grade="SC";  
                break;  
                case 3 :     grade="C";  
                break;  
                default :    grade="F";  
           }  
           System.out.println("Status: " +grade);  
      }  
 }  

