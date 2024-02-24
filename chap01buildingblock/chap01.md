Không giống như các ngôn ngữ lập trình hướng thủ tục khác (các quy tắc theo kiểu thuận tự nhiên, nên dễ tưởng tưởng, dễ hiểu hơn) thì Java là ngôn ngữ lập trình hướng đối tượng, các quy tắc không còn thuận tự nhiên nữa, mà có xu hướng con người (hướng nhân tạo), quản lý chặt chẽ hơn.

Các quy tắc sẽ giúp chúng ta xây dựng các dự án lớn dễ hơn. Nhưng vô tình, nó lại làm chúng ta cảm thấy khó khăn hơn khi mới học.
Chúng ta không cần lo lắng vì đã có rất nhiều bằng chứng về cái kết đẹp nếu bạn làm chủ ngôn ngữ lập trình Java rồi.

Đừng quên follow repo này để làm chủ hoàn toàn ngôn ngữ lập trình Java nhé.

### Bắt đầu:   
Tất cả các file Java đều được tổ chức theo dạng Class, chứ không bừa bãi như python, C, hay JavaScript nữa.

Mỗi class là một bộ khung để từ đó tạo ra các đối tượng từ khung đó.    
Bộ khung gồm có các thuộc tính để mô tả trạng thái cho các đối tượng được tạo ra.    
Chưa hết, trong bộ khung đó còn có cách phương thức (gọi là các hành vi), tác dụng là thực hiện các hành vi làm thay đổi trạng thái của đối tượng được tạo ra đó.    

> Thuộc tính hay còn gọi là đặc điểm, và thực chất nó là các biến (variable), có vậy thôi, không kinh khủng gì cả.
> Các method hay còn gọi là hành vi, chính là các hàm, trong ngôn ngữ lập trình khác gọi làm hàm, hay thủ tục, thì chính giống nó, ở Java nó là method (phương thức.)

Một chương trình Java được thực thi bắt đầu từ phương thức main (main method).
Hầu hết các chương trình đều định nghĩa main method như sau:   
`public static void main(String[] args)`   
Nhưng tất nhiên nếu bạn viết ngược lại chỗ định nghĩa tham số (parameter) cũng vẫn ok.
Bởi vì đó là kiểu dữ liệu mảng (Array) và Java cho phép viết theo 2 cách đó.
Tức là `public static void main(String args[])` thì vẫn đúng.   
Khi chúng ta thực thi một chương trình java thì có thể truyền vào các đối số (argument).
Các đối số này được tập hợp lại thành một mảng (Array) và gán giá trị cho tham số `args`.
Tức là, ta thực thi chương trình bằng lệnh sau:
>java Hello 1 2 3   

Khi đó, phương thức main của chương trình sẽ nhận 1 2 3, tạo thành một mảng và gán cho args. Mảng
args sẽ có 3 phần tử, thử in ra sẽ thấy.
<pre>
public class Hello{
    public static void main(String args[]){
    System.out.println(args[0]);
    System.out.println(args[1]);
    System.out.println(args[2]);
    }
}
</pre>
>Kết quả là:      
> 1   
> 2    
> 3

Nhớ là trong lập trình, phần từ đầu tiên ủa một tập hợp thường bắt đầu từ vị trí 0.
Khi chúng ta tạo ra các thư mục (folders) để chứa nhiều file java, thì folder đó được gọi là các packages.
Nếu chúng ta muốn truy cập đến thông tin của các class nằm trong package khác (không phải package hiện tại), thì cần phải sử dụng lệnh import để thêm class đó vào.   
Ví dụ: muốn sử dụng class Array thì phải import nó vào như sau.
>import java.util.Arrays;

Hoặc muốn import tất cả class của một pakage, ta dùng dấu * như sau:
>import java.util.*     

Bên trên là import tất cả class của package util
Có một package siêu đặc biệt là `java.lang`, ta có thể sử dụng thoải mái class của nó mà không cần import.
Java cho phép điều đặc biệt đó, lý do là gì không quá quan trọng.

### Về thành phần, thứ tự các các thành phần trong một file Java?

Nếu file java nằm trong thư mục nào, thì thư mục đó gọi là package của nó, phải khai báo. 
`Thư mục gốc thì không tính là package, thư mục gốc là thư mục dự án của chúng ta, chỗ mà chúng ta đứng đó để thực hiện lẹnh javac hoặc java để compile và run chương trình.`   
Nếu có pakage thì phải khai tên nó ra ngay từ đầu, dòng code đầu tiên phải khai tên package. Lệnh:
>package bai1      

`bai1` chính là tên package. Nếu file java nằm ở thư mục gốc thì không có package, như vậy là không cần khai báo.     
Tiếp theo: Nếu muốn sử dụng các class từ package thì phải thêm các lệnh `import` còn không sử dụng thì thôi.      
Tiếp theo: Là khai báo tên class (bắt buộc, tên phải giống tên file). Trường hợp có nhiều class trong một file thì class nào là public thì phải giống tên file.     
Tiếp theo: Bên trong class là các thuộc tính và phương thức, thứ tự tuỳ ý, lung tung. Nhưng thường để các thuộc tính ở trên, các phương thức ở dưới cho chuyên nghiệp.    


