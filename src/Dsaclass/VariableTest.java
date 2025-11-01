package Dsaclass;

public class VariableTest {

    int instanceVariable = 10 ;

    public void printInstanceVar(){

        System.out.println("instance variable in the method :" +instanceVariable);

    }
    public static void main(String[] args){

        VariableTest obj = new VariableTest();
        obj.printInstanceVar();

    }

}

