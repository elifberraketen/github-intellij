public class BlockScope {


        static void main(String[] args) {

            int outerX = 5;

            if (true) {
                int innerY = 15;

                System.out.println("X inside the if block :" + outerX);
                System.out.println("Y inside the if block :" + innerY);
            }
            System.out.println("X outside the if block :" + outerX);
            //System.out.println("Y outside the if block :" +innerY); // compile time error
            //System.out.println("Y outside the if block :" +innerY);
        }
}
