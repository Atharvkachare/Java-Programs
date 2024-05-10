public class ReverseOnlyLetters {
    class Solution {
        public String reverseOnlyLetters(String s) {
            // to convert string to character array
            char[] arr = s.toCharArray();
            int left = 0;
            int right = arr.length-1;
    
            //Start a loop and compare characters
            while(left< right){
                if(!Character.isLetter(arr[left])) left++;
    
                //If right is not a letter
                else if(!Character.isLetter(arr[right])) right--;
    
                // if both are letters, swap them
                else{
                    char temp = arr[left];
                    arr[left++] =arr[right];
                    arr[right--] = temp;
                }
            }
            return new String(arr);
    
            
        }
    }
    
}
