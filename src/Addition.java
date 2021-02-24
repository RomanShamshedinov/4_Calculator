public class Addition extends Operation {
    // Сложение

    @Override
    void execute(double element1, double element2) {
        float result = (float) (element1 + element2);
        System.out.println(result);
    }
}
