public class Main {
    public static void main(String[] args) {

        // Calculator
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        // Нельзя делить на ноль
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);


        // Worker
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener errorCallback = System.out::println;

        Worker worker = new Worker(listener, errorCallback);
        worker.start();

    }
}