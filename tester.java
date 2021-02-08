package minor_project;
import java.io.*;
import java.util.Scanner;
public class tester
{
    public static void main(String[] args)throws IOException
    {
        System.setIn(new FileInputStream("C:\\Users\\saksham\\Desktop\\file1.txt"));
        Scanner sc=new Scanner(System.in);
        int a,i=0;
        int b=sc.nextInt();
        while(b>0)
        {b--;
        a=sc.nextInt();
        System.out.println("integer is: "+a+"  "+i++);
        }
    }
}