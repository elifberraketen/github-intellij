package OOPclass;

public class Cat {
    int x ;
    double direction ;
    String name ;

    public Cat(){
        int x =0;
        direction =180 ;
        name ="Sofya";
    }
    public Cat(int x ,double direction,String name){
        this.x =x;
        this.direction=direction;
        this.name=name;
    }
    public void move(){
        x += 20 ;
    }
    public void move2(int a){
        x +=a;
    }
    public void turn(double angle ){
        direction += angle ;
    }
    public void status(){
        System.out.println("x= " +x +" direction = "+direction +" name is "+ name);
    }

    static void main(String[] args) {
        Cat cat1 =new Cat();
        Cat cat2 = new Cat(5,45,"Lucy");

        cat1.move();
        cat2.move2(20);

        cat1.status();
        cat2.status();
    }


}
