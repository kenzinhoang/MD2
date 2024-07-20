public class Person {
    public String name;
    public Boolean gender;
    public int age;

    public Person(String name, int age, Boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void cry() {
        System.out.println("Khoc");
    }

    public String getName() {
        return this.name;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public Object getAge(String role) {
        if (role.equals("admin")) {
            return this.age;
        } else {
            return null;
        }
    }
}
