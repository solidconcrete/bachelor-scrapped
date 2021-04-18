package employee.entity;

import lombok.Setter;
import org.bson.types.ObjectId;


public class EmployeeEntity {
    private ObjectId id;
    private String name;
    private String surname;
    private String personalId;
    private String phoneNumber;
    private String email;
}
