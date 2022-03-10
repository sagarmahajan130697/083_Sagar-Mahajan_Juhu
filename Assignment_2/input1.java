
//Q.no-06;
import java.util.Scanner;
class input1
{
public static void main(String args[])
{
Scanner p = new Scanner ("125 24");

System.out.println("Enter The Two Numbers = ");
int no1 = p.nextInt();
int no2 = p.nextInt();

 int add = no1+no2;
 int sub = no1-no2;
 int mul = no1*no2;
 int div = no1/no2;
 int rem = no1%no2;
 
System.out.println(add); 
System.out.println(sub);
System.out.println(mul);
System.out.println(div);
System.out.println(rem);
}
}