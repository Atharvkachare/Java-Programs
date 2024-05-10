import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //Size of arrayList
        int n=5;

        //Declaratio of a arrayList with initalization with n
        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        //Printing the ArryList 
        System.out.println("Array 1: " + arr1);
        System.out.println("Array 2: " + arr2);

        //Appending new element at the end of the list
        for(int i=1; i<=n;i++){
            arr1.add(i);
            arr2.add(i);
        }

        //Printing the ArryList
        System.out.println("Array 1: " + arr1);
        System.out.println("Array 2: " + arr2);
    }
    
}
