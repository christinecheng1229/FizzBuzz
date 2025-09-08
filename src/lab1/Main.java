package lab1;

public class Main {
    public static void main(String[] args) {
        FizzBuzz.doFizzBuzz(5);
        // FizzBuzz.main(); // causes an error since the main method expects an array of Strings argument
            /*
            Can be solved in 2 ways:
            1) create a dummy argument:
                String[] s = String[]{}
            2) pass in the arg from this file into the Main method from the FizzBuzz file:
                FizzBuzz.main(args)
             */
    }
}
