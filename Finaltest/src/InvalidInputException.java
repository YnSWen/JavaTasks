/**
 * Класс для создания собственного исключения - некорректного ввода
 */
public class InvalidInputException extends Exception {
    public InvalidInputException (String msg){
        super(msg);
    }
}
