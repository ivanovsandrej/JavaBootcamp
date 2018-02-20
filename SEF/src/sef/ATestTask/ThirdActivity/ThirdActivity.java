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
        try {
            int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getStackTrace());
        }
         finally {
            System.out.println("Program did run");
        }
    }


    void validateUser(String name) {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        try {
            int flag = 0;
            //TODO if name in a list -> set flag=1
            if(flag==0) throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program did run");
        }
        // if at the end flag=0 -> throw the exeption
    }

    void catchMe(int num1, int num2)
    {
        //TODO Catch exeption
            int result=num1/num2;
            System.out.println("The result is :" + result);

            //TODO prints a message "Thank you for using this program." always
            System.out.println("Thank you for using this program.");

    }
}

