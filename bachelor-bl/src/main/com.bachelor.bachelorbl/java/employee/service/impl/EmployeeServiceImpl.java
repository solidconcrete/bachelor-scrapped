package employee.service.impl;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import employee.service.EmployeeService;
import lombok.extern.apachecommons.CommonsLog;
import org.json.JSONObject;

import java.util.ArrayList;

@CommonsLog
public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public ArrayList<JSONObject> getEmployees() {
        MongoClient mongoClient = MongoClients.create("mongodb+srv://bachelor:pass@cluster0.hjnrv.mongodb.net");
        MongoDatabase database = mongoClient.getDatabase("clientOneDB");
        return null;
    }
}
