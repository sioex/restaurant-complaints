package de.thi.sentiment.pojo;

import java.util.HashMap;
import java.util.List;

public class ChatGPTResponse {

    String id;
    String object;
    Integer created;
    String model;
    HashMap<String, Integer> usage;
    List<Choices> choices;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public HashMap<String, Integer> getUsage() {
        return usage;
    }

    public void setUsage(HashMap<String, Integer> usage) {
        this.usage = usage;
    }

    public List<Choices> getChoices() {
        return choices;
    }

    public void setChoices(List<Choices> choices) {
        this.choices = choices;
    }
}
