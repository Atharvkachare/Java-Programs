import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntsx
         ArrayList<Integer> list = new ArrayList<>(5);
        //  list.add(67);
        //  list.add(57);
        //  list.add(47);
        //  list.add(37);
        //  list.add(27);
        //  list.add(17);
        //  list.add(77);
        //  list.add(87);
        //  list.add(97);

        //  System.out.println(list.contains(67));
        //  list.set(2, 99);
        //  System.out.println(list);

         //input
         for(int i=0; i<5; i++){
            list.add(in.nextInt());

         }
         

         

    }
    
}
