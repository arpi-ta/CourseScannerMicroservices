package com.microservices.courseScannercatalog.Services;


import com.microservices.courseScannercatalog.Repository.TopicRepo;
import com.microservices.courseScannercatalog.model.Topics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepo topicRepo;

    public List<Topics> getAllTopics(){
            List<Topics> topics=new ArrayList<>();
            topicRepo.findAll()
                    .forEach(topics::add);
            return topics;
    }

    public Topics addTopics(Topics topics){

        Topics topic=topicRepo.save(topics);
        return  topic;
    }


    public void deleteTopics(Topics topics){
        topicRepo.delete(topics);
    }


}
