public class SecondLargest {
    public static void main(String[] args) {
        
       int [] arr = {1,2,3,4,5,6};
       int first = Integer.MIN_VALUE;
       int second = Integer.MIN_VALUE;

       for(int i = 0; i<arr.length;i++){
        if(arr[i]>first){
            second = first;
            first = arr[i];

        }
        else if (arr[i]>second && arr[i]!= first){
            arr[i]=second;
        }
       }
       System.out.println(second);

    }
}
