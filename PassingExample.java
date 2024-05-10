public class PassingExample {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha"; //object
        greet(name); // value of the reference variable passed, only pass by value
    }

    static void greet(String naam){
        System.out.println(naam);
    }
}
