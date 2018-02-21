package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
        ta.validateUser("Ivan");
        ta.catchExeption();
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {

            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This should get printed even if there is an exception");
        } finally {
            System.out.println("Thank you for using this service");
        }
    }


    void validateUser(String name) {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        int flag = 0;

        int i;
        //TODO if name in a list -> set flag=1
        for (i = 0, i < validUsers.length, i++) {
            if (validUsers[i].equals(name)) {
                flag = 1;
            }
        }
        if (flag == 0) throw new NullPointerException();
        // if at the end flag=0 -> throw the exeption
    }


    void catchMe(int num1, int num2) {
        //TODO Catch exeption
        num1 = 10;
        num2 = 0;
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        } catch (NullPointerException e) {
            System.out.println("You cannot divide by zero");

            //TODO prints a message "Thank you for using this program." always
        } finally {
            System.out.println("Thank you for using this program.");
        }
    }
}


