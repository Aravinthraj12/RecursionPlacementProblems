public class FindtheTargetelement {
    public static void main(String[] args) {
      int arr[]={2,3,4,5,6,7,8,9,10,11};
      int target=5;
        System.out.println(Search(arr,target,0,arr.length-1));
    }
    static int Search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        } else if(target>arr[m]) {
            return Search(arr,target,m+1,e);

        }
        else{
            return Search(arr,target,s,m-1);
        }
    }
}
