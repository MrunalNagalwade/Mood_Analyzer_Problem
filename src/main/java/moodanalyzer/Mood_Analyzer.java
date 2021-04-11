package moodanalyzer;

public class Mood_Analyzer {
    public String message;
    public Mood_Analyzer()
    {

    }
    public Mood_Analyzer(String message)
    {
        this.message = message;
    }
    public String analyzermood()
    {
        if (message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";

    }
}
