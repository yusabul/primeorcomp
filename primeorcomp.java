import java.util.Scanner;
public class primeorcomp{
   public static void main(String [] args){
      Scanner keyboard = new Scanner(System.in);
      boolean cont  = true;
      while(cont){
         System.out.println("Enter a number");
         int num = keyboard.nextInt();
         int count = 0;
      
         while(num <= 1){
            System.out.println("Error number should be greater than 1.");
            System.out.println("Enter a number");
            num = keyboard.nextInt();
         }
      
         for(int i = 1; i <= num; i++){
            int r = num % i;
            if (r == 0){
               count++;
            }
         }
         if(count > 2){
            System.out.println(num + " is composite.");
         }
         else{
            System.out.println(num + " is prime.");
         }
         System.out.println("Would you like to continue? Y/N");
         String choice = keyboard.next();
         if (choice.equals("N") || choice.equals("n")){
            cont = false;
         }
      }
   }
}
            
      