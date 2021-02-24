public class Division extends Operation {
    // Деление

    @Override
    void execute(double element1, double element2) {
        float result = (float) (element1 / element2);
        System.out.println(result);
    }
}
