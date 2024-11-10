package ru.spring.API.ObjectAPITourAPP.services;

import ru.spring.API.ObjectAPITourAPP.models.MapObject;

import java.util.List;

public interface ObjectService {

    MapObject getTour(Integer id);

    MapObject getPlace(Integer id);

    MapObject getNews(Integer id);

    MapObject getAction(Integer id);

    List<MapObject> getAllPlaces(Integer count);

    List<MapObject> getAllTours(Integer count);

    List<MapObject> getAllNews(Integer count);

    List<MapObject> getAllEvents(Integer count);

}
