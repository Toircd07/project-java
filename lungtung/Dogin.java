package lungtung;


class Dog {
// thuoc tinh
    private String name ;
    private String tuoi ;
    private String loai ;  //#
    private static int count ;
public Dog(String name, String tuoi, String loai){
    this.tuoi= tuoi;
    this.name= name;
    this.loai= loai;
    count += 1 ;
}
public String getName(){
    return name ;
}
public String getTuoi(){
    return tuoi ;
}
public String getLoai(){
    return loai ;
}
public String printinFo(){
    return  count + "---" + name +"---" + tuoi + "---" + loai ;
}

}
public class Dogin{
   public static void main(String[] args) {
    Dog dog = new Dog("Goid","2","Husky");
    System.out.println(dog.printinFo());
    Dog dog2 = new Dog("Red","15","becgie");
    System.out.println(dog2.printinFo());
   }
}
   


    

