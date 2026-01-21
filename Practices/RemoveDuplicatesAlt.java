// public class RemoveDuplicatesAlt {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 2, 3, 4, 4, 5};
//         boolean[] visited = new boolean[arr.length];
//         System.out.print("Array without duplicates: ");

//         for (int i = 0; i < arr.length; i++) {
//             if (visited[i])
//                 {
//                     continue;
//                 } 
//             System.out.print(arr[i] + " ");

//             for (int j = i + 1; j < arr.length; j++){
//                 if (arr[i] == arr[j]) {
//                     visited[j] = true;
//                 }
//             }
//         }
//     }
// }

public class RemoveDuplicatesAlt{
    public static void main(String[] args) {
        int []arr={1,2,3,3,4,4,5,6};
        boolean [] visited = new boolean[arr.length];
        System.out.print("Array without duplicates: ");
        for(int i=0;i<arr.length;i++){
            if(visited[i]){
                continue;
            }
            System.out.print(arr[i]+" ");
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                }
            }
        }
    }
}