//题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程找出1000以内的所有完数。
import java.util.ArrayList;
public class Practise7 {
    public static void main(String[] args) {
        //创建一个动态数组用于存储每个数的因子
        ArrayList divisor = new ArrayList();
        System.out.print("The perfect number in 1000 are:");
        for (int num = 2; num <= 1000; num++) {
            divisor.clear();
            int j = 2;
            while (j <= num / 2) {
                if (num % j == 0) {
                    divisor.add(j);//能被整除的j即为因子
                }
                j++;
            }
            //计算因子之和
            int sumOfDivisor = 1;
            for (int k = 0; k < divisor.size(); k++) {
                sumOfDivisor  += (int) divisor.get(k);
                }
            //因子之和等于数本身的即为完数
            if (num == sumOfDivisor ) {
                System.out.print(num + " ");
            }
        }
    }
}
