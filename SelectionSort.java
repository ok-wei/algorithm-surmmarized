import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int size = Integer.parseInt(br.readLine());// 输入数组的长度

        String[] nums = br.readLine().split(" ");// 输入数组
        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = Integer.parseInt(nums[i]);// 字符串转换整形数
        }

        if (size > 1) {
            for (int i = 0; i < data.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < data.length; j++) {
                    if (data[j] < data[minIndex]) {
                        minIndex = j;
                    }

                }
                int temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;
            }

        }

        for (int n : data) {
            stringBuilder.append(n).append(" ");
        }
        System.out.print(stringBuilder);// 输出数组
    }
}
