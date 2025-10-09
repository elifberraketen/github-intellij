public class StaticLifetime {

    static int varCounter = 0 ;

    public void incramentCounter(){

        varCounter ++ ;
        System.out.println("counter in the method" +varCounter);

    }

    public static void main(String[] args){

        StaticLifetime obj1 = new StaticLifetime();
        StaticLifetime obj2 = new StaticLifetime();

        obj1.incramentCounter();
        obj2.incramentCounter();


    }
}
