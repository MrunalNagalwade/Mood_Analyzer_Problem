package moodanalyzer;

public class Mood_Analyzer_Exeption {
    public String message;
    public Mood_Analyzer_Exeption()
    {

    }
    public Mood_Analyzer_Exeption(String message)
    {
        this.message = message;
    }
    public String analyzermood()
    {
        try {
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException e ){
            return "HAPPY";
        }

    }
}
