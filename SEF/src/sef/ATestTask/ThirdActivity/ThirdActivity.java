package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
        ta.validateUser("Ivan");
        ta.catchExeption(0);
    }

    void catchExeption(int number) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println("This should get printed even if there is an exception");
        }
    }

    void validateUser(String name) {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        int flag = 0;
        for (int i = 0; i <= 3; i++) {
            if (name.equals(validUsers[0])) {
                flag = 1;
            }
        }

        try {
            if (flag == 0) new Exception();
        } catch (Exception e) {
            System.out.println("Generic Exception");
        }

        //TODO if name in a list -> set flag=1
        // if at the end flag=0 -> throw the exeption
    }
       void catchMe(int num1, int num2) {
        //TODO Catch exeption
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception");
        } catch (Exception e) {
            System.out.println("Generic Exception");
        } finally {
            //TODO prints a message "Thank you for using this program." always
            System.out.println("Thank you for using this program.");

        }
    }
}
