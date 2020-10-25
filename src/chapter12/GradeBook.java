package chapter12;

import java.util.Map;

public class GradeBook {
    public static void main(String[] args) {
        Map<String,Integer> gradeBook = TestResults.getOriginalGrades();
        Map<String,Integer> gradeMakeup = TestResults.getMakeUpGrades();

        for (var student: gradeMakeup.entrySet()){
            Integer initialScore = gradeBook.get(student.getKey());
            Integer makeUpScore = gradeMakeup.get(student.getKey());

            if (makeUpScore>initialScore){
                //if makeup>initial score, update the grade to makeup score.
                gradeBook.put(student.getKey(),makeUpScore);
            }
        }

        printFinalResult(gradeBook);

    }
    public static void printFinalResult(Map<String,Integer> grade){
        System.out.println("Final Result : ");
        grade.forEach((k,v) -> System.out.println(k + " : " + v));
    }
}
