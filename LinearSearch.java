public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {12, 4,56,76,87,33,42,-1};
        int target = 87;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        
    }

    // search in the array : return the index if item found 
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index=0; index<arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }

        }
        return -1;
    }
    
}
