package lungtung.bankstu;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Hoang Van Toi", 5000.0);

        Student student = new Student(
            "Hoang Van Toi",
            "Thanh Hoa",
            "B22DCVT470",
            LocalDate.of(2004, 10, 07),
            acc );

    student.showInfo();
    student.payHocPhi(4000);
    student.showInfo();
}
}


