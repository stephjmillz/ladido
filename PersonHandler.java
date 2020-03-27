package com.zipcodewilmington;

public class PersonHandler {

    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        int counter = 0;
        String result = "";
        // create a `counter`

        while (counter < personArray.length) {
            result += personArray[counter];
            counter++;

        }
        // while `counter` is less than length of array
        // begin loop

        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop

        return result;
    }



    public String forLoop() {
        String result = "";
        for (int x = 0; x < personArray.length; x++)

            result += personArray[x];

        return result;
    }

        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop





    public String forEachLoop() {
        String result = "";

        for(Person x : getPersonArray()) {
            result += x;


            // identify array's type
            // identify array's variable-name

            // use the above discoveries to declare for-each-loop signature
            // begin loop
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop

        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
