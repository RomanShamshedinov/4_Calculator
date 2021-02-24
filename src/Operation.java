import java.util.Scanner;

public class Operation {
    double element1;
    double element2;

    public static void main(String[] args) {

        boolean exit = false;
        System.out.println("Добро пожаловать в калькулятор!");
        while (!exit) {
            System.out.println("Введите число оперция число. Для выхода из программы напишите: \"exit\"");
            Scanner in = new Scanner(System.in);
            String pharse = in.nextLine();

            if (pharse.equals("exit")) {
                System.out.println("Программа завершена.");
                break;
            }
            //Валидация с помощью регулярного выражения
            Scanner validation = new Scanner(pharse);
            String validationStr = validation.findInLine("[0-9+*/\\-.]+");
            if (validationStr.length() != pharse.length()) {
                System.out.println("Не корректный ввод. Попробуйте еще раз.");
                continue;
            } else {
                //Сложение
                if (pharse.contains("+")) {
                    Addition sum = new Addition();
                    int index = pharse.indexOf("+");
                    String variable1 = pharse.substring(0, index);
                    sum.element1 = Double.parseDouble(variable1);

                    String variable2 = pharse.substring(index + 1);
                    sum.element2 = Double.parseDouble(variable2);
                    sum.execute(sum.element1, sum.element2);
                }

                //Умножение
                else if (pharse.contains("*")) {
                    Multiplication proizv = new Multiplication();
                    int index = pharse.indexOf("*");
                    String variable1 = pharse.substring(0, index);
                    proizv.element1 = Double.parseDouble(variable1);

                    String variable2 = pharse.substring(index + 1);
                    proizv.element2 = Double.parseDouble(variable2);
                    proizv.execute(proizv.element1, proizv.element2);
                }

                //Деление
                else if (pharse.contains("/")) {
                    Division del = new Division();
                    int index = pharse.indexOf("/");
                    String variable1 = pharse.substring(0, index);
                    del.element1 = Double.parseDouble(variable1);

                    String variable2 = pharse.substring(index + 1);
                    del.element2 = Double.parseDouble(variable2);
                    del.execute(del.element1, del.element2);
                }

                //Вычитание
                //Проверка на первое отрицательно число
                else if (pharse.contains("-") && (pharse.indexOf("-") == 0 || pharse.indexOf("-") == pharse.lastIndexOf("-"))) {
                    Substraction minus = new Substraction();
                    int index = pharse.lastIndexOf("-");
                    String variable1 = pharse.substring(0, index);
                    minus.element1 = Double.parseDouble(variable1);

                    String variable2 = pharse.substring(index + 1);
                    minus.element2 = Double.parseDouble(variable2);
                    minus.execute(minus.element1, minus.element2);
                }

            }

        }
    }

    void execute(double element1, double element2) {
    }
}
