public class Main {
    public static void main(String[] args) {

        // Calculator
//        Calculator calc = Calculator.instance.get();
//
//        int a = calc.plus.apply(1, 2);
//        int b = calc.minus.apply(0,1);
//
//        // Нельзя делить на ноль
//        if (b > 0) {
//            int c = calc.devide.apply(a, b);
//            calc.println.accept(c);
//        }


        // Worker
        Worker.OnTaskDoneListener listener = System.out::println;

        Worker worker = new Worker(listener);
        worker.start();

    }
}