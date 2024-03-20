package exams;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${score.group1}")
    private int scoreGroup1;

    @Value("${score.group2}")
    private int scoreGroup2;

    @Value("${score.group3}")
    private int scoreGroup3;

    @Bean
    public ResultsProcessor resultsProcessor() {
        return new ResultsProcessor(scoreGroup1, scoreGroup2, scoreGroup3);
    }
}