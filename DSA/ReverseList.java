public class ReverseList {

    public static void main(String[] args) {
      int nums []= {1,2,3,4,5,6};
      int nums1 []=new int[nums.length];
      int j=0;
      for(int i=nums.length-1;i>=0;i--){
        nums1[j]=nums[i];
        j++;
      }
      for (int x:nums1) {
          System.out.print(x+" ");
      }
    }
}
