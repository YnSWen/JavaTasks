import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = Double.parseDouble(in.nextLine());
        System.out.println("Введите второе число: ");
        double b = Double.parseDouble(in.nextLine());

        try{
            System.out.println("Выполнено сложение: " + calculator.sum(a,b));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Выполнено вычитание: " + calculator.subtract(a,b));
        } catch(Exception e){
            System.out.println("Произошла ошибка, вычитание не выполнено - " + e.getMessage());
        }

        try{
            System.out.println("Выполнено умножение: " + calculator.multiply(a,b));
        } catch(Exception e){
            System.out.println("Произошла ошибка, умножение не выполнено - " + e.getMessage());
        }

        try{
            System.out.println("Выполнено деление: " + calculator.divide(a,b));
        } catch(Exception e){
            System.out.println("Произошла ошибка, деление не выполнено - " + e.getMessage());
        }

        try{
            System.out.println("Выполнено возведение в степень: " + calculator.calculatePower(a,b));
        } catch(Exception e){
            System.out.println("Произошла ошибка, возведение в степень не выполнено - " + e.getMessage());
        }
    }

}