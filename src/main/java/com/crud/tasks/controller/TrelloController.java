package com.crud.tasks.controller;

import com.crud.tasks.domain.CreatedTrelloCardDto;
import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.domain.TrelloCardDto;
import com.crud.tasks.trello.facade.TrelloFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "*")
//@RestController
//@RequestMapping("/v1/trello")
@RestController
@RequestMapping("/v1/trello")
@CrossOrigin("*")
public class TrelloController {

    @Autowired
    private TrelloFacade trelloFacade;

    @RequestMapping(method = RequestMethod.GET, value = "/boards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloFacade.fetchTrelloBoards();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/cards")
    public CreatedTrelloCardDto createTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return trelloFacade.createCard(trelloCardDto);
    }


    /*
 //   @Autowired
 //   private TrelloClient trelloClient;

    //private TrelloService trelloService;
    @Autowired
    private TrelloFacade trelloFacade;

    @RequestMapping(method = RequestMethod.GET, value = "/getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloFacade.fetchTrelloBoards();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/createTrelloCard")
    public CreatedTrelloCardDto createTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return trelloFacade.createCard(trelloCardDto);
    }
   */

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