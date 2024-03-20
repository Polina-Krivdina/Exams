package exams;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
@SpringBootTest
public class AppConfigTest {

    @Autowired
    private ApplicationContext context;

    @Value("${score.group1}")
    private int expectedScoreGroup1;

    @Value("${score.group2}")
    private int expectedScoreGroup2;

    @Value("${score.group3}")
    private int expectedScoreGroup3;

    @Test
    public void testResultsProcessorBeanCreation() {
        ResultsProcessor resultsProcessor = context.getBean(ResultsProcessor.class);
        assertNotNull(resultsProcessor);
        assertEquals(expectedScoreGroup1, resultsProcessor.getScoreGroup1());
        assertEquals(expectedScoreGroup2, resultsProcessor.getScoreGroup2());
        assertEquals(expectedScoreGroup3, resultsProcessor.getScoreGroup3());
    }
}
