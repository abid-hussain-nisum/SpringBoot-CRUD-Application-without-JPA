package com.example.Football.Service;

import com.example.Football.FootballPlayerDetails;
import com.example.Football.Repository.FootballRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FootballService {
    @Autowired
    FootballRepository footballRepository;

    public List<FootballPlayerDetails> getDetails()
    {
        List<FootballPlayerDetails> list = footballRepository.getDetails();
        return list;
    }

    public FootballPlayerDetails getData(Integer id) {
        return footballRepository.getData(id);
    }

    public void addPlayer(FootballPlayerDetails details) {
        footballRepository.addPlayer(details);
    }

    public void editPlayer(Integer id) {
        footballRepository.editPlayer(id);
    }

    public void deletePlayer(Integer id) {
        footballRepository.deletePlayer(id);
    }
}


