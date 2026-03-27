

package lungtung;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;  

public class ArL {
    public static void main(String[] args) {
        // khai báo list
        ArrayList<Integer> lst = new ArrayList<>();
        // khai báo list với kích thước ban đầu 5
        ArrayList<Integer> lst2 = new ArrayList<>(5);
        // khai báo list với các phần tử ban đầu
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1,2,3,4,5));

        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);

        ArrayList<String> lst4 = new ArrayList<>();
        // add() thêm phần tử vào cuối list
        lst4.add("6");
        lst4.add("7");
        lst4.add("8");
        // add(index, element) thêm phần tử vào vị trí index
        lst4.add(1,"9");
       System.out.println("Lst4" +lst4);
       // get(index) lấy phần tử tại vị trí index
        System.out.println(lst4.get(2));
        // set(index, element) thay thế phần tử tại vị trí index bằng element
        lst4.set(2,"10");
        System.out.println("Lst4 sau khi set: " + lst4);
        // remove(index) xóa phần tử tại vị trí index
        lst4.remove(1);
       // size() trả về số lượng phần tử trong list
        System.out.println("kich thuoc lst4: " + lst4.size());
        // remove(1 phan tu dc chi dinh) remove(Integer.valueOf(x))
        ArrayList<Integer> lst5 = new ArrayList<>(List.of(1,2,3,4,5));
        lst5.remove(Integer.valueOf(3)); 
        System.out.println("Lst5 sau khi remove: " + lst5);
        //  contain(x) kiểm tra xem lst5 có chứa phần tử x không
        boolean kt = lst5.contains(2); 
        System.out.println("lst5 co chu phan tu 2 " + kt);
        // Collection.sort(list) sắp xếp phần tử trong list theo thứ tự tăng dần
        // Collections.reverse(list) đảo ngược thứ tự phần tử trong list
        // duyệt phần tử trong list bằng for-each
        for(int vl : lst5) {
            System.out.println(vl);
        }
    }                 
}
