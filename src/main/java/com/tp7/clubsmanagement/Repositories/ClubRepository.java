package com.tp7.clubsmanagement.Repositories;

import Models.Club;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClubRepository extends CrudRepository<Club,Integer> {
    //List<Club> findByStudentsNsc(Long studentNsc);
}