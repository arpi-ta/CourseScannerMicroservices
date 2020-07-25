package com.microservices.courseScannercatalog.Repository;


import com.microservices.courseScannercatalog.model.Topics;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepo extends CrudRepository<Topics, String> {

}
