package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
        try {
            ta.validateUser("Ivan");
        } catch (Exception exc) {
            System.out.println("Exception was thrown when validating the user");
        }
        ta.catchExeption();

        ta.catchMe(10, 2); // fine
        ta.catchMe(5, 0); // fine too even though we divide by 0
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println(arr[i]);
            } catch (Exception ex) {
                System.out.println("Exception while printing the contents of the array");
            }
        }
        System.out.println("This should get printed even if there is an exception");
    }

    void validateUser(String name) throws Exception {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        int flag = 0;
        //TODO if name in a list -> set flag=1
        for (int index = 0; index < validUsers.length; index++)
            if (validUsers[index] == name)
                flag = 1;
        // if at the end flag=0 -> throw the exeption
        if (flag == 0)
            throw new Exception("Invalid USER!");
    }

    void catchMe(int num1, int num2)
    {
        //TODO Catch exeption
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        } catch (Exception ex) {
            System.out.println("exception when trying to divide the numbers!");
        } finally {
           //TODO prints a message "Thank you for using this program." always
            System.out.println("Thank you for using this program.");
        }
    }
}
