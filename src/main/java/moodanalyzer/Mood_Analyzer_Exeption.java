package moodanalyzer;

public class Mood_Analyzer_Exeption extends Throwable {
    public String message;
    public Mood_Analyzer_Exeption()
    {

    }
    public Mood_Analyzer_Exeption(String message)
    {
        this.message = message;
    }
    public String analyzermood() throws Mood_Analyzer_Custom_Exeption

    {
        try {
            if (message.length() == 0) {
                throw new Mood_Analyzer_Custom_Exeption(Mood_Analyzer_Custom_Exeption.ExceptionType.ENTERED_EMPTY, "Please enter proper mood");
            }
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new Mood_Analyzer_Custom_Exeption(Mood_Analyzer_Custom_Exeption.ExceptionType.ENTERED_NULL, "Please enter proper mood");
        }
    }
}