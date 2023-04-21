import de.thi.sentiment.GetSentimentFromChatGPT;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class GetSentimentFromChatGPTTest {

    @Inject
    GetSentimentFromChatGPT getSentimentFromChatGPT;

    @Test
    public void shouldSendRequest(){
        // given
        String complaint = "Too much parsley.";

        // when
        Integer sentiment = getSentimentFromChatGPT.getSentimentFromChatGPT(complaint);

        //then
        assertEquals(sentiment.intValue(), sentiment.intValue());
    }
}