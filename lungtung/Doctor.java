package lungtung;
class Bacsi {
// thuoc tinh
    private String name ="Cuong";
    private String khoa = "TMH";
    private String benhvien = "Y Ha Noi";
// phuong thuc   // defaul cung lop cung goi
// this la doi tuong duoc goi

public String getName(){
    return name ;
}
public String getKhoa(){
    return khoa ;
}
public String getBenhvien(){
    return benhvien ;
}
public void hit(Bacsi d){

} 
}
public class Doctor {
   public static void main(String[] args) {
    Bacsi cuong = new Bacsi();
    System.out.println("Ten bac si: " + cuong.getName());
    System.out.println("Khoa lam viec: " + cuong.getKhoa());
    System.out.println("Benh vien: " + cuong.getBenhvien());
    Bacsi ban = new Bacsi();
    cuong.hit(ban);
   }
} 

    

