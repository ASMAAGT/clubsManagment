package com.tp7.clubsmanagement.Services;

import Models.Club;
import com.tp7.clubsmanagement.Repositories.ClubRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubServiceImpl implements ClubService {
    @Autowired
    private ClubRepository clubRepository;

    @Override
    public Club saveClub(Club club) {
        return clubRepository.save(club);
    }

    @Override
    public List<Club> fetchClubList() {

        return (List<Club>) clubRepository.findAll();
    }

    @Override
    public Club updateClub(Club club, Integer Id) {
        Club existingClub = getClubById(Id);
        existingClub.setCreation_date(club.getCreation_date());
        return clubRepository.save(existingClub);
    }

    @Override
    public void deleteClubById(Integer Id) {
        clubRepository.deleteById(Id);
    }

    @Override
    public Club getClubById(Integer Id) {
        return clubRepository.findById(Id).orElseThrow(() -> new EntityNotFoundException("Club not found with id: " + Id));
    }


}