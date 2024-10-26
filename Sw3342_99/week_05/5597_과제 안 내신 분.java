import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> submittedStudents = new HashSet<>();

        for (int i = 0; i < 28; i++) {
            int studentNumber = scanner.nextInt();
            submittedStudents.add(studentNumber);
        }

        for (int i = 1; i <= 30; i++) {
            if (!submittedStudents.contains(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

