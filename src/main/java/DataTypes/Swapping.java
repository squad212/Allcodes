package DataTypes;

public class Swapping {

    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 200;
        int temporaryNumber;

        System.out.println("First Number is : " + firstNumber);
        System.out.println("Second Number is : " + secondNumber);
        firstNumber = secondNumber;
        System.out.println("First Number after swapping is : " + firstNumber);
        temporaryNumber = firstNumber + secondNumber;
        System.out.println("Temporary Number is : " + temporaryNumber);


        }
}
