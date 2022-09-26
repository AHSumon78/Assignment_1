public class Triangle {
    int x1,x2,x3,y1,y2,y3;
    double AB,BC,CA,area,A,B,C;
    public Triangle() {
        x1=0;
        x2=0;
        x3=0;
        y1=0;
        y2=0;
        y3=0;
        AB=0;
        BC=0;
        CA=0;

    }
    public void setABC(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
        this.y1=y1;
        this.y2=y2;
        this.y3=y3;
    }
    public double getAB()
    {
       AB=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return AB;
    }

    public double getBC()
    {
        BC=Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
        return BC;
    }
    public double getCA()
    {
        CA=Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
        return CA;
    }
    public double getC()
    {
        C=Math.acos((BC*BC+CA*CA-AB*AB)/(2*BC*CA));
        return C*180/Math.PI;
    }
    public  double getA()
    {
        A=Math.acos((AB*AB+CA*CA-BC*BC)/(2*AB*CA));
        return A*180/Math.PI;
    }
    public double getB()
    {
        B=Math.acos((BC*BC+AB*AB-CA*CA)/(2*BC*AB));
        return B*180/Math.PI;
    }
    public double getArea()
    {
        area=(AB*Math.sin(B))*.5*BC;
        return area;
    }
    public double getPerimeter()
    {
        return (AB+BC+CA);
    }


}
