
public class MoodAnalyser {
    String message;

    //Default Constructor
    public MoodAnalyser() {
    }

    //Parameterised Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    //Method for checking happy or sad mood
    public String analyseMood(String message) {
        if (message.contains("I am in sad mood.")) {
            return "SAD";
        } else if (message.contains("I am in any mood.")) {
            return "HAPPY";
        }
        else
            return "null";
    }

}
