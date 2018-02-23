package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity thirdActivity = new ThirdActivity();
        //TODO handle exception on proper way
        try {
            thirdActivity.validateUser("Ivan");
        } catch (CustomExceptionActivity e) {
            System.out.println("You are not allowed to use this program");
        }
        thirdActivity.catchException();
        thirdActivity.catchMe(2,0);
    }


    void catchException() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of list");
        } finally {
            System.out.println("This should get printed even if there is an exception");
        }
    }

    static void validateUser(String name) throws CustomExceptionActivity {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        int flag = 0;
        for (int i = 0; i < 4; i++) {
            if (validUsers[i] == name) {
                flag = 1;
            }
            if (flag > 0)

            {
                System.out.println("Welcome to Payroll program");
            } else {
                throw new CustomExceptionActivity();
            }
        }
        //TODO if name in a list -> set flag=1
        // if at the end flag=0 -> throw the exception
    }

    void catchMe(int num1, int num2) {
        //TODO Catch exeption
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        } catch (ArithmeticException e) {
            System.out.println("Don't divide with 0");
        } finally {
            System.out.println("Thank you for using this program.");
        }
    }

    private static class CustomExceptionActivity extends Throwable {
        public String getMessage() {
            return "You are not allowed to use this program";
        }
    }
}

