public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int value = 100;
//        System.out.println("value:" + value);
//        System.out.println("step" + steps);
        while (value > 0) {
            if (value % 2 == 0) {
                value = value / 2;
            } else --value;
            ++steps;
//            System.out.println("value:" + value);
//            System.out.println("step" + steps);
        }
        System.out.println(steps);
    }
}