//题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
import java.util.Scanner;
public class Practise6 {
    public static void main(String[] args) {
        System.out.println("Please intpu a string:");
        Scanner inputStr = new Scanner(System.in);
        String str = inputStr.nextLine();
        int strLength = str.length();
        System.out.println(str + strLength);
        char[] strArr = str.toCharArray();
        int letterCount = 0;
        int numCount = 0;
        int spaceCount = 0;
        int otherCount = 0;
        for(int i=0;i<str.length();i++) {
            //判断是否字母
            if (Character.isLetter(strArr[i])) {
                letterCount++;
            }
            //判断是否数字
            else if (Character.isDigit(strArr[i])) {
                numCount++;
            }
            //判断是否空格键
            else if (Character.isSpaceChar(strArr[i])) {
                spaceCount++;
            }
            //以上都不是则认为是其他字符
            else {
                otherCount++;
            }
        }
            System.out.println("Number of letters：" + letterCount);
            System.out.println("Number of numbers：" + numCount);
            System.out.println("Number of space：" + spaceCount);
            System.out.println("Others ：" + otherCount);
    }

}

