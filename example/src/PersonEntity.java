import java.util.Date;
import java.util.UUID;

public class PersonEntity {
    public UUID id;
    public String fullName;
    public String email;
    public String passwordHash;
    public String phoneNumber;
    public int balance;
    public Date createdDateTime;
    public Date modifiedDateTime;
    ...
    public PersonDto toDto() {
        return new PersonDto(this.fullName, this.email, this.createdDateTime);
    }
}
