package com.mvcapp.first;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

    //List<Alien> findByAname(String name); // Query DSL
    // deve iniziare con findBy o getBy
    //seguito dal nome della variabile che si cerca
    //può anche essere seguito da un OrderBy
    //findByAnameOrderByAidDesc in questo modo si ottiene la lista
    //ordinata dei valori in tabella con quel nome.

    @Query("from Alien where aname=")
    List<Alien> find(String aname);
}
