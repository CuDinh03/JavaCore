import org.junit.jupiter.api.Test;

public class MyNumber {
    int value;


    public MyNumber(int value) {
        this.value = value;
    }
    @Test
    public void test(MyNumber number) {
        MyNumber newNumber = new MyNumber(3);
        number = newNumber;
        number.value = 4;
    }

    public static void main(String[] args) {
        MyNumber x = new MyNumber(1);
        System.out.println(x.value);
        MyNumber y = new MyNumber(2);
        System.out.println(y.value);
        x.test(y);
        System.out.println(x.value);
        System.out.println(y.value);

    }
}