package moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Mood_Analyzer_Test_Exeption {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws Mood_Analyzer_Custom_Exeption {
        Mood_Analyzer_Exeption mood_analyzer_exeption = new Mood_Analyzer_Exeption("I am in SAD mood");
        String mood = mood_analyzer_exeption.analyzermood();
        Assertions.assertEquals("SAD",mood);
    }
    @Test
    public void givenMessage_WhenAnyMood_ShouldReturnhappy() throws Mood_Analyzer_Custom_Exeption
    {
        Mood_Analyzer_Exeption mood_analyzer_exeption = new Mood_Analyzer_Exeption("I am in HAPPY mood");
        String mood = mood_analyzer_exeption.analyzermood();
        Assertions.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenMessage_Whennull_ShouldReturnhappy() throws Mood_Analyzer_Custom_Exeption
    {
        Mood_Analyzer_Exeption mood_analyzer_exeption = new Mood_Analyzer_Exeption("NULL");
        String mood = mood_analyzer_exeption.analyzermood();
        Assertions.assertEquals("HAPPY",mood);
    }
    @Test
    void givenMessage_WhenEmpty_ThrowException(){
        Mood_Analyzer_Exeption mood_analyzer_exeption = new Mood_Analyzer_Exeption("");
        try {
            mood_analyzer_exeption.analyzermood();
        } catch (Mood_Analyzer_Custom_Exeption e) {
            Assertions.assertEquals(Mood_Analyzer_Custom_Exeption.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}
