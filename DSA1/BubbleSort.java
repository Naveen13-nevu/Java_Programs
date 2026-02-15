
public class BubbleSort {
    static void bubble(int []arr){
        int n = arr.length;
        for(int i =0; i<n-1;i++){
            for (int j=0;j<n-i-1;j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


    }
    public static void main(String[] args) {
        
        int arr[]= {2,5,6,9,1,3,0};
        bubble(arr);
        for (int n:arr) {
            System.out.print(n+" ");
        }
    }
}
