package lungtung;

import java.util.Scanner;

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if (gender == 'f' || gender == 'm') {
            this.gender = gender;
        } else {
            this.gender = 'f';
        }
    }

    // Accessors
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        if (gender == 'f' || gender == 'm') {
            this.gender = gender;
        }
    }

    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Accessors
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {  // Đã sửa từ void thành int
        return qty;
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book[name=" + name + ", " + author.toString() + ", price=" + price + ", qty=" + qty + "]";
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Đọc số lượng test case
        int tc = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < tc; i++) {
            // Đọc kiểu đối tượng (Author hoặc Book)
            String objectType = sc.nextLine();
            
            if (objectType.equalsIgnoreCase("End")) {
                break;
            }
            
            if (objectType.equals("Author")) {
                // Đọc thông tin Author
                String name = sc.nextLine();
                String email = sc.nextLine();
                String genderStr = sc.nextLine();
                char gender;
                if (genderStr.length() > 0) {
                    gender = genderStr.charAt(0);
                } else {
                    gender = 'f'; // Default gender if input is empty
                }
                
                Author author = new Author(name, email, gender);
                System.out.println(author.toString());
                
            } else if (objectType.equals("Book")) {
                // Đọc thông tin Book
                String bookName = sc.nextLine();
                double price = Double.parseDouble(sc.nextLine());
                int qty = Integer.parseInt(sc.nextLine());
                
                // Tiếp tục đọc thông tin Author cho Book
                String authorName = sc.nextLine();
                String authorEmail = sc.nextLine();
                String genderStr = sc.nextLine();
                char gender = genderStr.charAt(0);
                
                Author author = new Author(authorName, authorEmail, gender);
                Book book = new Book(bookName, author, price, qty);
                System.out.println(book.toString());
            }
        }
        
        sc.close();
    }
}