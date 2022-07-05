import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class insertionSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int size = Integer.parseInt(br.readLine());// 输入数组的长度

        String[] nums = br.readLine().split(" ");// 输入数组
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(nums[i]);// 字符串转换整形数
        }
        insertion_Sorting(arr);
        for (int n : arr) {
            stringBuilder.append(n).append(" ");
        }
        System.out.print(stringBuilder);// 输出数组
    }

    public static void insertion_Sorting(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

            }
        }
    }
}
