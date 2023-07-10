public class StudentInfo {
    public static void main(String[] args) { 
        String name;
        String urollno; 
        String course; 
        int sem; 
        name=args[0]; 
        urollno=args[1]; 
        course=args[2];
        sem=Integer.parseInt(args[3]); 
        System.out.println("Name: "+name);
        System.out.println("Unversity Roll Number: "+urollno); 
        System.out.println("Course:	"+course); 
        System.out.println("Semester: "+sem);
    }
}
    