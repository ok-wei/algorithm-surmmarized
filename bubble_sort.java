import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bubble_sort {

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
            for (int i = data.length; i > 0; i--) {
                for (int j = 0; j < i - 1; j++) {
                    if (data[j] > data[j + 1]) {// 比较j和j+1位置的数据大小，若data[j] > data[j + 1]则交换
                        int temp = -1;
                        temp = data[j + 1];
                        data[j + 1] = data[j];
                        data[j] = temp;
                    }
                }
            }
        }
        for (int n : data) {
            stringBuilder.append(n).append(" ");
        }
        System.out.print(stringBuilder);// 输出数组

    }

}