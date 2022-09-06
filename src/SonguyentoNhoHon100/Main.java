package SonguyentoNhoHon100;

public class Main {
    public static void main(String[] args) {
        int flag = 1;

        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag += 1;
                }
            }

            if (flag == 1) {
                System.out.println(i);

            }
            flag = 1;
        }
    }
}
