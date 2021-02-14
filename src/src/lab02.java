import java.util.*;
public class lab02 {
    //sorting for a different implementation
//    public void selectionSort(int arr[]) {
//        for (int i=0;i<arr.length;i++){
//            int temp = i;
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[j]<arr[temp]){
//                    temp = j;
//                }
//            }
//            int t = arr[temp];
//            arr[temp] = arr[i];
//            arr[i]=t;
//        }
//    }

    public int[] twoSum(int[] arr, int target){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if ((arr[i]+arr[j])==target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1};
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter intended size of the populated array: ");
        int elements = scanner.nextInt();
        int arr[] = new int[elements];
        System.out.println("Enter elements for the populated array: ");
        for (int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter target: ");
        int target = scanner.nextInt();
        lab02 test = new lab02();
        int[] summedTwice = test.twoSum(arr,target);
        System.out.println(Arrays.toString(summedTwice));
        System.out.println(arr[summedTwice[0]] + " + " + arr[summedTwice[1]] + "==" + target);
    }
}
