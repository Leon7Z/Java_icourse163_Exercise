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
import java.util.Scanner;
public class Week71 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.print(number+"=");
        for(int i=2;i<=number/2;++i){
            if(number%i==0){
                number/=i;
                System.out.print(i+"x");
                --i;
            }
        }
        System.out.println(number);
        in.close();
    }
}
