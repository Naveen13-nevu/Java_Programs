// Find the largest and smallest number in a list.

public class LargestandSmallest {
    
    public static void main(String[] args) {
        int nums[]={10,30,60,80};

        int Smallest = nums[0];
        int largest = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<Smallest){
                Smallest=nums[i];
            }
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        System.out.println("Smallest value is: "+Smallest);
          System.out.println("Largest value is: "+largest);
    }
}
