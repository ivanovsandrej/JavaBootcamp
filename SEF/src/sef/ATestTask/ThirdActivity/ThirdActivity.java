package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
        try {
            ta.validateUser("Ivan3");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        ta.catchExeption();
        ta.catchMe(10,0);
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println(arr[i]);
            }catch (ArrayIndexOutOfBoundsException arrE){
                System.out.println("Array out of Bounds");
            }



        }
        System.out.println("This should get printed even if there is an exception");

    }

    void validateUser(String name) throws CustomException {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        int flag = 0;
        for(int i = 0; i < validUsers.length; i++ ){
            if(validUsers[i]==name)flag = 1;
        }
        //TODO if name in a list -> set flag=1
        // if at the end flag=0 -> throw the exeption
        if(flag==0)throw new CustomException();
    }

    void catchMe(int num1, int num2)
    {
        //TODO Catch exeption
            try{
                int result=num1/num2;
                System.out.println("The result is :" + result);
            }catch (ArithmeticException aE){
                System.out.println(aE.getStackTrace());
            }


            //TODO prints a message "Thank you for using this program." always
            System.out.println("Thank you for using this program.");

    }

    private class CustomException extends Exception {
        @Override
        public String getMessage() {
            return "Program is not available";
        }

    }
}

