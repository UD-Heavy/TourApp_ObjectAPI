package ru.spring.API.ObjectAPITourAPP.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.spring.API.ObjectAPITourAPP.models.MapObject;

@Repository
public interface ObjectRepository extends MongoRepository<MapObject, ObjectId> {
}
