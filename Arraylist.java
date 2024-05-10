import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        list.add(120);
        System.out.println(list);
        // System.out.println(list.contains(10));

        for(int i=0; i< list.size(); i++){
            System.out.println("The element is : "+ list.get(i));
        }

        for(Integer element: list){
            System.out.println("foreach element is: "+ element);
        }

        Iterator<Integer> it = list.iterator();

    }
    
}
