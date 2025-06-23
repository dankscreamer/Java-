class Variables {
    // This is a global (class-level) variable.
    // It is marked static so it can be accessed directly inside the static main method.
    static int grade = 5;

    public static void main(String[] args) {
        // Variable declaration
        int age;

        // Variable initialization
        age = 27;

        // Declaration + initialization together
        int age1 = 27;

        // Any variable declared inside a method is called a local variable.

        System.out.print("I'm " + age + " years old. I'm in grade " + grade + ".");
    }
}
