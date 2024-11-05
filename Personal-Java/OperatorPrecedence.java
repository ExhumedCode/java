public class OperatorPrecedence {
    public static void main(String[] args) {
        double num1 = 20.00;
        double num2 = 80.00;
        double addAndMult = (num1 + num2) * 100;
        System.out.println(num1 + " + " + num2 + " = " + addAndMult);
        double remainder40 = addAndMult % 40;
        System.out.println("Remainder of " + addAndMult + " divided by 40 is " + remainder40);
        boolean isZero = (remainder40 == 0) ? true : false;
        System.out.println(isZero);
        if (!isZero) {
            System.out.println("Got some remainder!");
        }
    }
}
