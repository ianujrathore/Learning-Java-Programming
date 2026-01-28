import java.util.Scanner;

class Sorting {

    public static void selection_sort(int arr[], int n){
        for(int i = 0; i <= n-2 ; i++){
            int mini = i;
            for (int j = i; j <= n-1; j++){
                if (arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubble_sort(int arr[], int n){
        for(int i = n - 1; i >= 1; i--){
            int flag = 0;
            for(int j = 0; j <= i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.print("Array already sorted!");
                break;
            }
        }
    }

    public static void insertion_sort(int arr[], int n){
        for(int i = 0; i <= n - 1; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.print("Enter elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        insertion_sort(arr,n);  
        
        System.out.print("Sorted array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}