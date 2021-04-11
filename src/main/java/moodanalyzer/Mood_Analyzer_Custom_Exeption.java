package moodanalyzer;

public class Mood_Analyzer_Custom_Exeption extends Exception {
    public final ExceptionType type;

    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    }
    public Mood_Analyzer_Custom_Exeption(ExceptionType type,String message)
    {
        super(message);
        this.type = type ;
    }

}
