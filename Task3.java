import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task3 {
    // Дан Deque состоящий из последовательности цифр.
    // Необходимо проверить, что последовательность цифр является палиндромом
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 2, 1));
        System.out.println(checkOn(deque));
    }


    public static boolean checkOn(Deque<Integer> deque) {

        for (int i = 0; i < deque.size(); i++){
            if(deque.getFirst() != deque.getLast()){
                return false;
            }
            deque.removeFirst();
            deque.removeLast();
        }
        return true;
    }
}