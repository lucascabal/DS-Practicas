import java.io.*;
import java.util.*;

import VirtualMachine.Loader;

public class Main {

	
	

	public static void main(String[] args) throws Exception {
		

		ejecutaPrograma();
	}

	private static void ejecutaPrograma() throws Exception {
		Loader loader=new Loader();
		loader.load();
		loader.ejecutar();
		
	}






}
