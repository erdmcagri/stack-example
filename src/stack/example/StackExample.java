package stack.example;

import java.util.Stack;
import java.util.UUID;

/**
 *
 * @author erdmcagri
 */
public class StackExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Person p = new Person(UUID.randomUUID(), "Ahmet", "Ak", 25, new String[]{"Kitap okumak", "Yüzmek", "Film izlemek"});
        Person p1 = new Person(UUID.randomUUID(), "Ayşe", "Yeşil", 23, new String[]{"Pasta yapmak", "Doğa yürüyüşü yapmak", "Fotoğraf çekmek"});
        Person p2 = new Person(UUID.randomUUID(), "Veli", "Kara", 27, new String[]{"Tarihi müzeler gezmek", "Tüplü dalış", "Fotoğraf çekmek"});

        Stack s = new Stack();
        s.push(p);

        Stack s1 = new Stack();
        s1.push(p1);

        Stack s2 = new Stack();
        s2.push(p2);

        Stack[] stackArray = new Stack[3];
        stackArray[0] = s;
        stackArray[1] = s1;
        stackArray[2] = s2;

        for (int i = 0; i < stackArray.length; i++) {
            System.out.println(stackArray[i]);
        }

    }

}
