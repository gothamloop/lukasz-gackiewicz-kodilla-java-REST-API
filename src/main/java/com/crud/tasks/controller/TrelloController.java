package com.crud.tasks.controller;

import com.crud.tasks.domain.CreatedTrelloCard;
import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.domain.TrelloCardDto;
import com.crud.tasks.service.TrelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/trello")
public class TrelloController {

 //   @Autowired
 //   private TrelloClient trelloClient;

    @Autowired
    private TrelloService trelloService;

    @RequestMapping(method = RequestMethod.GET, value = "/getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloService.fetchTrelloBoards();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/createTrelloCard")
    public CreatedTrelloCard createTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return trelloService.createTrelloCard(trelloCardDto);
    }


//    public getTrelloBoards() {
// GET request
  //      List<TrelloBoardDto> trelloBoards = trelloClient.getTrelloBoards();

    //    trelloBoards.forEach(trelloBoardDto -> {

      //      System.out.println(trelloBoardDto.getName() + " - " + trelloBoardDto.getId());

        //    System.out.println("This board contains lists: ");

          //  trelloBoardDto.getLists().forEach(trelloList ->
     //               System.out.println(trelloList.getName() + " - " + trelloList.getId() + " - " + trelloList.isClosed()));

   //     });

    //   List<TrelloBoardDto> trelloBoards = trelloClient.getTrelloBoards();

        //trelloBoards.forEach(trelloBoardDto -> System.out.println(trelloBoardDto.getId() + " " + trelloBoardDto.getName()));

    //    trelloBoards.stream()
    //            .filter(id -> Objects.nonNull(id))
    //            .filter(trelloBoardDto -> trelloBoardDto.getName().equals("Kodilla"))
    //            .forEach(trelloBoardDto -> System.out.println(trelloBoardDto.getId() + " " + trelloBoardDto.getName()));


 //   }


}