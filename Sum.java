import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        
        // int ans = sum2();
        // System.out.println(ans);

        int answer = sum3(10,20);
        System.out.println(answer);
        
    }

        // pass the value of numbers when you are calling the method in main()
        static int sum3(int a, int b){
            int sum = a+b;
            return sum;
        }
 
    // return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum; // function over

       // System.out.println("This will never execute");

    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is: "+ sum);

    }
}
