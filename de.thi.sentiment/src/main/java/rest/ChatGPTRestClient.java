package rest;

import de.thi.sentiment.pojo.ChatGPTResponse;
import de.thi.sentiment.pojo.ComplaintRequest;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@RegisterRestClient(baseUri = "https://api.openai.com/v1/chat/completions")
public interface ChatGPTRestClient {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    ChatGPTResponse post(ComplaintRequest complaintRequest, @HeaderParam("Authorization") String bearer);

}
