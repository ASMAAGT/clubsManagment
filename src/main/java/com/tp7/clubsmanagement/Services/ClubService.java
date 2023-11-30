package com.tp7.clubsmanagement.Services;

import com.tp7.clubsmanagement.Models.Club;

import java.util.List;

public interface ClubService {
    Club saveClub (Club club);

    // read operation
    List<Club> fetchClubList();

    // update operation
    Club updateClub(Club club, Integer clubId);

    // delete operation
    void deleteClubById(Integer clubId);
    Club getClubById(Integer clubId);

}