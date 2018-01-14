/*题目内容：
        你的程序要读入一行文本，其中以空格分隔为若干个单词，以‘.’结束。你要输出这行文本中每个单词的长度。这里的单词与语言无关，可以包括各种符号，比如“it's”算一个单词，长度为4。注意，行中可能出现连续的空格。

        输入格式:
        输入在一行中给出一行文本，以‘.’结束，结尾的句号不能计算在最后一个单词的长度内。

        输出格式：
        在一行中输出这行文本对应的单词的长度，每个长度之间以空格隔开，行末没有最后的空格。

        输入样例：
        It's great to see you here.

        输出样例：
        4 5 2 3 3 4*/
import java.util.Scanner;
public class Week61 {
    public static void main(String[] args) {
        String str = "";
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        in.close();
        String str1 = str.trim();
        String op = "";
        if (!str1.isEmpty()) {
            String[] tt = str1.split("\\s+");
            for (String s : tt) {
                if (!s.contains(".")) {
                    op = op + s.length() + " ";
                } else {
                    op = op + s.indexOf(".") + "";
                    break;
                }
            }
            System.out.print(op.trim());
        }
    }
}
