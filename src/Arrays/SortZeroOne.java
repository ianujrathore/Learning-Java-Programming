package Arrays;

public class SortZeroOne {
    public static void main(String[] args) {
        int [] arr = {1,0,0,1,1,1,0,1,0,1,1,0};
        int n = arr.length;
        int i = 0;
        int j = n -1;

        while(i < j){
            if(arr[i] == 1 && arr[j] == 0){
                int t1 = arr[i];
                arr[i] = arr[j];
                arr[j] = t1;
                i++;
                j--;
            } else if (arr[i] == 0 && arr[j] == 1) {
                i++;
                j--;
            } else if (arr[j] == 1){
                j--;
            } else if (arr[i] == 0){
                i++;
            }
        }
        for(int ele : arr) System.out.print(ele + " ");
    }
}