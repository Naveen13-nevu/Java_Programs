

public class Occurance {
    
    public static void main(String[] args) {
        
        int nums[]={1,2,3,4,4,5,5,6,6,6,6,7};
        int target = 6;
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
            }
        }
        System.out.println(count);
       
    }
}
