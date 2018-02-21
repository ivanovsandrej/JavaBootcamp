package sef.ATestTask.Bonus;





//This ver. of Fibonacci include the right output, but user can insert

class Fibonacci{
    public static void main(String args[])
    {
        int n1=0,n2=1,n3,i,count=7;
        System.out.println("Here is output of Fibonacci of " + count + " numbers");
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)// i=2 it means loop is starting from 2
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }}