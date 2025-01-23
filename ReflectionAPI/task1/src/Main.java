import java.lang.reflect.Method;

//Используя Reflection API,
//напишите программу, которая выводит на экран все методы класса String.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> stringClass = Class.forName("java.lang.String");

        Method[] methods = stringClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method);


        }





    }
}