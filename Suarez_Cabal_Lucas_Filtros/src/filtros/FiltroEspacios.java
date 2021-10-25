package filtros;

import java.io.FileWriter;
import java.io.IOException;

import fileSystem.Output;

public class FiltroEspacios  implements Output{
	boolean lastCharWasSpace;
	private FileWriter file;
	
	public FiltroEspacios(String fileName) throws IOException {
		this.file = new FileWriter(fileName);
		lastCharWasSpace = false;
	}

	@Override
	public void send(char c) throws IOException {
		if(c==' ') {
			if(!lastCharWasSpace) {
				lastCharWasSpace=true;
				file.append(c);
			}
		}
		else {
			lastCharWasSpace=false;
			file.append(c);
		}
		
	}

	@Override
	public void close() throws IOException {
		file.close();
		
	}

}
