import java.io.File;
import java.io.IOException;

class CreateFile
{
public static void main(String args[])
{
try
{
File fo=new File("fileoperation.txt");
if(fo.createNewFile())
{
System.out.println("File"+fo.getName()+"is creates successfully");
}
else
{
System.out.println("File is already exist in the directory");
}
}
catch(IOException exception)
{
System.out.println("An unexcepted error is occured");
exception.printStackTrace();
}
}
}
