import java.util.Scanner;

public class Week622 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String GPSmsg = "";
        String BJTime = "";
        while (!GPSmsg.equals("END")) {
            GPSmsg = in.nextLine();
            if (!GPSmsg.equals("END"))
                BJTime += isMessage(GPSmsg);
        }
        if (!BJTime.equals("")) //防止下标越界
            System.out.print(BJTime.substring(BJTime.length() - 8, BJTime.length()));//只输出最后一个正确信息的时间
        in.close();
    }
    public static String isMessage(String msg) {
        boolean isLocated = false;
        int start = 0, end = 0, xorResult = 0;
        int count = 0;
        start = msg.indexOf('$');
        end = msg.indexOf('C');
        String checkMsg = "";   //存储信息
        String verfy = "";       //存储校验码
        String time = "";       //存储UTC时间信息
        String BJTime = "";
        //if (start != -1 && end != -1 && msg.substring(start, end + 1).equals("$GPRMC"))
        //1.找出$GPRMC语句，并且字段2表示已定位的语句
        if (msg.contains("$GPRMC") && msg.contains(",A,")) {
            end = msg.indexOf('*');
            checkMsg = msg.substring(start + 1, end + 3);
            time += checkMsg.substring(checkMsg.indexOf(',') + 1, checkMsg.indexOf('.'));
            verfy += checkMsg.charAt(end);
            verfy += checkMsg.charAt(end + 1);
            for (int i = 0; i < checkMsg.length() - 3; i++)  //计算校验和
            {
                xorResult = xorResult ^ checkMsg.charAt(i);
                if (checkMsg.charAt(i) == ',') {
                    count++;
                    if (count == 2) {
                        if (checkMsg.charAt(i + 1) == 'A') // 检验字段2的定位状态
                        {
                            isLocated = true;
                        }
                    }
                }
            }
            if ((xorResult % 65536 == Integer.parseInt(verfy, 16)) && isLocated) {
                BJTime += setTime(time);
            }
        }
        return BJTime;
    }
    public static String setTime(String time)  // UTC to BJT
    {
        int hh = 0, mm = 0, ss = 0;
        String BJTime = "";
        hh = Integer.parseInt(time.substring(0, 2)) + 8;
        mm = Integer.parseInt(time.substring(2, 4));
        ss = Integer.parseInt(time.substring(4, 6));
        if (hh < 10)
            BJTime += "0" + hh + ":";
        else if (hh > 24) {
            hh -= 24;
            if (hh < 10)
                //BJTime += "0" + hh +";";
                BJTime += "0" + hh + ":";//2.这里是冒号
                //else BJTime = hh + ";";
            else BJTime = hh + ":";//3.这里是冒号
        } else if (hh == 24)
            BJTime += "00:";
        else BJTime += hh + ":";

        if (mm < 10)
            BJTime += "0" + mm + ":";
        else BJTime += mm + ":";

        if (ss < 10)
            BJTime += "0" + ss;
        else BJTime += ss;
        return BJTime;
    }
}