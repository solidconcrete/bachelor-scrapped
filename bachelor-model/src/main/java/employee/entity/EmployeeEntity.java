package employee.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

@Setter
@Getter
@Builder
public class EmployeeEntity {
    private ObjectId id;
    private String name;
    private String surname;
    private String personalId;
    private String phoneNumber;
    private String email;
}
