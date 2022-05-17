import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class MainApp {
	public static void main(String[] args) {
		String filepath = "Transport.txt";
		ModeTransport t1 = new ModeTransport(93270,"Audi RSQ8",350000);
		try
		{
			FileWriter fw = new FileWriter(filepath,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println(t1);
			pw.flush();
			pw.close();
			
			JOptionPane.showMessageDialog(null, "Record Saved");
		}
		catch(Exception c)
		{
			JOptionPane.showMessageDialog(null, "Record not Saved");

		}
	}
	public static void saveRecord(int id,String title,double prix,String filepath) {
		
	}
}
