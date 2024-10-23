public class Main {
    public static void main(String[] args) {
        Person p = new Person("AAA", 46);
        Employee e = new Employee("BBB", 30, 70000);
        Student s = new Student("CCC", 20, "B");


        Holder[] h = new Holder[4];
        h[0] = new Holder(p);
        h[1] = new Holder(e);
        h[2] = new Holder(s);

        for (int i = 0; i < h.length; i++) {
            if (h[i] != null) {
                Object obj = h[i].getData();


                if (obj instanceof Employee) {
                    Employee e1 = (Employee) obj;
                    System.out.println("Employee: " + e1.toString() + ", Salary: " + e1.getSalary());

                } else if (obj instanceof Student) {
                    Student s1 = (Student) obj;
                    System.out.println("Student: " + s1.toString() + ", Grade: " + s1.getGrade());

                } else if (obj instanceof Person) {
                    Person p1 = (Person) obj;
                    System.out.println("Person: " + p1.toString());
                }
            }
        }
    }
}