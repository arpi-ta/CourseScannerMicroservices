package com.arpita.CourseScannerSearch.Controller;

import com.arpita.CourseScannerSearch.model.Favorites;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@RestController
@RequestMapping("/")
public class SearchController {


    private static final Logger LOGGER = LoggerFactory.getLogger(SearchController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Environment environment;
    

    @RequestMapping("/{id}")
    public Favorites getCourses(@PathVariable final int id) {
        LOGGER.info("Creating fav object ... ");


        Favorites favorites=new Favorites();
        favorites.setId(id);


        List<Object> topics = restTemplate.getForObject("http://course-catalog-service/api/courses", List.class);
        favorites.setTopics(topics);

        return favorites;
    }


}
