public class ArrayisSorted {
    public static boolean isSorted(int[] arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {24,3,4,6,7,8};
        System.out.println(isSorted(arr));
    }
    
}
