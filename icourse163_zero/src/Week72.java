/**
    完数
    题目内容：
    一个正整数的因子是所有可以整除它的正整数。而一个数如果恰好等于除它本身外的因子之和，这个数就称为完数。例如6=1＋2＋3(6的因子是1,2,3)。
    现在，你要写一个程序，读入两个正整数n和m（1<=n<m<1000），输出[n,m]范围内所有的完数。
    提示：可以写一个函数来判断某个数是否是完数。
    输入格式:
    两个正整数，以空格分隔。
    输出格式：
    其间所有的完数，以空格分隔，最后一个数字后面没有空格。如果没有，则输出一个空行。
    输入样例：
    1 10
    输出样例：
    6
 */
import java.util.Scanner;
public class Week72 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        boolean i = false;
        for(; n <= m; n++) {
            if (perfectNum(n)) {
                if (i) {
                    System.out.print(" ");
                }
                System.out.print(n);
                i = true;
            }
        }
        if (!i) {
            System.out.println();
        }
    }
    public static boolean perfectNum(int number) {
        int sum = 0;
        boolean result = false;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (number == sum) {
            result = true;
        }
        return result;
    }
}
