package de.thi.sentiment.pojo;

import java.util.HashMap;

public class Choices {

    HashMap<String, String> message;
    String finish_reason;
    Integer index;

    public HashMap<String, String> getMessage() {
        return message;
    }

    public void setMessage(HashMap<String, String> message) {
        this.message = message;
    }

    public String getFinish_reason() {
        return finish_reason;
    }

    public void setFinish_reason(String finish_reason) {
        this.finish_reason = finish_reason;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
