import com.sun.source.tree.TryTree;

import java.io.*;

//Задание 1: Создайте класс Person с полями name и age.
//Реализуйте сериализацию и десериализацию этого класса в файл.
//
//Задание 2: Используя JPA, создайте базу данных для хранения объектов класса Person. 
//Реализуйте методы для добавления, обновления и удаления объектов Person.
public class Program {
    public static void main(String[] args) throws IOException {

        Person person1 = new Person("Elena", 18);

        try (FileOutputStream fileOutputStream = new FileOutputStream("persondata.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(person1);
            objectOutputStream.close();
            System.out.println("Объект Person сериализован");
        }

        try (FileInputStream fileInputStreamm = new FileInputStream("persondata.bin");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStreamm)) {
            person1 = (Person) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println("Объект Person десериализован");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
























