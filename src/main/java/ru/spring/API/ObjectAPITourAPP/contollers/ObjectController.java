package ru.spring.API.ObjectAPITourAPP.contollers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.spring.API.ObjectAPITourAPP.models.MapObject;
import ru.spring.API.ObjectAPITourAPP.services.ObjectServiceImpl;

import java.util.List;

import static ru.spring.API.ObjectAPITourAPP.utils.ErrorUtil.returnError;


@Controller
@RequiredArgsConstructor
@RequestMapping("/api/object")
public class ObjectController {

    private final ObjectServiceImpl objectService;

    @GetMapping("/place/{id}")
    public ResponseEntity<MapObject> getPlace(@PathVariable("id") Integer id,
                                              BindingResult bindingResult) {

        if(bindingResult.hasErrors())
            returnError(bindingResult);

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(objectService.getPlace(id));
    }
    @GetMapping("/tour/{id}")
    public ResponseEntity<MapObject> getTour(@PathVariable("id") Integer id,
                                             BindingResult bindingResult) {

        if(bindingResult.hasErrors())
            returnError(bindingResult);

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(objectService.getPlace(id));
    }
    @GetMapping("/news/{id}")
    public ResponseEntity<MapObject> getNews(@PathVariable("id") Integer id,
                                             BindingResult bindingResult) {

        if(bindingResult.hasErrors())
            returnError(bindingResult);

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(objectService.getPlace(id));
    }
    @GetMapping("/event/{id}")
    public ResponseEntity<MapObject> getEvent(@PathVariable("id") Integer id) {
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(objectService.getPlace(id));
    }

    @GetMapping("/places")
    public ResponseEntity<List<MapObject>> getAllPlaces(@RequestParam(value = "count", required = false) Integer count) {
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(objectService.getAllPlaces(count));
    }

    @GetMapping("/tours")
    public ResponseEntity<List<MapObject>> getAllTours(@RequestParam(value = "count", required = false) Integer count) {
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(objectService.getAllTours(count));
    }

    @GetMapping("/news")
    public ResponseEntity<List<MapObject>> getAllNews(@RequestParam(value = "count", required = false) Integer count) {
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(objectService.getAllNews(count));
    }

    @GetMapping("/events")
    public ResponseEntity<List<MapObject>> getAllEvent(@RequestParam(value = "count", required = false) Integer count) {
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(objectService.getAllEvents(count));
    }
}
