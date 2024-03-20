package exams;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ResultsProcessorMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ResultsProcessor resultsProcessor = context.getBean(ResultsProcessor.class);

        int totalScore = resultsProcessor.calculateTotalScore("answers_key.txt", "student_answers.txt");
        System.out.println("Total score: " + totalScore);

        context.close();
    }
}
