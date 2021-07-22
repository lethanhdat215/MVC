BỘ CÂU HỎI SPRING

STT	Câu hỏi
Tổng quan Spring MVC
1	Vẽ và trình bày cách Spring MVC xử lý request
2	Trình bày cơ chế Dependency Injection
-	Là cơ chế điều khiển IoC, được cung cấp ,điều khiển bởi container hoặc framework
-	Tiêm các object vào trong object khác bởi container hoăc framework
3	Có bao nhiêu cách để thực hiện Dependency Injection? Trình bày?
-	Các cách để thực hiện Dependency Injection :
-	Constructor injection : được cung cấp thông qua constructor
-	Setter injection : được truyền vào 1 class thông qua setter method
-	Interface injection : cung cấp 1 interface chứa method Inject, các client triển khai Interface mà có 1 setter method dành cho việc nhận dependency và truyền nó vào class thông qua Inject của Interface 
4	Framework là gì ? Framework khác Library chỗ nào ?
-	Framework là : Là các ứng dụng phần mềm có tình trừu tượng, cung cấp các tính năng chung.
-	Framework khác Libarary :  
-Framework: Framework nắm quyền điều khiển(control)
             -Library :Ứng dụng nắm quyền điều khiển

5	Spring Framework là gì ?
-	Là 1 framework phát triển các ứng dụng java
6	Lợi ích của Spring Framework?
-	Tạo các ứng dụng  có hiệu năng cao , dễ kiểm thử , sử dụng lại code 
7	Nguyên lý đảo ngược quyền điều khiển (Inversion of Control) là gì ?
-	Cho phép framework nắm quyền điều khiển luồng thực thi của hệ thống và gọi các mã nguồn khác
8	Giải thích IoC? Lợi ích của IoC ?
-	IoC là : 1 nguyên lý trong phát triển phần mềm, Việc điều khiển các đối tượng hoặc các thành phần được thực hiện bởi framework hoặc container
-	Lợi ích :  Tách rời việc thực thi và triển khai
-	Dễ chuyển đổi giữa các implementation
-	Dễ phân tách module 
-	Dễ kiểm thử
9	Bean là gì?
-	Là các object trong spring framework , khởi tạo thông qua spring container
10	Trong Spring có bao nhiêu Bean Scope?
-	Singleton 
-	Prototype 
-	Request 
-	Session
-	Global- Session 
11	@autowire là gì?
-	Là annotation dùng để tiêm các đối tượng
12	@component có ý nghĩa gì?
-	Đánh dấu cho spring biết class đó là bean
Spring Controller
13	Trình bày ý nghĩa của Controller
- là đối tượng nhận và xử lý các request
14	Trình bày ý nghĩa của ModelAndView Interface
-	Là sự kết hợp của truyền dữ liệu và view.
15	Trình bày ý nghĩa của ModelMap Interface
-	Truyền dữ liệu từ controller sang view. ModelMap như 1 tham số trong method của controller
16	Trình bày ý nghĩa của ViewResolver Interface
-	Là các object lấy các object view cho 1 hành động và vị trí cụ thể
17	Định nghĩa URI với các phương thức khác nhau như GET, POST, PUT, PATH, DELETE
URI : Ánh xạ tới các request bằng cách sửu dụng các mẫu đại diện
GET : Dùng để lấy thông tin từ sever theo URI đã cung cấp
POST:Gửi thông tin tới server thông qua các biểu mẫu http
PUT:Ghi đè tất cả thông tin của object với những gì được gửi lên
PATH:Khai báo các biến đường dẫn sử dụng regex
DELETE:Xóa tài nguyên trên sever
18	Phân biệt POST với GET
-	Post bảo mật hợn ,thực thi chậm hơn, server thực thi và trả kết quả về cho client, nên dùng post khi dữ liệu luôn được thay đổi
-	Get không bảo mật,thực thi nhanh ,dùng khi dữ liệu ít thay đổi
19	Phân biệt POST với PUT
-	POST: Để tạo tài liệu hoặc bất kỳ tài nguyên nào khác
-	PUT:Để cập nhật tài liueej đã tạo hoặc bất kỳ tài nguyên nào khác
20	Thao tác với form trong ứng dụng Spring MVC
21	@RequestMapping làm gì?
-	Dùng để ánh xạ các URL tới các handler method của controller
22	Trình bày cơ chế Data Binding
-	Kết nối dữ liệu của bean đặt trong model đến các điểu khiển trên form
23	Thuộc tính consumes trong các Request Mapping là gì ?
-	Consumes : chấp nhận các request có content-type giống với giá trị khai báo bên trong consumes
Thymeleaf
24	Template là gì? Template Engine là gì? Thymeleaf là gì?
25	Sử dụng lặp trong Thymeleaf như thế nào? Sử dụng điều kiện trong Thymeleaf như thế nào?
Data Binding
26	Data Binding là gì?
27	Formatter là gì ? Converter là gì ?
ORM và JPA
28	ORM là gì ?
29	JPA là gì? Spring Data JPA là gì ?
30	Hibernate là gì ? Hibernate làm gì với database
31	Liệt kê một số annoutation của hibernate?
32	Entity là gì?
33	Persistence Context & Entity Manager là gì?
34	Câu lệnh truy vấn động là gì? Câu lệnh truy vấn tĩnh là gì?
35	Trạng thái của Entity bao gồm những gì?
36	Có bao nhiêu loại mapping trong Hibernate?
37	SessionFactory là gì?
38	Liệt kê ba trạng thái của đối tượng trong hibernate?
Validation
39	Validation dữ liệu là gì?
40	Trình bày cách triển khai validate dữ liệu trong Spring
41	Binding Result là gì?
AOP
42	AOP là gì? AOP gồm những yếu tố nào?
43	Các loại Advice?
44	JoinPoint là gì?
45	Nêu cách triển khai AOP mà bạn dùng trong dự án
46	Xử lý ngoại lệ trong Spring Web MVC như thế nào?
Session & Cookie
47	Cookie là gì?
48	Phân biệt Session và Cookie
49	Nêu cách triển khai Session mà bạn dùng trong dự án
Web Service
50	Web Service là gì? Lấy ví dụ về web service
51	Phân biệt Web Service và Web truyền thông
52	REST là gì? RESTful là gì?
53	jQuery là gì? Ajax là gì?
54	Nêu ví dụ về cách bạn triển khai Ajax trong dự án của bạn
55	@RequestHeader và @ResponseHeader có ý nghĩa gì
I18N
56	I18N và I10N là gì?
57	Nêu cách triển khai I18N và I10N trong dự án Spring
58	Interceptor là gì?
Bảo mật
59	Bảo mật là gì? Cơ chế bảo mật trong Spring như thế nào?
60	Authentication là gì ? Authorization là gì ?
61	Liệt kê các cơ chế xác thực
62	CRSF là gì
63	CORS là gì
Spring Boot
64	Spring Boot là gì?
65	Sự khác nhau giữa SpringBoot và SpringMVC là gì?
66	Trong trường hợp bạn muốn tuỳ chỉnh cấu hình cho Spring Boot chỉ tìm kiếm các bean trong một package nhất định
67	Cấu hình cho Spring Boot Tìm kiếm các Bean ở nhiều package khác nhau bằng cách nào?
68	Trình bày Spring Security? @EnableWebSecurity làm gì?
69	Trình bày Spring Boot JPA? Cài đặt?
70	Để sử dụng interface JpaRepository cần cung cấp những thông tin nào? 
71	Bạn có biết annotation @ConfigurationProperties? Trình bày?
