package com.bachelor.bachelorbl.employee.service.impl;

import com.bachelor.bachelorbl.employee.service.EmployeeService;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import com.mongodb.client.MongoDatabase;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

//@CommonsLog
@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public ArrayList<Document> getEmployees() {
        MongoClient mongoClient = MongoClients.create("mongodb+srv://bachelor:pass@cluster0.hjnrv.mongodb.net");
        MongoDatabase database = mongoClient.getDatabase("clientOneDB");
        MongoCollection<Document> collection = database.getCollection("workers");
        MongoCursor<Document> cursor = collection.find().iterator();
        ArrayList<Document> res = new ArrayList<>();
        try {
            while (cursor.hasNext()) {
                res.add(cursor.next());
            }
        } catch (Exception e) {
            return  null;
        }
        return res;
    }
}
