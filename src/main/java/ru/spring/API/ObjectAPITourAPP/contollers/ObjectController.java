package ru.spring.API.ObjectAPITourAPP.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.spring.API.ObjectAPITourAPP.models.MapObject;
import ru.spring.API.ObjectAPITourAPP.services.ObjectService;

import java.util.List;

@Controller
@RequestMapping("/api/object")
public class ObjectController {


    private final ObjectService objectService;

    @Autowired
    public ObjectController(ObjectService objectService) {
        this.objectService = objectService;
    }

    @GetMapping("/tours")
    public ResponseEntity<List<MapObject>> getAllTours(@RequestParam(value = "count", required = false) Integer count){
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(objectService.findAllTours(count));
    }

    @GetMapping("/news")
    public List<MapObject> getAllNewsAndEvents(){ // забиваем пока (до реализации карточки события)
        return objectService.findAllNewsAndEvents();
    }

    @GetMapping("/mapObjects")
    public List<MapObject> getAllPlaces(){
        return objectService.findAllPlaces();
    }
}
