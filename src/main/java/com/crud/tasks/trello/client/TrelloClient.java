package com.crud.tasks.trello.client;

import com.crud.tasks.domain.TrelloBoardDto;
//import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Optional.ofNullable;

@Component
public class TrelloClient {

    @Value("${trello.app.endpoint.prod}")
    private String trelloApiEndpoint;

    @Value("${trello.app.key}")
    private String trelloAppKey;

    @Value("${trello.app.token}")
    private String trelloToken;

    @Value("${trello.app.username}")
    private String trelloUsername;

    @Autowired
    private RestTemplate restTemplate;

    public List<TrelloBoardDto> getTrelloBoards() {

    //    URI url = UriComponentsBuilder.fromHttpUrl(trelloApiEndpoint + "/members/kodillauser/boards")
    //            .queryParam("key", trelloAppKey)
    //            .queryParam("token", trelloToken)
    //            .queryParam("username", trelloUsername)
    //            .queryParam("fields", "name,id")
    //            .queryParam("lists","all").build().encode().toUri();

    ///            TrelloBoardDto[] boardsResponse = restTemplate.getForObject(url, TrelloBoardDto[].class);

    //    if (boardsResponse != null) {
    //        return Arrays.asList(boardsResponse);
    //    }
    //    return new ArrayList<>();

        URI url = getURL();

        TrelloBoardDto[] boardsResponse = restTemplate.getForObject(url, TrelloBoardDto[].class);

     //   if (boardsResponse != null) {
     //       return Arrays.asList(boardsResponse);
     //   }
        return Arrays.asList(ofNullable(boardsResponse).orElse(new TrelloBoardDto[0]));


        //return new ArrayList<>();
    }

    private URI getURL() {

        return UriComponentsBuilder.fromHttpUrl(trelloApiEndpoint + "/members/kodillauser/boards")
                .queryParam("key", trelloAppKey)
                .queryParam("token", trelloToken)
                .queryParam("username", trelloUsername)
                .queryParam("fields", "name,id")
                .queryParam("lists","all").build().encode().toUri();

    }

}
