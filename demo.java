abstract class test
{
abstract void display();
abstract void display2();

}
class test2 extends test
{
void display()
{	
System.out.println("Hello");
}
}
class demo
{
public static void main(String[]args)
{
test2 obj = new test2();
obj.display();
obj.display2();
      }
}
