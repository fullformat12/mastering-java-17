Không giống như các ngôn ngữ lập trình hướng thủ tục khác (các quy tắc theo kiểu thuận tự nhiên, nên dễ tưởng tượng, dễ hiểu hơn), thì Java là ngôn ngữ lập trình hướng đối tượng, các quy tắc không còn thuận tự nhiên nữa, mà có xu hướng con người (hướng nhân tạo), quản lý chặt chẽ hơn.

Các quy tắc sẽ giúp chúng ta xây dựng các dự án lớn dễ hơn. Nhưng vô tình, nó lại làm chúng ta cảm thấy khó khăn hơn khi mới học.
Chúng ta không cần lo lắng, vì đã có rất nhiều bằng chứng, về cái kết đẹp, cho những người đã làm chủ ngôn ngữ lập trình Java.

Đừng quên follow repo này, để làm chủ hoàn toàn ngôn ngữ lập trình Java nhé!

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

### Cách chạy (thực thi) một chương trình Java     
Chúng ta có 2 cách:     
#### sử dụng lệnh java     
> java Hello.java 1 2 3   

Trường hợp này, chúng ta chạy trực tiếp, không có file Hello.class được tạo ta. Giống như chúng ta chạy thông dịch chương trình php hay python    
#### biên dịch ra bytecodes rồi mới chạy chương trình   
> javac Hello.java  

`Lệnh này sẽ biên dịch (compile) file Hello.java, tức là từ file Hello.java => tạo ra file Hello.class (trong đó chữa các dòng mã loằng ngoằng gọi là bytecode)`

>java Hello 1 2 3     

`Sau khi biên dịch, chúng ta chạy chương trình bằng lệnh java, lúc này file Hello không cần .java hay .class, và nó sẽ thực thi file Hello.class    `

#### Đóng gói chương trình (packaging)    
Bắt đầu chuyên nghiệp hơn nè, lúc đầu chúng ta tạo file Hello.java ở đâu, khi biên dịch bằng lệnh javac thì file Hello.class sẽ được tạo ra tại chỗ.    
Nhưng nếu chúng ta muốn nó gọn gàng hơn, chúng ta cần phải quy hoạch nó, chúng ta tạo ra các thư mục mang ý nghĩa giống với chức năng của nó, và trong đó chỉ đển những file đã biên dịch (file .class) chứ không để lẫn lộn cà file code (.java) nữa.    

Lúc này ta có tuỳ chọn -d (-d option) để chỉ định thư mục chứa file .class
>javac -d target/classes Hello.java   

`Lúc này file Hello.java sẽ được biên dịch ra file Hello.class và file class sẽ được đưa vào thư mục target/classes   `    
#### Sử dụng classpath    
Khi dự án của chúng ta có nhiều class, tức là nhiều file java, và file java chính của chương trình (chứa phương thức main) cần sử dụng tới các class khác.    
Để làm được điều này chúng ta phải liên kết các file java liên quan với file chính của chương trình bằng cách gắn chúng vào cái gọi là classpath (kiểu như classpath là một cái dây, file java chính nằm ở đầu dây, như một hạt, các class khác sẽ giống như các hạt khác gắn vào dây đó, tạo thành chuỗi hạt, lúc đó chúng có thể kết nối với nhau, có cơ hội truy cập đến nhau)    
Nếu không có classpath thì file java chính sẽ không biết các file kia ở đâu mà tìm, đó là lý do cần classpath    
Cách thực hiện:    
>java -cp target/classes chap01.Hello     

>java -classpath target/classes chap01.Hello    

>java --class-path target/classes chap01.Hello     

Cả 3 cách viết trên là như nhau, chúng ta có thể chọn một trong 3 cách trên, tức là sử dụng tuỳ chọn `-cp` hoặc `-classpath` `--class-path`     
Cả 3 lệnh trên đều có ý nghĩa là: gắn tất cả các file đã biên dịch trong thư mục target/classes và chuỗi classpath, và thực thi file Hello ở trong thư mục (package) chap01, lúc này đã gắn các class ở thưc mục target/classes vào rồi.   
#### Sử dụng các biến số (variables)    
Có 3 loại biến số:
+ <b>Biến cục bộ (local variable)</b>, là các biến được định nghĩa trong một block, tức là trong cặp { ... }     
+ <b>Biến của đối tượng (instance variable)</b>, là các thuộc tính (attributes, properties) của class, chúng hoạt động khi một đối tượng được tạo ra (là các biến không được định nghĩa với từ khoá static)    
+ <b>Biến của Lớp (class variable)</b>, khác với instance variable duy nhất là chúng có chứa từ khoá static khi định nghĩa (vì thế ta có thể sử dụng các biến này mà không cần tạo đối tượng)       

