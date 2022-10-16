import java.util.Objects;

/**
 * Created by students on 25/09/22.
 */
public class Student {
    private int id;
    private String fName;
    private String lName;
    private int registrationYear;
public static int counter=0;
    public Student(int id, String fName, String lName, int registrationYear) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.registrationYear = registrationYear;
       // counter++;
    }

    public Student(int id, String fName, String lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getRegistrationYear() {
        return registrationYear;
    }

    public void setRegistrationYear(int registrationYear) {
        this.registrationYear = registrationYear;
    }

//public String toString()
//{
//    return getClass()+"[id="+id+",fName="+fName+",lName="+lName+",registrationYear="+registrationYear+"]";
//}


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", registrationYear=" + registrationYear +
                ",counter="+counter+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (registrationYear != student.registrationYear) return false;
        if (fName != null ? !fName.equals(student.fName) : student.fName != null) return false;
        return lName != null ? lName.equals(student.lName) : student.lName == null;

    }

//    @Override
//    public int hashCode() {
//        int result = id;
//        result = 31 * result + (fName != null ? fName.hashCode() : 0);
//        result = 31 * result + (lName != null ? lName.hashCode() : 0);
//        result = 31 * result + registrationYear;
//        return result;
//    }
    //   public boolean equals(Object o)
//   {
//       if (o==null)return false;
//       if (o.getClass()!=this.getClass())return false;
//       Student s = (Student) o;
//       if (s.getId()==id&&s.getfName().equals(fName)&&s.getlName().equals(lName)&&s.getRegistrationYear()==registrationYear)
//           return true;
//       else return false;
//   }
}











