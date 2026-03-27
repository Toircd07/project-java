package lungtung;
import java.util.Scanner;

class Inventor{
    String name ;
    String field ;
    String nationality ;
    public Inventor(String name, String field, String nationality){
        this.name = name ;
        this.nationality = nationality;
        
        this.field = field ;
    }
    public String getName(){
        return name ;
    }
    public String getNationality(){
        return nationality ;
    }
    public String getField(){
        return field ;
    }
    public String toString() { 
        return  "Inventor[name="+name+", field="+field+", nationality="+nationality+ "]";
    }    
                   
}

class Patent{
    String title;
    int year ;
     public Inventor inventor ;
    public Patent(String title , int year, Inventor inventor ){
        this.title = title ;
        this.year = year ;
        this.inventor = inventor ;
    }
   
    public String toString() { 
        return "Patent[title="+title+ ", year=" +year+ ", "+inventor+"]";
    }     
    
}
public class Haha{
    	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	String field = sc.nextLine();
	String nationality = sc.nextLine();
	String title = sc.nextLine();
	int year = sc.nextInt();
	if (nationality.equals("VN") || nationality.equals("INT")) {
	Inventor inventor = new Inventor(name ,field, nationality);
	Patent patent = new Patent( title , year , inventor );
	
        System.out.println(patent.toString());
        
	}
     else {
            System.out.println("Invalid nationality. Only 'VN' or 'INT' allowed.");

        }
        sc.close();
    }
}
	