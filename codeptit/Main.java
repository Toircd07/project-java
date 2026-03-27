
package codeptit;
import java.util.Scanner;
import java.lang.Math;

class Point{
        int x;
        int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void move(int dx, int dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }
    public double distanceTo(Point p) {
        int dx =  p.x - this.x;
        int dy = p.y - this.y;
        return Math.sqrt(dx*dx +  dy*dy);
    }
}
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-- >0){
                Point p1 = new Point(sc.nextInt(), sc.nextInt());
                Point p2 = new Point(sc.nextInt(), sc.nextInt());
                p1.move(1, 1);
                double distance = p1.distanceTo(p2);
                System.out.printf("%.2f\n", distance);
            }

    }
}
