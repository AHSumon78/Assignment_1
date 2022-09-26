public class Position {
    double x,y;
    double an;
    public Position() {
        x=0;
        y=0;
        an=0;
    }
    public double getX()
    {

        return x;
    }

    public double getY() {
        return y;
    }

    public double getAn() {

        return an;
    }

    public void setAngle(double an)
    {
        this.an=(this.an+an)*Math.PI/180;
    }
    public void setDistance(double d)
    {
        this.x=this.x+d*Math.cos(an);
        this.y=this.y+d*Math.sin(an);
    }
    public void turn(double turn)
    {
        an=an-turn*Math.PI/180;
    }
    public void move(double move)
    {
        this.x=this.x+move*Math.cos(an);
        this.y=this.y+move*Math.sin(an);
    }
}
