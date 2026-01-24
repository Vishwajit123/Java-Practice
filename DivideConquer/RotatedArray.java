package DivideConquer;

public class RotatedArray {

    public static int rotatedArray(int arr[], int si, int ei, int tar){

        if(si>ei){
            return -1;
        }
       int  mid=si+ (ei-si)/2;
       //found mid
       if(arr[mid]==tar){
        return mid;
       }

    //    line 1
       if(arr[si]<=arr[mid]){
        // case a=left
        if(arr[si]<=tar && tar<=arr[mid]){
           return rotatedArray(arr, si, mid-1, tar);
        }
        // case b=rigth
        else{
            return rotatedArray(arr, mid+1, ei, tar);
        }
       }

    //    line 2
       else{
        // case c=right
            if(arr[mid]<=tar && tar<=arr[ei]){
              return  rotatedArray(arr, mid+1, ei, tar);
            }
            // case d=left
            else{
                   return  rotatedArray(arr, si, mid-1, tar);
            }
       }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=2;
        int result=rotatedArray(arr, 0, arr.length-1, target);
        System.out.println(result);
    }
}