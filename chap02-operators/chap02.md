### Operators - các toán tử trong ngôn ngữ lập trình Java
Ở phần này, chúng ta sẽ cùng tìm hiểu, để hiểu thật rõ các loại toán tử được sử dụng trong ngôn ngữ lập trình java (nó khá giống với các phép tính trong môn toán. Nhưng ở đây có nhiều loại phép tính hơn).

Java hỗ trợ 3 loại toán tử cho người lập trình thỏa sức tính toán đó là: unary, binary, ternary (Toán tử một ngôi, toán tử 2 ngôi, toán tử 3 ngôi).

### Operator Precedence (quyền ưu tiên)
Cũng giống như các phép tính trong môn Toán của chúng ta, nếu như biểu thức chỉ có một phép tính thì không cần quan tâm thứ tự, cứ thực hiện phép tính là xong.    
Nhưng nếu có nhiều phép tính trong một biểu thức, thì chúng ta cần có một quy tắc ưu tiên, cái nào sẽ thực hiện trước, cái nào thực hiện sau?     
Để làm gì?     
Để nhiều người có chung một quy tắc, chung quan điểm, để có thể hiểu được các biểu thức người khác viết ra.
Chúng ta đã biết, thế giới có hàng trăm triệu người lập trình java, nếu không có quy tắc chung thì làm sao ta có thể hiểu biểu thức của người khác.

| Operator name ( tên toán tử)                              | Symbols (ký hiệu) và ví dụ                         | Evaluation (Đánh giá, xét sự ưu tiên) |
|-----------------------------------------------------------|----------------------------------------------------|---------------------------------------|
| Post-unary operators                                      | a++,  a--                                          | Trái sang phải                        |
| Pre-unary operators                                       | ++a, --a                                           | Trái sang phải                        |
| Other unary operators                                     | -, !, ~, +, (type)                                 | Phải sang trái                        |
| Cast                                                      | (Type) reference, ví dụ: (int) age                 | Phải sang trái                        |
| Multiplication/division/Modulus (nhân/ chia/ chia lấy dư) | * , / , %                                          | Trái sang phải                        |
| Addition/ subtraction (cộng / trừ)                        | + , -                                              | Trái sang phải                        |
| Shift Operator                                            | <<, >>, >>>                                        | Trái sang phải                        |
| Relational operators                                      | <, >, <=, >=, instance of                          | Trái sang phải                        |
| Equal to/ not equal to                                    | ==, !=                                             | Trái sang phải                        |
| Logical AND                                               | &                                                  | Trái sang phải                        |
| Logical exclusive OR                                      | ^                                                  | Trái sang phải                        |
| Logical inclisive OR                                      | \|                                                 | Trái sang phải                        |
| Conditional AND                                           | &&                                                 | Trái sang phải                        |
| Conditional OR                                            | \|\|                                               | Trái sang phải                        |
| Ternary operators                                         | boolean expression ? exp1 : exp2                   | Phải sang trái                        |
| Assignment operators                                      | =, +=, -=, *=, /=, %=, &=, ^=, \|=, <<=, >>=, >>>= | Phải sang trái                        |
| Arrow operator                                            | ->                                                 | Phải sang trái                        |
Đây là bảng quy tắc cần học thuộc, tất nhiên là thực hành nhiều để thuộc là một cách hay. Nó sẽ giúp bạn vượt qua các bài test khi phỏng vấn hoặc thi chứng chỉ lập trình java.   

### Hiểu rõ hơn toán tử tăng giảm (increment and decrement operator) ++, --    
| Operator                   | Example | Description                                                                       |
|----------------------------|---------|-----------------------------------------------------------------------------------|
| pre-increment (tăng trước) | ++a     | Tăng a lên 1 đơn vị sau đó trả về giá trị mới của a                               |
| pre-decrement (giảm trước) | --b     | Giảm giá trị của b 1 đơn vị, sau đó trả về giá trị mới của a                      |
| post-increment (tăng sau)  | c++     | Tăng c thêm 1 đơn vị nhưng biểu thức trả về giá trị cũ của c (giá trị chưa tăng)  |
| post-decrement (giảm sau)  | d--     | Giảm d một đơn vị nhưng biểu thức lại trả về giá trị cũ của d (giá trị chưa giảm) |
### Casting Values (ép kiểu dữ liệu)