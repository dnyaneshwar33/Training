import java.util.Scanner;
public class guessnumber{

    public static void main(String a[])
    {
      int mynumber=0;
      int guessnumber = (int)(Math.random()*100);
      
      Scanner sc = new Scanner(System.in);
      
      do{
        System.out.println("Guess the number between 1-100 :");
         mynumber=sc.nextInt();
        if(mynumber==guessnumber){
            System.out.println("There you are boyyyy");
            break;
        }
        else if(mynumber>guessnumber){
            System.out.println("your number is bigger than actual one");
            
        }
        else {
            System.out.println("your number is smaller than actual one");
            
        }
       
       }
       while(mynumber>=0);
         System.out.println("The number was:"+guessnumber);
      

      
    }
}
//negative num will end 