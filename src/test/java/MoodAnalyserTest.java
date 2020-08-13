import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser = new MoodAnalyser();

    //Test case for happy mood
    @Test
    public void happyMood_returnHappy_ifMoodEqualsOtherThanSad() {
        String mood = moodAnalyser.analyseMood("I am in any mood.");
        Assert.assertEquals("HAPPY",mood);
    }

    //Test case for sad mood
    @Test
    public void sadMood_returnSad_ifMoodEqualsSad() {
        String mood = moodAnalyser.analyseMood("I am in sad mood.");
        Assert.assertEquals("SAD",mood);
    }
}
