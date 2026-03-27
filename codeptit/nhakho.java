package codeptit;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Warehouse {

    private HashMap<String, Item>  items = new HashMap<>();
    public void importProduct(Item item) {
        items.put(item.getProduct(), item);
        
    }
    public Item getItem(String product) {
        return items.get(product);
    }
    public void removeProduct(String product ,int quantity) {
        if(items.containsKey(product)) {
            Item item = items.get(product);
            int newQuantity = item.getQuantity() - quantity;
            item.setQuantity(newQuantity);
        }
    }
        
    
    public void decreaseQuantityInWarehouseByOne() {
        for (Item item : items.values()) {
            int newQuantity = item.getQuantity() - 1;
            item.setQuantity(newQuantity);
        }
    }
     public void takeFromItemToWarehouse(List<Item> itemsToCheck, String product, int quantity){
        // Kiểm tra xem product có trong itemsToCheck không
        boolean found = false;
        for(Item checkItem : itemsToCheck) {
            if(checkItem.getProduct().equals(product)) {
                found = true;
                break;
            }
     }
     if(found && items.containsKey(product)) {
        Item warehouseItem = items.get(product);
        int currentQuantity = warehouseItem.getQuantity();
        
        // Tìm số lượng trong itemsToCheck
        int checkQuantity = 0;
        for(Item checkItem : itemsToCheck) {
            if(checkItem.getProduct().equals(product)) {
                checkQuantity = checkItem.getQuantity();
                break;
            }
        }
        // Nếu quantity thêm vào > số lượng kiểm tra thì tăng bằng số lượng kiểm tra
        if(quantity > checkQuantity) {
            warehouseItem.setQuantity(currentQuantity + checkQuantity);
        } else {
            warehouseItem.setQuantity(currentQuantity + quantity);
        }
    }
}
public void printWarehouseInfo() {
    // In theo thứ tự milk trước, buttermilk sau
    Item milk = items.get("milk");
    Item buttermilk = items.get("buttermilk");
    
    if(milk != null) {
        milk.printItemInfo();
    }
    if(buttermilk != null) {
        buttermilk.printItemInfo();
    }
}
}

class Item {
 private String product ;
 private int quantity ;
 private  int unitPrice ;
 private  int originalQuantity ;
 public Item(String product, int quantity, int unitPrice) {
    this.product = product;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
    this.originalQuantity = quantity;
 }
 public Item(String product, int quantity) {
    this.product = product;
    this.quantity = quantity;
    this.originalQuantity = quantity;
 }
 public String getProduct() {
    return product;
 }  
 public int getQuantity() {
    return quantity;
 }  
    public int getUnitPrice() {
        return unitPrice;
    }
    public int getOriginalQuantity() {
        return originalQuantity;
    }
    public void  setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getTotalPrice() {
        return quantity * unitPrice;
    }
    public void printItemInfo (){
        System.out.println("Product: " + product + " has quantity " + quantity + " with price: " + getTotalPrice());
    }
}

    


public class Main {
    public static void main(String[] args) {
        // (1) Tạo và in thông tin 2 sản phẩm
        Item item1 = new Item("milk", 4, 2);
        Item item2 = new Item("buttermilk", 10, 2);
        
        item1.printItemInfo();
        item2.printItemInfo();
        
        // (2) Thêm vào kho
        Warehouse wh = new Warehouse();
        wh.importProduct(item1);
        wh.importProduct(item2);
        
        // (3) Xóa sản phẩm và in
        wh.removeProduct("milk", 1);
        wh.removeProduct("buttermilk", 3);
        wh.printWarehouseInfo();
        
        // (4) Giảm toàn bộ 1 đơn vị và in
        wh.decreaseQuantityInWarehouseByOne();
        wh.printWarehouseInfo();
        
        // (5) Tạo danh sách itemsToCheck
        Item milkCheck = new Item("milk", 2);
        Item buttermilkCheck = new Item("buttermilk", 6);
        List<Item> itemsToCheck = List.of(milkCheck, buttermilkCheck);
        
        // Thêm vào kho với điều kiện
        wh.takeFromItemToWarehouse(itemsToCheck, "milk", 5);
        wh.takeFromItemToWarehouse(itemsToCheck, "buttermilk", 1);
        wh.printWarehouseInfo();
    }
}
