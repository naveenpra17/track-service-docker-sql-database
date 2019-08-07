package com.stackroute.trackservice.repository;

import com.stackroute.trackservice.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * this is an interface which extends JpaRepository interface which has its own methods which we can use in our project
 * this is also useful for interfacing our project with the database
 */
@Repository
public interface TrackRepository extends JpaRepository<Track,Integer>{

    @Query("select track from Track track where track.track like ?1")
        //Used to execute the query and it will return the result.
    List<Track> getByName(String trackName);

}
