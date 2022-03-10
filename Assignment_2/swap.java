class swap
{
public static void main(String args[])
{
int a = 15;
int b = 75;
 
  int t;
 
 System.out.println("Before swap a = "+a+"\n"+"Before swap b ="+b);
 
  t = a;
  a = b;
  b = t;
 
 System.out.println("After swap a = "+a+"\n"+"After swap b =" +b);
 }
}