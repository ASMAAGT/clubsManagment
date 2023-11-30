package com.tp7.clubsmanagement.Repositories;

import com.tp7.clubsmanagement.Models.Club;
import org.springframework.data.repository.CrudRepository;

public interface ClubRepository extends CrudRepository<Club,Integer> {
    //List<Club> findByStudentsNsc(Long studentNsc);
}