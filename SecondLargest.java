import java.util.*;
class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int second = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] > max) {
                second = max;
                max = arr[j];
            }
            else if ((arr[j] > second) && (arr[j] != max)) {
                second = arr[j];
            }
        }
        System.out.println(second);
    }
}