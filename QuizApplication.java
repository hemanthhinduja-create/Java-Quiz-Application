import java.util.*;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "Java supports OOP? (yes/no)",
            "2 + 2 = 5? (yes/no)",
            "Java is platform independent? (yes/no)",
            "Java uses JVM? (yes/no)",
            "Java supports multiple inheritance using classes? (yes/no)",
            "Java is case-sensitive? (yes/no)",
            "int is a primitive data type in Java? (yes/no)",
            "Java supports pointers? (yes/no)",
            "Java code is compiled and interpreted? (yes/no)",
            "Java was developed by Sun Microsystems? (yes/no)"
        };

        String[] answers = {
            "yes",
            "no",
            "yes",
            "yes",
            "no",
            "yes",
            "yes",
            "no",
            "yes",
            "yes"
        };

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
            String ans = sc.next().toLowerCase();

            if (ans.equals(answers[i])) {
                score++;
            }
        }

        System.out.println("\nFinal Score: " + score + "/" + questions.length);
        sc.close();
    }
}