public class Task5 {

    //Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
    // является ли входная строка логически правильной.
    // Входная строка логически правильная, если:
    // 1) Открытые скобки должны быть закрыты скобками того же типа.
    // 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
    // открытую скобку того же типа.
    // ()[] = true
    // () = true
    // {[()]} = true
    // ()() = true
    // )()( = false
    public static void main(String[] args) {
        System.out.println(validParentheses("(()){[]}"));
        System.out.println(validParentheses(")((()))("));
    }
    public static boolean validParentheses(String str) {

        char mass[][] = {{'(', ')'}, {'[', ']'}, {'{', '}'}};
        int count = 0;

        for(char el[]: mass) {

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == el[0])
                    count++;
                else if (str.charAt(i) == el[1])
                    count--;
                if (count < 0) return false;
            }
        }
        if(count == 0) return true;
        else return false;
    }
}

