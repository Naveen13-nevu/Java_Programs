 class move{

    public void Zero(int []nums){
        int index=0;
        for(int num:nums){
            if(num!=0){
                nums[index++]=num;
            }

        }
        while(index<nums.length){
            nums[index++]=0;
        }
    
    }
}
public class MoveZeroes {
    public static void main(String[] args) {
     move M = new move();
     int [] nums={1,2,0,6,0};
     M.Zero(nums);
     for(int n:nums){
        System.out.print(n+" ");
     }
    }
}
