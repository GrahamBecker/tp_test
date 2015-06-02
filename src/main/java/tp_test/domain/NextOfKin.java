package tp_test.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by graham on 2015/06/02.
 */
@Entity
public class NextOfKin implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String relation;

    public NextOfKin() {
    }


    public NextOfKin(Builder builder) {
        this.id=builder.id;
        this.name=builder.name;
        this.relation=builder.relation;
    }

    public static class Builder{
        private Long id;
        private String name;
        private String relation;

        public Builder(Long id){
            this.id=id;
        }

        public Builder relation(String relation) {
            this.relation = relation;
            return this;
        }

        public Builder name(String value){
            this.name=value;
            return this;
        }

        public Builder copy(NextOfKin value){
            this.id=value.id;
            this.relation=value.relation;
            this.name=value.name;
            return this;
        }

        public NextOfKin build(){
            return new NextOfKin(this);
        }

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRelation() {
        return relation;
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
