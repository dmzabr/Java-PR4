import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Task4 {
    //Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    // Сложите два числа и верните сумму в виде связанного списка.
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
        // result [6,6,0,1]
        System.out.println(sum(d1, d2));
    }


    public static LinkedList<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        LinkedList<Integer> result = new LinkedList<>();
        int rem = 0;
        while(!d1.isEmpty()){
            int sum = rem;
            sum = d1.removeFirst() + d2.removeFirst();

            result.add(sum % 10);
            rem = sum / 10;
        }
        if (rem != 0) {
            result.add(rem);
        }

        return result;
    }
}