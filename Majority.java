import java.util.*;
class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 1;
        Arrays.sort(arr);
        int max = arr[0];
        for(int j = 1; j < n; j++)
        {
            if (max == arr[j]) {
                count++;
            }
            else if (count == 0){
                max = arr[j];
            }
            else {
                count--;
            }
        }
        System.out.println(max);
    }
}