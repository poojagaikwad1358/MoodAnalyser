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
    public String analyseMood(String message) throws MoodAnalysisException {
        //nullpointer exception to return happy.
        try {
            if (message.length() == 0) {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, " ");
            }
            if (message.contains("I am in sad mood.")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "NULL");
        }
    }
}
