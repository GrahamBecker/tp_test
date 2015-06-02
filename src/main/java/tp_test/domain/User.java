package tp_test.domain;

import javax.persistence.*;
import javax.security.auth.Subject;
import java.io.Serializable;
import java.util.List;

/**
 * Created by graham on 2015/06/02.
 */
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fName;
    private String lName;
    private String dob;
    @OneToMany(fetch = FetchType.EAGER)
    private List<NextOfKin> nextOfKins;

    private User() {
    }

    public User(Builder builder) {
        id=builder.id;
        fName=builder.fName;
        lName=builder.lName;
        dob=builder.dob;
        nextOfKins = builder.nextOfKins;
    }

    public Long getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getDob() {
        return dob;
    }

    public List<NextOfKin> getNextOfKins() {
        return nextOfKins;
    }

    public static class Builder {

        private Long id;
        private String fName;
        private String lName;
        private String dob;
        private List<NextOfKin> nextOfKins;

        public Builder subjects(List<NextOfKin> value){
            this.nextOfKins=value;
            return this;
        }

        public Builder(Long id){
            this.id=id;
        }

        public Builder fName(String value){
            this.fName=value;
            return this;
        }

        public Builder lName(String value){
            this.lName=value;
            return this;
        }

        public Builder dob(String value){
            this.dob=value;
            return this;
        }

        public Builder nextOfKins(List<NextOfKin> value){
            this.nextOfKins=value;
            return this;
        }

        public Builder copy(User value){
            this.fName=value.getfName();
            this.lName=value.getlName();
            this.dob=value.getDob();
            this.id=value.getId();
            this.nextOfKins=value.getNextOfKins();
            return this;
        }

        public User build(){
            return new User(this);
        }

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
