import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by students on 25/09/22.
 */
public class View {
    Control c;
    Scanner in;

    public View() throws FileNotFoundException {
        c=new Control();
        in= new Scanner(System.in);
    }
    public void start() throws FileNotFoundException {
        System.out.println("_____________________________________");
        System.out.println("        Student Registration System");
        System.out.println("_____________________________________");
while (true)
{
    System.out.println("1: Add New Student\t\t" +
            "2:Veiw All Students\n3: Search For Student\t\t4:delete Student\n0:exit");
    int choice=in.nextInt();
    switch (choice)
    {
        case 1: add();break;
        case 2: view();break;
        case 3: find();break;
        case 4: delete();break;

        case 0:c.writeStudentFile();
            System.exit(0);
    }
}
    }

    public void add()
    {
        System.out.println("ID FirstName Last Name Registration Year");
        int id=in.nextInt();
        String f=in.next();
        String l=in.next();
        int y=in.nextInt();
       //check for duplicted student
        boolean duplicated =c.checkForDuplicate(new Student(id,f,l,y));
        if (duplicated)
            System.out.println("sorry there is already student with this data");
        else {

            boolean added = c.addNewStudent(id, f, l, y);
            if (added)
                System.out.println("added successfully");
            else System.out.println("too much students");

        } }
    public void view()
    {
        Student[] all=c.viewAllStudents();
        System.out.println("ID FirstName Last Name Registration Year");

        for (int i = 0; i < all.length; i++) {
            if (all[i]!=null)
           // System.out.println(all[i].getId()+"\t"+all[i].getfName()+"\t"+all[i].getlName()+"\t"+all[i].getRegistrationYear());
                System.out.println(all[i]);

        }
    }
    public void find()
    {
        System.out.println("input student ID to search");
        int id=in.nextInt();
       Student s= c.searchForStudent(id);
        if (s!=null) {
            System.out.println("ID FirstName Last Name Registration Year");

            System.out.println(s.getId() + "\t" + s.getfName() + "\t" +
                    "" + s.getlName() + "\t" + s.getRegistrationYear());
        }
        else System.out.println("no student with this ID");
    }
    public void delete()
    {
        System.out.println("input id to delete");
        int id= in.nextInt();
      boolean deleted=  c.deleteStudent(id);
        if (deleted) System.out.println("deleted Successfully");
        else
                     System.out.println("no student with this ID");

    }
}









