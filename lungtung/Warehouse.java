package lungtung;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Warehouse {
    
    private HashMap<String, Integer> stocks = new HashMap<>();
    public void addProduct(String product, int price, int stock){
        stocks.put(product, stock);
    }
    public int price(String product) {
        return -99;
    }
    public int stock(String product) {
        if (stocks.containsKey(product)) {
            return stocks.get(product);
        }
        return 0;
    }
    public boolean take(String product) {
        if (stocks.containsKey(product) && stocks.get(product) > 0) {
            stocks.put(product, stocks.get(product) - 1);
            return true;
        }
        return false;
    }
}
public class Main
{
	public static void main(String[] args) {
		Warehouse wh = new Warehouse();
		wh.addProduct("coffee",5, 1);
		System.out.println("stock:");
        System.out.println("coffee: " + wh.stock("coffee"));
        System.out.println("sugar: " + wh.stock("sugar"));

        System.out.println("taking coffee " + wh.take("coffee"));
        System.out.println("taking coffee " + wh.take("coffee"));
        System.out.println("taking sugar " + wh.take("sugar"));
        
        System.out.println("stock:");
        System.out.println("coffee: " + wh.stock("coffee"));
        System.out.println("sugar: " + wh.stock("sugar"));
	}
}
