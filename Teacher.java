public class Teacher extends Person{
    String department;
    String courses;
    Teacher(String firstName, String lastName, String gender, String department, String courses){
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }
    public boolean equals(Teacher t){
        return super.equals(t) && department.equals(t.department) && courses.equals(t.courses); 
    }
    @Override
    public String toString(){
        return super.toString() + " " +department + " " +courses;
    }
    public static void main(String[] args) {
        Teacher t1 = new Teacher("John", "Smith", "Male", "Mathematics", "Algebra, Geometry");
        Teacher t2 = new Teacher("John", "Smith", "Male", "Mathematics", "Algebra, Geometry");
        Teacher t3 = new Teacher("Jane", "Doe", "Female", "Physics", "Mechanics");

        System.out.println("Teacher 1: " + t1);
        System.out.println("Teacher 2: " + t2);
        System.out.println("Teacher 3: " + t3);

        System.out.println("\nEquality tests:");
        System.out.println("t1 equals t2: " + t1.equals(t2));
        System.out.println("t1 equals t3: " + t1.equals(t3));
    }
}
