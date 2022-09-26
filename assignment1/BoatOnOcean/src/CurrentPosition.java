import java.util.*;
public class CurrentPosition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter intial Distance from (0,0):\n");
        double destance=in.nextDouble();
        System.out.printf("Enter intial Angle or direction respect to point (0,0):\n");
        double angle = in.nextDouble();
        Position pn =new Position();
        pn.setAngle(angle);
        pn.setDistance(destance);
        System.out.printf("Enter turn Angle\n");
        double turn =in.nextDouble();
        pn.turn(turn);
        System.out.printf("Enter turn moved destance\n");
        double move=in.nextDouble();
        pn.move(move);
        System.out.printf("X=%.2f\nY=%.2f\nAngle=%.0f",pn.getX(),pn.getY(),pn.getAn()*180/Math.PI);
    }

}
