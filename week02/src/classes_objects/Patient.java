/*
 * By convention,
 * we use the underscore with the packages names that have more than one word
 * 
 */
package classes_objects;

public class Patient {
    // 1. Class Properties/Attributes/fields:
    private String firstName; // "" by default => empty string
    private String lastName; // "" by default

    // Encapsulation
    private double weight; // 0.0 by default
    private double height; // 0.0 by default
    // private int age; // no need for this variable

    /*
     * Multiple Constructor => Overloading => Poly
     * 
     */
    public Patient(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // another constructor
    public Patient(String firstName, String lastName, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // define the default constructor explicitly:
    public Patient() {

    }

    // Getters/Setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

} // class
