package filtros;

import java.io.FileWriter;
import java.io.IOException;

import fileSystem.Output;

public class FiltroEncriptado implements Output{

	private FileWriter file;
	
	
	public FiltroEncriptado(String filename) throws IOException {
		this.file = new FileWriter(filename);
	}

	@Override
	public void send(char c) throws IOException {
		
		if(isNumber(c)) {
			c = (char) (((int) c)+1);
			
		}
		else {
			char value = c;
			int nextValue = (int)value + 1;
			c = (char)nextValue;
		}
		file.append(c);
		
	}

	@Override
	public void close() throws IOException {
		file.close();
	}
	
	
	private boolean isNumber(char charAt) {
		char[] numeros = new char[] {'0','1','2','3','4','5','6','7','8','9'};
		for(char n : numeros) {
			if(n==charAt)
				return true;
		}
		return false;
	}
}
