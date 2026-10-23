package q19;


class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class B {
    public static void main(String[] args) {
        Animal a = new Animal() {
            void sound() {
                System.out.println("Cat meows");
            }
        };

        a.sound();
    }
}