package com.microservices.courseScannercatalog.Repository;


import com.microservices.courseScannercatalog.model.Topics;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TopicRepo extends CrudRepository<Topics, String> {

    @Query(value = "select * from topics c where description=:description ORDER BY c.ratings DESC LIMIT 3", nativeQuery = true)
    List<Topics> findByCourseCategoryLimit3(@Param("description") String description);
}
