package com.example.Laba8.DAO;

import com.example.Laba8.Model.Swimmer;

import java.util.ArrayList;
import java.util.List;

public class SwimmersDAO {
    private static int SWIMMERS_COUNT = 0;
    private List<Swimmer> swimmers;
    {
        swimmers = new ArrayList<>();
        swimmers.add(new Swimmer(++SWIMMERS_COUNT, "Mitya", "M", 18, 100, "breaststroke", 60));
    }
    public List<Swimmer> index(){
        return swimmers;
    }
    public Swimmer show(int id){
        return swimmers.stream().filter(swimmer -> swimmer.getId()==id).findAny().orElse(null);
    }
    public void save(Swimmer swimmer){
        swimmer.setId(++SWIMMERS_COUNT);
        swimmers.add(swimmer);
    }
    public void update(int id, Swimmer swimmer){
        Swimmer swimmerToUpdate = show(id);
        swimmerToUpdate.setName(swimmer.getName());
        swimmerToUpdate.setGender(swimmer.getGender());
        swimmerToUpdate.setAge(swimmer.getAge());
        swimmerToUpdate.setDistance(swimmer.getDistance());
        swimmerToUpdate.setStyle(swimmer.getStyle());
        swimmerToUpdate.setTime(swimmer.getTime());


    }
    public void delete(int id){
        swimmers.removeIf(swimmer -> swimmer.getId()==id);
    }
}
