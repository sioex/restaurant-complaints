package de.thi.sentiment.pojo;

import java.util.List;
import java.util.Map;

public class ComplaintRequest {

    public String model;

    public List<Map<String, String>> messages;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public List<Map<String, String>> getMessages() {
        return messages;
    }

    public void setMessages(List<Map<String, String>> messages) {
        this.messages = messages;
    }
}
