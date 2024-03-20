package exams;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultsProcessorTest {

    @Test
    public void testCalculateTotalScore() throws IOException {
        String answersKeyFile = "answers_key.txt";
        String studentAnswersFile = "student_answers.txt";

        FileDataReader fileDataReader = new FileDataReader();
        List<String> answersKey = fileDataReader.readLines(answersKeyFile);
        List<String> studentAnswers = fileDataReader.readLines(studentAnswersFile);

        ResultsProcessor resultsProcessor = new ResultsProcessor(12,15,17);
        int totalScore = resultsProcessor.calculateTotalScore(answersKey.toString(), studentAnswers.toString());

        assertEquals(18, totalScore);
    }
}