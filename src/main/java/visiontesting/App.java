/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package visiontesting;

import org.opencv.core.Mat;

public class App {
    public String getGreeting() {
        return "Hello world, lolz.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        for (String item : args) {
            System.out.println(item);
        }
    }
}
