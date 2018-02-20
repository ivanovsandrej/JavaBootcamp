package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

import java.util.logging.ErrorManager;

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
        ta.catchExeption();
        ta.validateUser("Ivan");
        ta.catchMe(5, 0);
    }

    void catchExeption() {
        try {
            int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("This should get printed even if there is an exception");

        } catch (ArrayIndexOutOfBoundsException arEx) {
            System.out.println("!!!Array Index Out Of Bounds Exception!!!");
        } finally {
            System.out.println("" + "\n Thank you for using this program.");
        }
    }

    void validateUser(String name) {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy" };
        int flag = 0;
        //TODO if name in a list -> set flag=1
        // if at the end flag=0 -> throw the exeption
        try {


            for (int i = 0; i < validUsers.length; i++) {
                if (name.equals(validUsers[i])) {
                    flag = 1;
                }// else throw new NullPointerException();
            }
            if (flag == 0)
                throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("" + "\n User validation failed");
        } finally {
            System.out.println("" + "\n Thank you for using this program.");
        }


    }

    void catchMe(int num1, int num2) {
        //TODO Catch exeption

        try {


            int result = num1 / num2;
            System.out.println("The result is :" + result);
        } catch (ArithmeticException arEx) {
            System.out.println("" + "\n Can not divide on zero!!!");
        } finally {
            System.out.println("" + "\n Thank you for using this program.");
        }

        //TODO prints a message "Thank you for using this program." always


    }
}

