package com.example.archery.repositories;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import com.example.archery.entities.Team;

public class TeamRepository implements ITeamRepository {
    private final LinkedHashMap<String,Team> teamMap;
    private Integer autoIncrement=0;   
   
    public TeamRepository(){
        teamMap = new LinkedHashMap<String,Team>();
       
    }

    public TeamRepository(LinkedHashMap<String, Team> teamMap) {
        this.teamMap = teamMap;       
    }

    @Override
    public Team save(Team entity) {
        if(entity.getId()==null){
        autoIncrement++;
        Team t = new Team(Integer.toString(autoIncrement), entity.getTeamName(),entity.getPlayer1(), entity.getPlayer2());
        teamMap.put(t.getId(),t);
        return t;
    }
    teamMap.put(entity.getId(),entity);
    return entity;

    }

    @Override
    public Optional<Team> findByName(String name) {
        return teamMap.values().stream().filter(u-> u.getTeamName().equals(name)).findAny();
    }
    
    @Override
    public List<Team> findAll() {
        return teamMap.values().stream().collect(Collectors.toList());
    }

    @Override
    public void getAllPlayers() {
        teamMap.values().stream()
       .forEach((team) -> System.out.print(team.getPlayer1()+","+ team.getPlayer2()+","));
      
    }

    @Override
    public void getAllTeamWithPlayers() {
        teamMap.values().stream().forEach(
            (team) -> System.out.println(team.getTeamName()+" "+ team.getPlayer1()+" "+ team.getPlayer2()));
    
    }

    

    @Override
    public long count() {      
        return 0;
    }

    @Override
    public void delete(Team entity) {      
        
    }

    @Override
    public void deleteById(String id) {      
        
    }

    @Override
    public boolean existsById(String id) {       
        return false;
    }

   

    @Override
    public Optional<Team> findById(String id) {      
        return Optional.empty();
    }

    

    

}
