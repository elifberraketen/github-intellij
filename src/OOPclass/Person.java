package OOPclass;

public class Person {
    private int id ;
    private String name;
    private int age ;
    private static int idCounter;

    public Person(){
        idCounter =100;
        this("Selma",15);
    }
    public Person(String name ,int age){
        this.age = age;
        this.name= name;
        id=idCounter;
        idCounter++;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    static void main(String[] args) {
        Person person1 = new Person();

        person1.setName("Selim");
        person1.setAge(8);
        System.out.println("Name : " +person1.name+ " his age is " +person1.age+
                " his id is "+idCounter );

    }
}
