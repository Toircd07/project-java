package lungtung.bankstu;

import java.time.LocalDate;

public class Student {
     String name;
     String address;
     String studentID;
     LocalDate dateOfBirth;
     private BankAccount accountBank;
     public Student(String name, String address, String studentID,
        LocalDate dateOfBirth, BankAccount bankAccount) {
            this.name = name;
            this.address = address;
            this.studentID = studentID;
            this.dateOfBirth = dateOfBirth;
            this.accountBank = bankAccount;

        }
        public void payHocPhi(double amount) {
            if (accountBank.debit(amount)) {
                System.out.println("Hoc Phi Tra: " + amount);
            } else {
                System.out.println("So du khong du!");
            }
        }
        
        public void showInfo() {
            System.out.println("Student: " + name);
            System.out.println("ID: " + studentID);
            System.out.println("Balance: " + accountBank.getBalance());
        }
    }

    



