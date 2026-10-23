package q4;

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

class Emp {
    int id;
    String name;
    double salary;

    Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() throws InvalidSalaryException {
        if (salary < 10000) {
            throw new InvalidSalaryException("Salary should be 10000 or more");
        }
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Emp emp = new Emp(101, "Harsh", 18000);
        try {
            emp.display();
        } catch (InvalidSalaryException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}