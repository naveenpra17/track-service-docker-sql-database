package com.stackroute.trackservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
@NoArgsConstructor
//annotation for creating no arguments constructor
@AllArgsConstructor
//annotation for creating arguments constructor
@Data
//annotation for creating getters and setters,to override tostring(),
//to create equals, canEquals and hashcode,
@Entity //this tells the spring that this class is an entity class and a table is made  for this class
public class Track {
    @Id// this tels that this an primary attribute
    private int id;
    private String track;
    private String comments;

//    public Track() {
//    }
//
//    public Track(int id, String track, String comments) {
//        this.id = id;
//        this.track = track;
//        this.comments = comments;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTrack() {
//        return track;
//    }
//
//    public void setTrack(String track) {
//        this.track = track;
//    }
//
//    public String getComments() {
//        return comments;
//    }
//
//    public void setComments(String comments) {
//        this.comments = comments;
//    }
//
//    @Override
//    public String toString() {
//        return "Track{" +
//                "id=" + id +
//                ", track='" + track + '\'' +
//                ", comments='" + comments + '\'' +
//                '}';
//    }
}
