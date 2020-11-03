package com.codedifferently;


public class BandManager {
    private final WuMember[] wuMemberArray;

    public BandManager(WuMember[] wuMemberArray) {
        this.wuMemberArray = wuMemberArray;
    }

    public String whileLoop() {
        String result = "";

        int index = 0;
        while(index < wuMemberArray.length) {
            result += "\n";
            result += "My first name is " + wuMemberArray[index].getFirstName() + "\n";
            result += "My last name is " + wuMemberArray[index].getLastName() + "\n";
            result += "My stage name is " + wuMemberArray[index].getStageName();

            index++;
        }

        return result;

        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop



        //return result;
    }



    public String forLoop() {

        String result = "";
        for (int index = 0; index < wuMemberArray.length; index++) {
            result += "\n";
            result += "My first name is " + wuMemberArray[index].getFirstName() + "\n";
            result += "My last name is " + wuMemberArray[index].getLastName() + "\n";
            result += "My stage name is " + wuMemberArray[index].getStageName();
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

        return result;
    }



    public String forEachLoop() {
        String result = "";

        for (WuMember member : wuMemberArray) {
            result += "\n";
            result += "My first name is " + member.getFirstName() + "\n";
            result += "My last name is " + member.getLastName() + "\n";
            result += "My stage name is " + member.getStageName();
        }

        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public WuMember[] getwuMemberArray() {
        return wuMemberArray;
    }
}
