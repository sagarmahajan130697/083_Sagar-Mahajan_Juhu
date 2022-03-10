import java.util.Scanner;
class avg
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter three Numbers As You Want ...!!!");

int cc = sc.nextInt();
int pp = sc.nextInt();
int bb = sc.nextInt();
  float avg= (cc+pp+bb)/3;
System.out.println("Enter three Numbers avg is = "+avg);
}
}
