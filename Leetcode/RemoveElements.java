public class removeElements {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[k]=nums[i];
                k++;
               
            }

        }
        return k;
    }
    public static void main(String []a){
        int nums[]={3,2,2,3,2,2,5};
        int val = 2;
     removeElements s = new removeElements();
     int result = s.removeElement(nums,2);
     System.out.println(result);


        
    }
}