package ru.spring.API.ObjectAPITourAPP.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.spring.API.ObjectAPITourAPP.models.MapObject;
import ru.spring.API.ObjectAPITourAPP.repositories.ObjectRepository;

import java.util.List;

@Service
@Transactional
public class ObjectServiceImpl implements ObjectService{

    private final ObjectRepository objectRepository;

    @Autowired
    public ObjectServiceImpl(ObjectRepository objectRepository) {
        this.objectRepository = objectRepository;
    }

    @Override
    public MapObject getTour(Integer id) {
        return null;
    }

    @Override
    public MapObject getPlace(Integer id) {
        return null;
    }

    @Override
    public MapObject getNews(Integer id) {
        return null;
    }

    @Override
    public MapObject getAction(Integer id) {
        return null;
    }

    @Override
    public List<MapObject> getAllPlaces(Integer count) {
        return null;
    }

    @Override
    public List<MapObject> getAllTours(Integer count) {
        if (count != null) {
            Pageable page = PageRequest.of(0, count);
            return objectRepository.findAll(page).getContent();
        }
        return objectRepository.findAll(); // сделать деление на страницы
    }

    @Override
    public List<MapObject> getAllNews(Integer count) {
        return null;
    }

    @Override
    public List<MapObject> getAllEvents(Integer count) {
        return null;
    }
}
