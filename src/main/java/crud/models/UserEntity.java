package crud.models;

import lombok.*;

import javax.persistence.*;

//@Data
@Entity
@Table(name = "users")
public class UserEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   @Column
   private String name;
   @Column
   private String profession;
   @Column
   private byte age;
   @Column
   private String email;

   public UserEntity() {

   }

   public UserEntity(String name, String profession, byte age, String email) {
      this.name = name;
      this.profession = profession;
      this.age = age;
      this.email = email;
   }

   public long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getProfession() {
      return profession;
   }

   public void setProfession(String profession) {
      this.profession = profession;
   }

   public byte getAge() {
      return age;
   }

   public void setAge(byte age) {
      this.age = age;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      UserEntity that = (UserEntity) o;

      if (age != that.age) return false;
      if (name != null ? !name.equals(that.name) : that.name != null) return false;
      if (profession != null ? !profession.equals(that.profession) : that.profession != null) return false;
      return email != null ? email.equals(that.email) : that.email == null;
   }

   @Override
   public int hashCode() {
      int result = name != null ? name.hashCode() : 0;
      result = 31 * result + (profession != null ? profession.hashCode() : 0);
      result = 31 * result + (int) age;
      result = 31 * result + (email != null ? email.hashCode() : 0);
      return result;
   }

   @Override
   public String toString() {
      return "UserEntity{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", profession='" + profession + '\'' +
              ", age=" + age +
              ", email='" + email + '\'' +
              '}';
   }
}
