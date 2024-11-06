package com.example.Football.Controller;

import com.example.Football.FootballPlayerDetails;
import com.example.Football.Repository.FootballRepository;
import com.example.Football.Service.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FootballController {
    @Autowired
    FootballService footballService;

    @GetMapping("/getAllPlayers")
    // GOOD practice - we can have full control on HTTPS response codes and we can also customize the headers
    public ResponseEntity<List<FootballPlayerDetails>> getDetails()
    {
        List<FootballPlayerDetails> list = footballService.getDetails();
        return ResponseEntity.ok(list);
    }

//    Simple and easy but NOT recommended less control on https code
//    public List<FootballPlayerDetails> getDetails(@PathVariable Integer id)
//    {
//        return footballService.getDetails(id);
//    }

    @GetMapping("/getPlayer/{id}")
    public FootballPlayerDetails getData(@PathVariable Integer id)
    {
        return footballService.getData(id);
    }
    @PostMapping("/addPlayer")
    public void addPlayer(@RequestBody FootballPlayerDetails details)
    {
        footballService.addPlayer(details);
    }

    @PutMapping("/editPlayer/{id}")
    public void editPlayer(@PathVariable Integer id)
    {
        footballService.editPlayer(id);
    }

    @DeleteMapping("/deletePlayer/{id}")
    public void deletePlayer(@PathVariable Integer id)
    {
        footballService.deletePlayer(id);
    }

}
