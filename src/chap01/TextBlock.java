package chap01;

public class TextBlock {
    public static void main(String[] args) {
        var text = """
                Hello
                  World!""";
        System.out.println(text);
        var s = """
                Hello\sworld
                """;
                System.out.println(s); // \s sẽ tạo ra khoảng trắng
        var t = """
                Hello \
                world
                """;
        System.out.println(t);  // \ để nối dòng dưới vào dòng trên
    }
}