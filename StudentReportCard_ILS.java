import java.util.*;
public class StudentReportCard_ILS {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        int MIL, GenMath, TwentyFirstCentury, Philosophy, ComProg1, PE, OralCom, ComProg2, Sum;
        double Average;
        String Teacher, Name, School, Strand, Section, Student;
        
        System.out.print("Hi, Ma'am/Sir! What is your name?: ");
        Teacher = input.nextLine();
        
        System.out.println("Welcome to STI Students' Report Card Computer, "+Teacher+"!");
        System.out.println("==========================================================");
        
        System.out.println("Enter your student's information below.");
        
        //STUDENT'S INFORMATION
        System.out.print("Full Name: ");
        Name = input.nextLine();
        System.out.print("Strand: ");
        Strand = input.nextLine();
        System.out.print("Section: ");
        Section = input.nextLine();
        System.out.print("School: ");
        School = input.nextLine();
        Student = Name+" "+School+" "+Strand+Section;
        
        System.out.println("==========================================================");
        System.out.println("Please enter "+ Student+ " grades below");
        
        //GRADES
        System.out.print(" "+"General Mathematics: ");
        GenMath = input.nextInt();
        System.out.print(" "+"21st Century Literature: ");
        TwentyFirstCentury = input.nextInt();
        System.out.print(" "+"Philosophy: ");
        Philosophy = input.nextInt();
        System.out.print(" "+"Computer Programming 1: ");
        ComProg1 = input.nextInt();
        System.out.print(" "+"Computer Programming 2: ");
        ComProg2 = input.nextInt();
        System.out.print(" "+"Oral Communication: ");
        OralCom = input.nextInt();
        System.out.print(" "+"Media and Information Literacy: ");
        MIL = input.nextInt();
        System.out.print(" "+"Physical Education: ");
        PE = input.nextInt();
        
        //COMPUTATION (Sum & Average of grade)
        Sum = MIL + GenMath + TwentyFirstCentury + Philosophy + ComProg1 + PE + OralCom + ComProg2;
        System.out.println("SUM: "+Sum);
        Average = Sum/8;
        
            //STUDENT'S ACHIEVEMENT
            System.out.println("AVERAGE GRADE: "+Average);
            if (Average >= 98) {
                System.out.println("CONGRATULATIONS! WITH HIGHEST HONORS!!");
                } else if (Average >= 95) {
                System.out.println("CONGRATULATIONS! WITH HIGH HONORS!!");
                } else if (Average >= 90) {
                System.out.println("CONGRATULATIONS! WITH HONORS!!");
                } else {
                System.out.println("No Honor");
                }
            System.out.println("==========================================================");
        input.close();    
    }   
}