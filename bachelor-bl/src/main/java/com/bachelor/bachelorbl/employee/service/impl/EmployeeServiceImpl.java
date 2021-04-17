package com.bachelor.bachelorbl.employee.service.impl;

import com.bachelor.bachelorbl.employee.service.EmployeeService;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

//@CommonsLog
@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public ArrayList<JSONObject> getEmployees() {
        MongoClient mongoClient = MongoClients.create("mongodb+srv://bachelor:pass@cluster0.hjnrv.mongodb.net");
        MongoDatabase database = mongoClient.getDatabase("clientOneDB");
        return null;
    }
}
