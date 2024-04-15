package com.sagar.Dashboard;



import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "dashboard")
@lombok.Data


public class Data {

    @Id
    private Long id; // Assuming there is an ID field for the entity

    @Column(name = "end_year")
    private Integer endYear;

    @Column(name = "citylng")
    private Double cityLng;

    @Column(name = "citylat")
    private Double cityLat;

    @Column(name = "intensity")
    private Integer intensity;

    @Column(name = "sector")
    private String sector;

    @Column(name = "topic")
    private String topic;

    @Column(name = "insight")
    private String insight;

    @Column(name = "swot")
    private String swot;

    @Column(name = "url")
    private String url;

    @Column(name = "region")
    private String region;

    @Column(name = "start_year")
    private Integer startYear;

    @Column(name = "impact")
    private Integer impact;

    @Column(name = "added")
    private Date added;

    @Column(name = "published")
    private Date published;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "relevance")
    private Integer relevance;

    @Column(name = "pestle")
    private String pestle;

    @Column(name = "source")
    private String source;

    @Column(name = "title")
    private String title;

    @Column(name = "likelihood")
    private Integer likelihood;

    // Getters and setters for the fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Add getters and setters for other fields
}
