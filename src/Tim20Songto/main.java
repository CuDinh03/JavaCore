package Tim20Songto;

public class main {
    public static void main(String[] args) {
        int flag = 1;
        int count = 0;
        for (int i = 2; i < 1000; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag += 1;
                }
            }

            if (flag == 1) {
                System.out.println(i);
                count += 1;
            }
            flag = 1;
            if (count == 20) {
                break;
            }
        }
    }
}
