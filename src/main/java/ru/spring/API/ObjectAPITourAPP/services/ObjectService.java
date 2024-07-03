package ru.spring.API.ObjectAPITourAPP.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.spring.API.ObjectAPITourAPP.repositories.ObjectRepository;
import ru.spring.API.ObjectAPITourAPP.models.MapObject;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ObjectService {

    private final ObjectRepository objectRepository;

    @Autowired
    public ObjectService(ObjectRepository objectRepository) {
        this.objectRepository = objectRepository;
    }

    public List<MapObject> findAllTours(Integer count) {
        if (count != null) {
            Pageable page = PageRequest.of(0, count);
            return objectRepository.findAll(page).getContent();
        }
        return objectRepository.findAll(); // сделать деление на страницы
    }

    public List<MapObject> findAllNewsAndEvents() {
        return new ArrayList<>();
    } // забиваем до карточки

    public List<MapObject> findAllPlaces() { // по аналогии с турами
        return new ArrayList<>();
    }

}
