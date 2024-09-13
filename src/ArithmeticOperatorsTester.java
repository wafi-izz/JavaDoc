/**
 * The type Arithmetic operators tester.
 * Author: wafi izzeldin
 */
public class ArithmeticOperatorsTester {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        System.out.println(arithmeticOperators.sum(3,7));
        System.out.println(arithmeticOperators.sub(50,30));
        System.out.println(arithmeticOperators.mul(3,4));
        System.out.println(arithmeticOperators.div(50,2));
    }
}

/**
 * The type Arithmetic operators.
 * Author: wafi izzeldin
 */
class ArithmeticOperators {
    /**
     * Instantiates a new Arithmetic operators.
     */
    public ArithmeticOperators() {

    }

    /**
     * Sum int.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return the int
     */
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Sub int.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return the int
     */
    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Mul int.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return the int
     */
    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Div int.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return the int
     */
    public int div(int num1, int num2) {
        return num1 / num2;
    }
}