###### Vòng đời của chúng nó:    
+ <b>Local variable:</b> được sinh ra từ dòng lệnh khởi tạo cho đến khi toàn bộ block được thực thi xong.
+ <b>Instance variable:</b> được sinh ra từ khi đối tượng được khởi tạo cho đến khi đối tượng được bộ dọn rác giải phóng.
+ <b>Class variable:</b> thằng này sống dai nhất, nó được sinh ra từ khi chương trình bắt đầu chạy cho đến khi tắt chương trình mới chịu chết. Bọn này giúp truy cập thông tin nhanh hơn, nhưng rất tốn bộ nhớ, nên là thông tin nào thường xuyên (được sử dụng nhiều) thì mới cho nó là static (là class variable) nhé.

##### Chú ý về việc khai báo, khởi tạo và sử dụng biến       
- Các biến cục bộ cần phải khởi tạo giá trị trước khi sử dụng, nếu không trình biên dịch sẽ ý kiến ý có ngay (nó sẽ complaint)     
- Các biến của đối tượng thì không cần khởi tạo cũng được, nó sẽ được gán cho một giá trị mặc định.
##### Đặt tên cho biến (naming for variable)

-Chúng ta có thể sử dụng các chữ cái, ký tự tiền của các nước, dấu _ và số để đặt tên cho biến     
Ví dụ:    
>var nam;  
>var $nam;     
> var nam123    
> var nam$_123;   
> var a; # hợp lệ    
> var _; # không hợp lệ

`Chú ý: nếu tên biến có chứa số thì nó không được phép đứng ở vị trí đầu tiên, nếu biến số chỉ có một ký tự thì không được phép là dấu _ (gạch dưới).`     
#### var : kiểu dữ liệu mới?     
Không phải!    
`var` được dùng để khai báo biến, đặt trước biến giống như int, String,...    
Nhưng `var` không phải kiểu dữ liệu mới, nó chỉ là một cách khai báo biến tổng quát. Khi sử dụng var để khai báo biến thì trình biên dịch sẽ sử dụng trí thông minh của nó để đoán xem, giá trị khởi tạo của nó là kiểu gì thì gán con `var` là kiểu đó.    
Ví dụ:   
>var ten = "Nam";     
Lúc này var là kiểu String
>var tuoi = 12;     
Lúc này var là kiểu int.     

`Chú ý: khai báo biến theo var chỉ dành cho biến cục bộ (local variable), bạn cố tình dùng cho kiểu biến khác thì compile nó cũng không chịu.    
Và bởi vì nó cần dữ liệu để compile có thể đoán mò xem var là kiểu gì, nên sử dụng var khai báo biến thì cần khởi tạo, nếu không khởi tạo, thì nó cũng sẽ không chịu, nó complaint ngay lập tức.`       
Thêm một chút: `var` cũng chẳng phải từ khoá của java như kiểu `static` nên chúng ta có thể dùng từ `var` để đặt tên cho cái gì cũng được.     
Kể cả là:
>public void var(){
> 
>       var var = "var";
> 
>}    

Trông rất ngớ ngẩn, nhưng trình biên dịch vẫn cho là ok, được phép sử dụng. Tất nhiên chúng ta thông minh không làm việc ngớ ngẩn như thế.    

Chưa hết sự ngớ ngẩn đâu, tiếp theo là bộ dọn giác Garbage Collection
### Garbage Collection (bộ dọn rác)    
Trong java, bộ dọn rác được dùng để thu dọn, làm sạch các đối tượng tạo ra mà không sử dụng, hoặc các đối tượng đã sử dụng nhưng xong rồi (hết tác dụng). Nó hoạt động một cách tự động, theo chỉ đạo của JVM chứ không tuân thủ yêu cầu của người lập trình.     
Tức là, java cho phép sử dụng lệnh  System.gc(); để kích hoạt bộ dọn rác, nhưng mà có chắc chắn nó thực hiện không thì chịu. JVM sẽ chỉ đạo nó chứ không phải lập trình viên, tất nhiên có thể một chút tỉ lệ ưu tiên cho người may mắn.    




