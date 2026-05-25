public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        //Addition
        if(cal.add(2, 3) == 5){
            System.out.println("Addition Test Passed");
        }else{
            System.out.println("Addition Test Failed");
        }

        //Substractiom
        if(cal.sub(6, 10) == 4){
            System.out.println("Substraction Test Passed");
        }else{
            System.out.println("Substraction Test Failed");
        }

        //Multiplication
        if(cal.mul(4, 5) == 20){
            System.out.println("Multiplication Test passed");
        }else{
            System.out.println("Multiplication Test Failed");
        }

        //Division
        if(cal.div(10, 3) == 3){
            System.out.println("Division Test passed");
        }else{
            System.out.println("Division Test failed");
        }
    }
}
