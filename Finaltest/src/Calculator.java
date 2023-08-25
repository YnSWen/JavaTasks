public class Calculator {
    public double a;
    public double b;

    public double sum(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        if (a < b) throw new ArithmeticException("Первое число меньше второго");
        return a - b;
    }
    public double multiply(double a, double b){
        if (a > Double.MAX_VALUE / b)
            throw new ArithmeticException("Выход за пределы допустимого числа");
        return a * b;
    }

    public double divide(double a, double b){
        if (b == 0) throw new ArithmeticException("Деление на ноль недопустимо");
        return a / b;

    }
    public double calculatePower(double a, double b) throws InvalidInputException {
        if (a == 0 || b < 0) throw new InvalidInputException("Недопустимое число");
        return Math.pow(a, b);
    }
}
