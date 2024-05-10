import java.util.Scanner;
import java.util.Arrays;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 24;
        arr[3] = 57;
        arr[4] = 65;
        System.out.println(arr[2]);

        // input using for loop
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        
        System.out.println(Arrays.toString(arr));

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i] + " ");
        // }
        // for(int num : arr){// for every element in array, print the element
        //     System.out.print(num+ " "); // numrepresents elements in array
        // }

    }
}
