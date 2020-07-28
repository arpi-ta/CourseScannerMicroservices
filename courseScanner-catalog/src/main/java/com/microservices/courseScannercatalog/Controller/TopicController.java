package com.microservices.courseScannercatalog.Controller;

import com.microservices.courseScannercatalog.Repository.TopicRepo;
import com.microservices.courseScannercatalog.Services.TopicService;
import com.microservices.courseScannercatalog.model.Topics;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TopicController {


    @Autowired
    private TopicService topicService;

    @Autowired
    private TopicRepo topicRepo;

    @RequestMapping("/courses")
    public List<Topics> getAllTopics(){

        return topicService.getAllTopics();
    }

    @RequestMapping(method = RequestMethod.POST,value="/topics")
    public ResponseEntity<Object> addTopics(@RequestBody  Topics topic){


           Topics  t=topicService.addTopics(topic);

        URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(t.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

    @GetMapping("/{category}")
    public List<Topics> findByCategory(@PathVariable String category) {
        return topicRepo.findByCourseCategoryLimit3(category);
    }

}
