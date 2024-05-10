public class OrderAhnosticBS {
    public static void main(String[] args) {
        int[] arr ={2,3,4,15,16,22,45, 12,34,223,16};
        int target =223;
        int ans = orderAhnosticBS(arr, target);
        System.out.println(ans);
        
    }


    static int orderAhnosticBS(int[] arr, int target){
        int start=0;
        int end = arr.length-1;

        // array is accending or desending
        boolean isAsc = arr[start] < arr[end];
        while(start<= end){
            //find middle
            int mid = start+(end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
            if(target < arr[mid]){
                end = mid-1;

            }
            else{
                start = mid +1;
            }
        }else{
                if(target > arr[mid]){
                    end = mid-1;
    
                }
            else{
                    start = mid +1;

              
            }
        }
        
    }
    return -1;
}
}
    

