import java.util.Scanner;
public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = {
            "1. What is the size of int in Java?",
            "2. Which keyword is used to inherit a class in Java?",
            "3. Which method is the entry point of a Java program?",
            "4. Which company developed Java?",
            "5. What is JVM?"
        };
        String[][] options = {
            {"A. 8 bit", "B. 16 bit", "C. 32 bit", "D. 64 bit"},
            {"A. this", "B. super", "C. extends", "D. implements"},
            {"A. start()", "B. main()", "C. run()", "D. init()"},
            {"A. Microsoft", "B. Sun Microsystems", "C. Google", "D. IBM"},
            {"A. Java Virtual Machine", "B. Java Variable Method", "C. Java Verified Machine", "D. None"}
        };
        char[] answers = {'C', 'C', 'B', 'B', 'A'};
        int score = 0;
        System.out.println("===== WELCOME TO QUIZ APP =====\n");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);
            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is: " + answers[i] + "\n");
            }
        }
        System.out.println("===== QUIZ COMPLETED =====");
        System.out.println("Your Score: " + score + "/" + questions.length);
        if (score == questions.length) {
            System.out.println("Excellent!");
        } else if (score >= 3) {
            System.out.println("Good job");
        } else {
            System.out.println("Keep practicing");
        }
        sc.close();
    }
}
