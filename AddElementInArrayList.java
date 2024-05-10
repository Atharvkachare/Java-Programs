import java.util.ArrayList;

public class AddElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Atharv");
        a1.add("Kachare");

        a1.add(1,"Atul");
        System.out.println(a1);
    }
    
}
