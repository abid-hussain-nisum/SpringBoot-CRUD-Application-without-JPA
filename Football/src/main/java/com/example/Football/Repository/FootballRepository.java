package com.example.Football.Repository;

import com.example.Football.FootballPlayerDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class FootballRepository {

    List<FootballPlayerDetails> list = new ArrayList<>(Arrays.asList(
        (new FootballPlayerDetails(21,"john","defender",11)),
        (new FootballPlayerDetails(23,"rahul","goalkeeper",1)),
        (new FootballPlayerDetails(20,"mohan","forward",2)),
        (new FootballPlayerDetails(25,"rohit","midfield",5)))
        );
    public List<FootballPlayerDetails> getDetails()
    {
        return list;
    }

    public FootballPlayerDetails getData(Integer id) {
//          this is one method to search using loops
//        List<FootballPlayerDetails> newList = new ArrayList<>();
//        for(int i=0;i<list.size();i++)
//        {
//            if(list.get(i).getJerseyNumber()==id)
//            {
//                newList.add(list.get(i));
//                break;
//            }
//        }
//        return newList;

        return list.stream().filter(n->n.getJerseyNumber()==id).findFirst().get();
    }

    public void addPlayer(FootballPlayerDetails details) {
        list.add(details);
    }

    public void editPlayer(Integer id) {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getJerseyNumber()==id)
            {
                list.get(i).setPosition("GoalKeeper");
            }
        }
    }

    public void deletePlayer(Integer id) {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getJerseyNumber()==id)
            {
                list.remove(i);
            }
        }
    }
}
