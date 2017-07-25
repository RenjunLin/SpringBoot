package com.jerry.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix = "school", ignoreUnknownFields = true)
public class SchoolProperties {

    public static class Location{   //注意这里必须是static，否则无法load
        private String city;
        private String country;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "city='" + city + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
    }

    private Location location;
    private String name;
    private Integer age;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SchoolProperties{" +
                "location=" + location +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
