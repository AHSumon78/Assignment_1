import java.util.*;
public class DewPoint {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Current temperature:");
        double T=in.nextDouble();
        System.out.println("Enter Current Relative Humidity value from 0 to 1:");
        double RH=in.nextDouble();
        DewTemperature dt=new DewTemperature();
        dt.setTRH(T,RH);
        if(RH>0&&RH<1)
        {
            System.out.printf("The Dew Temperature Td : %.2f",dt.getTd());
        }
        else
        System.out.println("Sorry the humidity format is not correct!!!!!");
    }
}
