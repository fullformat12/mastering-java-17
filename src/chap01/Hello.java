package chap01; // 1. Vì class Bai01 nằm trong thư mục chap01 nên chap01 là package và phải khai báo.
import java.util.Arrays; // 2. vì có sử dụng class Array để xắp xếp và duệt nên cần import
public class Hello {
    // Ta đứng ở thư mục src và thực hiện lệnh compile: javac chap01/Bai01.java
    // Sau đó thực hiện lệnh run: java chap01/Bai01 2 9 8
    // kết quả sẽ in ra 3 dòng theo thứ tự 2 8 9
    public static void main(String[] args) {
        Arrays.stream(args)
                .sorted()
                .forEach(System.out::println);
    }
}
