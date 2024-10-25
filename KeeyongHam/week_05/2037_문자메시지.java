package week_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        String str[][] = {
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"},
                {"j", "k", "l"},
                {"m", "n", "o"},
                {"p", "q", "r", "s"},
                {"t", "u", "v"},
                {"w", "x", "y", "z"}
        };

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] strNum = bf.readLine().split(" ");
        String[] inStr = bf.readLine().toLowerCase().split("");

        int p = Integer.parseInt(strNum[0]);
        int w = Integer.parseInt(strNum[1]);

        int result = 0;
        int lastNum = -1; //전에 눌렀던 숫자 찾기 위함
        for (String s : inStr) {

            if (s.equals(" ")) {
                lastNum = -1;
                result += p;
                continue;
            }

            boolean isFlag = false;

            for (int i = 0; i < str.length; i++) {
                for (int j = 0; j < str[i].length; j++) {
                    if (str[i][j].equals(s)) {

                        if (lastNum == i) {
                            result += w;
                        }

                        result += (j + 1) * p;
                        lastNum = i;
                        isFlag = true;
                        break;
                    }
                }

                if (isFlag) {
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
