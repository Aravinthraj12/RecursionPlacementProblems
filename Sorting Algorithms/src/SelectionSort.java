import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={1,4,6,2,8,3};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minindex=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
            }
        }
    }
}
