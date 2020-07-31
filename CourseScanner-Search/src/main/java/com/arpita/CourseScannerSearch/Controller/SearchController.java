package com.arpita.CourseScannerSearch.Controller;


import com.arpita.CourseScannerSearch.model.Favorites;
import com.arpita.CourseScannerSearch.model.Topics;
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

       //we cannot send list of objects
        // top-level object that contains the list of employees instead of returning the list directly.
        List<Object> topics = restTemplate.getForObject("http://course-catalog-service/api/courses", List.class);
        favorites.setTopics((List<Topics>)(List<?>)topics);

        return favorites;
    }


    @RequestMapping("/{id}/{category}")
    public Favorites getTopRatedCourses(@PathVariable final int id,@PathVariable String category) {
        LOGGER.info("Displaying Top rated college ... ");

        String sort=category;
        Favorites favourites=new Favorites();
        favourites.setId(id);

        // get list of available courses
        List<Object> courses = restTemplate.getForObject("http://course-catalog-service/api/"+sort, List.class);
        favourites.setTopics((List<Topics>)(List<?>)courses);

        return favourites;
    }


   /* @RequestMapping("/{id}/{category}/{id1}")
    public Cart getCart(@PathVariable final int id, @PathVariable String category, @PathVariable String id1){

        Cart cart=new Cart();
        Favorites fav=getTopRatedCourses(id,category);

            List<Topics> topic=fav.getTopics();

            for(Topics t:topic){
                if(t.getId().equals(id1)){
                    cart.setTopic(t);
                }
            }

            cartRepo.save(cart);

            return cart;

    } */


}
