import java.io.*;
import java.net.*;
public class E_Client{
	public static void main(String args[]){
		try
		{
			c=new Socket("localhost",8080);

		}
		try{
			os=new PrintStream(c.getOutputSream());
			is=new DataInputStream(System.in);
			is1=new DataInputStream(c.getOutputSream());
			do{
				System.out.println("client:");
				line=is.readLine();
				os.println(line);
				if(!line.equals("exit"))
					System.out.println("server:"+is1.readLine());

			}while(!line.equals("exit"));
		}
		catch(IOException e){
			System.out.println("socket closed");
		}
	}

}