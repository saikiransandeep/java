// public class binary {
//     public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5}; 
//        int k= 3;
//        int value = binarySearch(arr, k);
//        System.out.println("The index of the element is: " + value);
//     }
//     public static int binarySearch(int[] arr, int k) {
//         int mid , low = 0 , high = arr.length - 1;
//         while(low <= high) {
//             mid = (low + high) / 2;
//             if(arr[mid] == k) {
//                 return mid;
//             } else if(arr[mid] < k) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return -1;
//     }
// }


public class binary {
    static void temp(int[] arr,int k){
        int low=0,high=arr.length-1,mid;
        while(low<=high){
              mid=low+(high-low)/2;
              if(arr[mid]==k){
                  System.out.println(mid);
                  break;
              }else if(arr[mid]<k){
                  low=mid+1;
              }else if(arr[mid]>k){
                  high=mid-1;
              }
        }
        System.out.println("index not found");
    }
    public static void main(String[] args) {
        int[] arr={1,4,5,6,8,9};
        int k=4;
       temp(arr,k);
        
    }
}