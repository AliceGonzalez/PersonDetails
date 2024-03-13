package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...

    public String whileLoop() { //This method converts a person object into a string representation
        // Initialize result string since we are returning a string
        StringBuilder result = new StringBuilder();
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
        while (counter < personArray.length) {
            // begin loop
            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[counter];
            // get `string Representation` of `currentPerson`
            String stringRepresentation = "\nMy first name is " + currentPerson.getFirstName() + "\nMy last name is " + currentPerson.getLastName();
            // append `stringRepresentation` to `result` variable
            result.append(stringRepresentation);
            // end loop
            counter++;
        }
        return result.toString();
    }



    public String forLoop() {
        StringBuilder result = new StringBuilder();
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        for (int i = 0; i < personArray.length; i++) {
            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[i];
            // get `string Representation` of `currentPerson`
            String strRepresentation = "\nMy first name is " + currentPerson.getFirstName() + "\nMy last name is " + currentPerson.getLastName();
            // append `stringRepresentation` to `result` variable
            result.append(strRepresentation);
            // end loop
        }
        return result.toString();
    }



    public String forEachLoop() {
        StringBuilder strResult = new StringBuilder();
        // identify array's type- Person[]
        // identify array's variable name- personArray

        // use the above discoveries to declare for-each-loop signature
        //for (type variableName : arrayName)
        for (Person currentPerson : personArray) {
            // begin loop
            // get `string Representation` of `currentPerson`
            String strRepresentation = "\nMy first name is " + currentPerson.getFirstName() + "\nMy last name is " + currentPerson.getLastName();
            // append `stringRepresentation` to `result` variable
            strResult.append(strRepresentation);
            // end loop
        }
        return strResult.toString();
    }


    public Person[] getPersonArray() { return personArray;
    }
}

