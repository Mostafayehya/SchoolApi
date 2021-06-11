package com.example.SchoolApi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "osmfilteredlocations",
        catalog = "schoolapi",
        uniqueConstraints = @UniqueConstraint(columnNames = "name")
)
public class OSMFilteredLocations {


    private Long id;
    private String city;
    private String amenity;
    private String name;
    private String arabicName;
    private String englishName;
    private String alternativeName;


    public OSMFilteredLocations() {
    }

    public OSMFilteredLocations(String city, String amenity, String name, String arabicName, String englishName, String alternativeName) {
        this.city = city;
        this.amenity = amenity;
        this.name = name;
        this.arabicName = arabicName;
        this.englishName = englishName;
        this.alternativeName = alternativeName;
    }

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAmenity() {
        return amenity;
    }

    public void setAmenity(String amenity) {
        this.amenity = amenity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArabicName() {
        return arabicName;
    }

    public void setArabicName(String arabicName) {
        this.arabicName = arabicName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getAlternativeName() {
        return alternativeName;
    }

    public void setAlternativeName(String alternativeName) {
        this.alternativeName = alternativeName;
    }
}
