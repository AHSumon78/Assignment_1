public class DewTemperature {
    static  final double A=17.27;
    static final double B=237.7;
    double T,RH,Ft,Td;

    public DewTemperature() {
        T=0;
        RH=0;
        Ft=0;
        Td=0;
    }

    public void setTRH(double T, double RH) {

        this.T=T;
        this.RH=RH;
    }
    public double getTd()
    {
        Ft=((A*T)/(B+T)+ Math.log(RH));
        Td=(B*Ft)/(A-Ft);
        return Td;
    }
}
