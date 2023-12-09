import java.util.Map;
import java.util.HashMap;

public class StudentGrades {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();

        studentGrades.put("Mihai", 60);
        studentGrades.put("Grigore", 53);
        studentGrades.put("Andrei", 45);
        studentGrades.put("David", 90);
        studentGrades.put("Maria", 85);

        System.out.println("Students:");
        for(Map.Entry<String, Integer> entry : studentGrades.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        String highestGrader = findHighestGrader(studentGrades);
        System.out.println("Person with highest grade: " + highestGrader);
    }

    private static String findHighestGrader(Map<String, Integer> studentGrades){
        int maxGrade = Integer.MIN_VALUE;
        String highestGrader = null;

        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()){
            if(entry.getValue() > maxGrade){
                maxGrade = entry.getValue();
                highestGrader = entry.getKey();
            }
        }
        return highestGrader;
    }
}
