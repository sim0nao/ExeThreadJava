package view;
import controller.RedesController;

public class Main {
	public static void main (String args[]) {
		 RedesController procController = new RedesController();	
		 String os = procController.os();
		 
		 System.out.println(os); //mostra dados do sistema operacional
		 
		 String process = "ipconfig";
		 procController.readProcess(process);
	}
	

}
