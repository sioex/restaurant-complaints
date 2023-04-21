package de.thi.sentiment;

import de.thi.sentiment.pojo.ChatGPTResponse;
import de.thi.sentiment.pojo.Choices;
import de.thi.sentiment.pojo.ComplaintRequest;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import rest.ChatGPTRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class GetSentimentFromChatGPT {

    @Inject
    @RestClient
    ChatGPTRestClient chatGPTRestClient;

    public Integer getSentimentFromChatGPT(String text){
        ComplaintRequest complaintRequest = new ComplaintRequest();
        complaintRequest.setModel("gpt-3.5-turbo");

        Map<String, String> message = new HashMap<>();
        message.put("role", "user");
        message.put("content", "Act as a sentiment analysis. I will provide you with a text for a complaint and you give me a number between 0 and 10. 0 = very angry. 10 = nice feedback. Complaint: " + text);

        List<Map<String, String>> mapObject = new ArrayList<>();
        mapObject.add(message);
        complaintRequest.setMessages(mapObject);

        ChatGPTResponse response = chatGPTRestClient.post(complaintRequest, "Bearer {{API_KEY}}");
        Choices choices = response.getChoices().get(0);
        HashMap<String, String> content = choices.getMessage();
        String sentiment = content.get("content");

        return Integer.valueOf(sentiment);
    }

}
