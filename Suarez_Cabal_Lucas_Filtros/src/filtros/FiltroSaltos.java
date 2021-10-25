package filtros;

import java.io.FileWriter;
import java.io.IOException;

import fileSystem.Output;

public class FiltroSaltos  implements Output{
	boolean lastCharWasBack;
	private FileWriter file;
	
	public FiltroSaltos(String fileName) throws IOException {
		this.file = new FileWriter(fileName);
		lastCharWasBack = false;
	}

	@Override
	public void send(char c) throws IOException {
		if(c=='\\') {
			lastCharWasBack = true;
			file.append(c);
		}
		else {
			if(lastCharWasBack) {
				if(c=='r') {
					file.append('t');
					lastCharWasBack=false;
				}
				else {
					file.append(c);
					lastCharWasBack=false;
				}
			}
			else {
				file.append(c);
			}
		}
	}

	@Override
	public void close() throws IOException {
		file.close();
		
	}

}
