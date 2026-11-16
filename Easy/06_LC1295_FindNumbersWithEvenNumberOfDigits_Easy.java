class Solution {
    public int findNumbers(int[] nums) {
        
        int output = 0;
        for(int i = 0; i < nums.length; i++){
            int digit_count = 0;
            while(nums[i] != 0){
                nums[i] = nums[i]/10;
                digit_count++;
            }
            if(digit_count%2 == 0){
                output++;
                digit_count = 0;
            }
            else{
                digit_count = 0;
            }
        }
        return output;
    }
}
