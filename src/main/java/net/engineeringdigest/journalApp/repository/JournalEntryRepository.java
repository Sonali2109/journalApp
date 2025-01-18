package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

                                             // MongoRepository< On_Which_The_Operation_Is_Performed,OBJECT_ID_TYPE>
public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId>{
}

