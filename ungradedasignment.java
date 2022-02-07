package task;
import java.util.*;
public class ungradedasignment{
    public static void main(String[] args) {
        
     Scanner sc=new Scanner(System.in);
        int choice=0;
        do {
    
            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
    
            + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
    
            + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
            choice= sc.nextInt();
            switch(choice)
            {
            case 0:
                choice=0;
                break;
            case 1:
               { 
                System.out.println("Enter the number");
                int n= sc.nextInt();
                checkPalindrome(n);
                }
            break;
            case 2:
            { 
                System.out.println("Enter the number");
                int n= sc.nextInt();
                printPattern(n);
            }
            break;
            case 3:
            { 
                System.out.println("Enter the number");
                int n= sc.nextInt();
                checkPrime(n);
                }
            break;
            case 4:
            { 
                System.out.println("Enter the number");
                int n= sc.nextInt();
                Fibonacci(n);
                }
            break;
            default:
                System.out.println("Wrong choice, Enter a valid choice\n");
            }
        } while(choice!=0);
        System.out.println("Exited Successfully!");
        sc.close();
    }
      
        
        
        static void checkPalindrome(int n)
        {
           
             int backup=n;
            int d=0;
            int rev=0;
            while(backup>0) {
                d=backup%10;
                rev=rev*10+d;
                backup=backup/10;
            }
            if(rev==n)
            System.out.println("number is Palindrome");
            else
            System.out.println("number is not a Palindrome");
        }
        
         static void printPattern(int n)
        {
            for(int i=1; i<=n ;i++)
            {
                for(int j=n; j>=i;j--)
                    System.out.print("*");
                System.out.println();
            }
            
        }
        
      static void checkPrime(int n) 
        {
        
            int div=2;
            int count=0;
            for(; div*div<n; div++)
            {
                if(n%div==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            System.out.println("Number is Prime");
            else
            System.out.println("Number is not Prime");
        }
        
        static void Fibonacci(int n)
        {
            int first=0, second=1;
            int sum=0;
            System.out.print(first+", ");
            System.out.print(second+", ");
            for(int i=3; i<=n; i++)
            {
                sum=first+second;
                System.out.print(sum+", ");
                first=second;
                second=sum;
            }
         System.out.println();   
        }
  
}   


      
        	
