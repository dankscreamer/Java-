// This file contains two classes: Main and Tida
// Both have their own main methods (entry points)
// You can run either one using: java Main or java Tida

class Main { // Serves as the entry point to the program (if run using `java Main`)
    
    // This is the main method. JVM looks for this method to start execution.
    public static void main(String[] args) {
        // Explanation:
        // The JVM looks for a public static method named `main`
        // with a String array as parameter and a void return type.

        System.out.println("Hello World"); // println adds a newline at the end (like \n in Python)
        System.out.print("Hello Java");    // print does NOT add a newline
    }
}

class Tida { // Another class with its own main method
    
    public static void main(String[] args) {
        System.out.print("Hello duniya");  // This line runs when `java Tida` is executed
    }
}
