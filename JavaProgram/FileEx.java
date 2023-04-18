import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
public class FileEx 
{
	public static void main(String[] args) throws IOException
	{
	File f=new File("C://Users//HP//v.txt");
	PrintWriter pw=new PrintWriter(f);
	pw.println(" this is an example");
	pw.println();//empty line
	pw.println(100);
	pw.println('M');//next data will be print in same line bcoz print() method is called
	pw.println(true);
	pw.println(123.52f);
	pw.close();
	FileReader fr=new FileReader(f);
	BufferedReader bf=new BufferedReader(fr);
	
	System.out.println("Reading from file");
	String s=bf.readLine();//reading data line line from given file
	while(s!=null)// checking any data is there or not to print
	{
		System.out.println(s);// if the data is there in file,then printing it to console
		s=bf.readLine();//reading each line
	}
	bf.close();

	}

}
