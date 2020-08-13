import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    //Test case for happy mood
    @Test
    public void happyMood_returnHappy_ifMoodEqualsOtherThanSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood.");
        String mood = moodAnalyser.analyseMood("I am in any mood.");
        Assert.assertEquals("HAPPY",mood);
    }

    //Test case for sad mood
    @Test
    public void sadMood_returnSad_ifMoodEqualsSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood.");
        String mood = moodAnalyser.analyseMood("I am in sad mood.");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void invalidMood_throwsException_ifMessageNull() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try{
            moodAnalyser.analyseMood(null);
        }catch(MoodAnalysisException e){
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void invalidMood_throwsException_ifMessageEmpty() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(" ");
        try{
            moodAnalyser.analyseMood(" ");
        }catch(MoodAnalysisException e){
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}
