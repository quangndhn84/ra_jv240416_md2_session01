package ra;

public class CastingDemo {
    public static void main(String[] args) {
        //implicit: ngầm định - Ép từ kiểu dữ liệu thấp lên cao
        //10: int
        //number1: float
        float number1 = 10;
        //explicit: tường mình (người lập trình ép) - từ cao xuống thấp
        //8.5: double
        //number: float
        float number2 = 8.5F;
        int number3 = (int)5.2;
    }
}
