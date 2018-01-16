import java.util.Scanner;

/**
 分解质因数
        题目内容：
        每个非素数（合数）都可以写成几个素数（也可称为质数）相乘的形式，这几个素数就都叫做这个合数的质因数。比如，6可以被分解为2x3，而24可以被分解为2x2x2x3。
        现在，你的程序要读入一个[2,100000]范围内的整数，然后输出它的质因数分解式；当读到的就是素数时，输出它本身。
        输入格式:
        一个整数，范围在[2,100000]内。
        输出格式：
        形如：
        n=axbxcxd
        或
        n=n
        所有的符号之间都没有空格，x是小写字母x。
        输入样例：
        18
        输出样例：
        18=2x3x3
 */
public class Week71 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        decomposition(in);
    }
    public static void decomposition (int o) {
        //构造素数集合
        boolean[] numbers = new boolean[5001];
        for (int i = 2;i < numbers.length; i++) {
            numbers[i] = true;
        }
        for (int j = 2;j < numbers.length; j++) {
            if (numbers[j]) {
                for (int k = 2; j * k < numbers.length; k++) {
                    numbers[j * k] = false;
                }
            }
        }
        int x = 0;
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i]) {
                x++;
            }
        }
        int[]prime = new int[x];
        for (int i = 0,k = 0; i < numbers.length; i++) {
            if (numbers[i]) {
                prime[k] = i;
                k++;
            }
        }
    }
}
