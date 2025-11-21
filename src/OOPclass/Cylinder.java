package OOPclass;

public class Cylinder {
    public double r ;
    public double h ;
    public static int noOfCylinder ;

    public Cylinder(){
        this.h= 4;
        this.r =3;
    }
    public Cylinder(double r ,double h ){
        this.h= 3;
        this.r =4;
        noOfCylinder++;
    }

    public static int getNoOfCylinder() {
        return noOfCylinder;
    }
    public double calculateBaseArea(){
        double baseArea = 3 * r * r;
        return baseArea;
    }
    public double calculateSurfaceArea(){
        double surfaceArea = 2*3*r*(r+h);
        return surfaceArea;
    }
    public double calculateVolume(){
        double volume = 3 * r*r*h;
        return volume ;
    }
    public double calculateMass(double density){
        return calculateVolume()*density;
    }


    static void main(String[] args) {
        Cylinder cylinder1 =new Cylinder();
        Cylinder cylinder2 =new Cylinder(10,20);

        System.out.println("h= "+cylinder1.h +"r= "+cylinder1.r);
        System.out.println(noOfCylinder);

        System.out.println("h= "+cylinder2.h +"r= "+cylinder2.r);
        System.out.println("area is "+ cylinder2.calculateBaseArea()+"surface area is "+cylinder2.calculateSurfaceArea()
        +"volume = "+cylinder2.calculateVolume()+" mass is "+ cylinder2.calculateMass(5.12));
    }
}
