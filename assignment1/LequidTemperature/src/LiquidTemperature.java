import java.util.*;
public class LiquidTemperature {
    public static void main(String[] args) {
        final double B=3969;
        Scanner in = new Scanner(System.in);

        double T0=85+273;
        double R0=1075;
        System.out.println("Enter Final resistance:");
        double R=in.nextDouble();
        double T= (B*T0)/((T0*Math.log(R/R0))+B)-273;
        System.out.printf("The liquid Temperature is : %.2f'C",T);
    }
}
