//题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
public class Practise2 {
    public static void main(String[] args) {
        System.out.print("The narcissistic numbers are : ");
        //分别定义个十百位计算立方和，取立方和等于三位数本身数值大小的数即为水仙花数
        for (double hundredsPlace = 1; hundredsPlace < 10; hundredsPlace++) {
            for (double tensPlace = 0; tensPlace < 10; tensPlace++) {
                for (double onesPlace = 0; onesPlace < 10; onesPlace++) {
                    int sumOfCubes = (int)Math.pow(onesPlace,3) + (int)Math.pow(tensPlace,3) + (int)Math.pow(hundredsPlace,3);
                    if (sumOfCubes == hundredsPlace * 100 + tensPlace * 10 + onesPlace) {
                        System.out.print(sumOfCubes + " ");
                    }
                }
            }
        }
    }

}