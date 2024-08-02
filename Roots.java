import java.util.Scanner;
class Roots
{
public static void main(String[] args)
{
double a,b,c;
double root1,root2,determinant;
Scanner sc=new Scanner(System.in);
System.out.print("enter a:");
a=sc.nextDouble();
System.out.print("enter b:");
b=sc.nextDouble();
System.out.print("enter c:");
c=sc.nextDouble();
determinant=b*b-4*a*c;
if(determinant>0)
{
root1=(-b+Math.sqrt(determinant))/(2*a);
root2=(-b-Math.sqrt(determinant))/(2*a);
System.out.format("root1=%.2f and root2=%.2f",root1,root2);
}
else if(determinant==0)
{
root1=root2=(-b)/(2*a);
System.out.format("root1=root2=%.2f",root1);
}
else
{
double real=-b/(2*a);
double imaginary=Math.sqrt(-determinant)/(2*a);
System.out.format("root1=%.2f+%.2fi",real,imaginary);
System.out.format("root2=%.2f-%.2fi",real,imaginary);
}
}
}