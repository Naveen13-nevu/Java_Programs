
public class MaxConcequtive {
   
    public static int findMax(int []nums){
        int max=0;
        int count=0;
        for(int num:nums){
            if(num==1){
                count++;
               if (count > max) {
                 max = count;
                }
            }else{
                count=0;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]={1,1,0,0,1,1,1,1,1};
       int value = findMax(nums);
       System.out.print(value);
        
    }
}
