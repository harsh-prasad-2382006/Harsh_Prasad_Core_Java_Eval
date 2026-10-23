package q5;

class Accountant {

    void method1() {
        int salary = 10000 / 0;
        System.out.println(salary);
    }

    void method2() {
        method1();
    }

    void method3() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        Accountant a = new Accountant();
        a.method3();
    }
}