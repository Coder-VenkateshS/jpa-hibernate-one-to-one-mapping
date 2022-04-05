package capg.jfs.capg.jfs.jpa.onetoone;

import dao.InstructorDao;
import entity.Instructor;
import entity.InstructorDetail;

public class App 
{
    public static void main( String[] args )
    {
       Instructor instructor = new Instructor("Venky","S","12venkat21@gmail.com");
       System.out.println("Created Instructor");
       InstructorDetail instructorDetail = new InstructorDetail("Eating","www.youtube.com");
       System.out.println("Created Instructor Detail");
       
       instructor.setInstructorDetail(instructorDetail);
       System.out.println("Instructor detail passed to instructor");
       InstructorDao instructordao=new InstructorDao();
       instructordao.saveInstructor(instructor);
    }
}
