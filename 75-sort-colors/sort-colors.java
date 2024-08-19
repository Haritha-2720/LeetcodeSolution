class Solution {
    public void sortColors(int[] nums) {

        int n=nums.length-1;
        int low=0;
        int mid=0;
        int high=n;

        while(mid<=high){
            if(nums[mid]==0){

                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;

                low++;
                mid++;
            }

            else if(nums[mid]==1){
                mid++;
            }

            else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;

                high--;
            }
        }
        
    }
}