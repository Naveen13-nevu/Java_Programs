public class Bubble {
    public static void main(String[] args) {
        int []nums = {1,5,4,8,6,9,};
        int size = nums.length;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for(int num:nums){
            System.out.print(num+" ");
        }

    }
}
