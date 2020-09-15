package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
	
	// retorne o sistema operacional em execução na máquina
		public String os() {
			String os = System.getProperty("os.name");
			String arch = System.getProperty("os.arch");
			String version = System.getProperty("os.version");
			return os + " v. " + version + " " + arch;
		}
		
		public void readProcess(String process) {
			try {
				Process p= Runtime.getRuntime().exec(process);
				InputStream fluxo = p.getInputStream();//fluxo de bits
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				if (linha.contains("Ethernet") && linha.contains("IPv4")) {
					System.out.println(linha);
					linha = buffer.readLine();
				}
				buffer.close();
				leitor.close();
				fluxo.close();
				} catch (IOException e){
				e.printStackTrace();
			}
			}

}
