package ra;

public class OutputDemo {
    public static void main(String[] args) {
        //Ctrl + F5
        //1. In chuỗi và xuống dòng
        System.out.println("Rikkei Academy chào đón các bạn lớp JV240416");
        //2. In chuỗi và không xuống dòng (con trỏ nằm ở cuối dòng)
        System.out.print("Chúc các bạn thành công");
        //3. System.out.printf("Control String",value1, value2....)
        String studentName = "Phương Thu";
        int age = 26;
        float md1Mark = 4.9F;
        //-- In ra thông tin sinh viên với 1 câu lệnh
        //\n: xuống dòng
        //\t: Lùi vào 1 tab
        System.out.printf("\nSinh viên %s với tuổi %d\tcó điểm module 01 là: %.1f\n", studentName, age, md1Mark);
        //4. System.err.println("String"): In nội dung lỗi
        System.err.println("Đã có lỗi xảy ra trong chương trình");
    }
}
