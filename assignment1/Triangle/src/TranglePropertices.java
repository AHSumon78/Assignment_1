import java.util.*;
public class TranglePropertices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter 3 point of a triangle as(x y):\n");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int x3 = in.nextInt();
        int y3 = in.nextInt();
        Triangle tr = new Triangle();
        tr.setABC(x1, y1, x2, y2, x3, y3);
        double ab = tr.getAB();
        double bc = tr.getBC();
        double ca = tr.getCA();
        double x = Math.max(ab, bc);
        x = Math.max(x, ca);
        double c = Math.min(ab, bc);
        double d = Math.min(c, ca);
        if (x >= c + d) {
            System.out.printf("The tringle is not posible with these length :\nAB=%f\nBA=%f\nCA=%f\n", ab, bc, ca);
        }
        else {
            System.out.printf("AB=%.2f\nBA=%.2f\nCA=%.2f" +
                    "\nA=%.2f'\nB=%.2f'\nC=%.2f'" +
                    "\nPerimeter =%.2f\nAREA=%.4f\n", ab, bc, ca,
                    tr.getA(), tr.getB(), tr.getC(),
                    tr.getPerimeter(), tr.getArea());


        }

    }
}