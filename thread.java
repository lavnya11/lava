import java.util.random;
class square extends thread
{
int x;
square(int n)
{
x=n;
}
public void run()
{
int sqr=x**;
system.out.println("square of"+"*"+sqr);
}
}
class cube extends thread
{
int x;
cube(int n)
{
x=n;
}
public void run(){
int cube=x*x*x*;
system.out.println("cube of"+""+cube);
}}
class number extends thread
{
public void run()
{
random random=new random();
for(int i=0;i<10;i++)
{
int random integer=random.nextInt(100);
generated:"+random integer);
c.start();
try{
thread.sleep(100);
}
catch(inteupted exception ex){
System.out.println(ex);
}
}
}
}
public class LAB 3B{
public static void main(string args{})
{
numbern=new  number();
n.start();
}
}

