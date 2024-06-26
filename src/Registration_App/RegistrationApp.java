package Registration_App;

import Controller.DepartmentController;
import Controller.EmployeeController;
import Controller.StudentController;
import Controller.TeacherController;

import static Utils.DataUtil.br;

public class RegistrationApp {
    public static void main(String[] args) throws Exception{
        String work = "yes";
        StudentController sc = new StudentController();
        TeacherController tc = new TeacherController();
        EmployeeController ec = new EmployeeController();
        //DepartmentController dc = new DepartmentController();
        while(work.equals("yes")){
            System.out.println(" For student or teacher or employee or department ?");
            String choice = br.readLine();
            switch(choice){
                case "student" : sc.studentRegister();
                break;
                case "teacher" : tc.teacherRegister();
                break;
                case "employee" : ec.employeeRegister();
                break;
            }
            System.out.println("Do you want to continue? (yes/no) ?");
            work = br.readLine();
        }
    }
}
