package lungtung;
import java.util.Scanner;
import java.util.ArrayList;

class Student {
    private String name;
    private int age;
    public static int numberOfStudent = 0;  // Sửa từ NumberOfStudent thành numberOfStudent
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfStudent++;
    }
    
    public void display() {
        if (this.age >= 18) {
            System.out.println(this.name);
        }
    }
    
    // Getter methods (không bắt buộc nhưng tốt để có)
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static int getNumberOfStudent() {
        return numberOfStudent;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        
        // Đọc dữ liệu cho đến khi hết
        while (sc.hasNextLine()) {
            String name = sc.nextLine().trim();
            
            // Kiểm tra nếu dòng tên rỗng (kết thúc input)
            if (name.isEmpty()) {
                break;
            }
            
            // Kiểm tra xem có tuổi để đọc không
            if (!sc.hasNextInt()) {
                break;
            }
            
            int age = sc.nextInt();
            sc.nextLine(); // Đọc ký tự newline sau số
            
            // Tạo đối tượng Student
            Student student = new Student(name, age);
            students.add(student);
        }
        
        // Hiển thị tên của các student có tuổi >= 18
        for (Student student : students) {
            student.display();
        }
        
        // In tổng số đối tượng đã tạo
        System.out.println(Student.numberOfStudent);
        
        sc.close();
    }
}
