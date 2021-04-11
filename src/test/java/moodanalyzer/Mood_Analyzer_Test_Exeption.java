package moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Mood_Analyzer_Test_Exeption {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad()
    {
        Mood_Analyzer_Exeption mood_analyzer = new Mood_Analyzer_Exeption("I am in SAD mood");
        String mood = mood_analyzer.analyzermood();
        Assertions.assertEquals("SAD",mood);
    }
    @Test
    public void givenMessage_Whenhappy_ShouldReturnhappy()
    {
        Mood_Analyzer_Exeption mood_analyzer = new Mood_Analyzer_Exeption("I am in HAPPY mood");
        String mood = mood_analyzer.analyzermood();
        Assertions.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenMessage_Whennull_ShouldReturnhappy()
    {
        Mood_Analyzer_Exeption mood_analyzer = new Mood_Analyzer_Exeption("NULL");
        String mood = mood_analyzer.analyzermood();
        Assertions.assertEquals("HAPPY",mood);
    }
}
