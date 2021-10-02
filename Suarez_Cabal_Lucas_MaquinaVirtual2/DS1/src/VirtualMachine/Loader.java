package VirtualMachine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import Instrucciones.AInstruccion;

public class Loader {
	
	private List<AInstruccion> instrucciones = new ArrayList<AInstruccion>();
	private VirtualMachine vm;
	
	public Loader() {
		this.vm=new VirtualMachine();
	}
	
	public void load() throws Exception{
		BufferedReader fichero = new BufferedReader(new FileReader("programa.txt"));
		String linea;
		while ((linea = fichero.readLine()) != null)
			cargaInstruccion(linea);
		fichero.close();
	}
	
	
	private void cargaInstruccion(String linea) throws Exception {
		if (linea.trim().length() == 0)
			return;

		String[] palabras = linea.split(" ");
		String clase = palabras[0];
		clase = clase.substring(0, 1).toUpperCase() + clase.substring(1);
		AInstruccion inst = (AInstruccion) Class.forName("Instrucciones."+clase).getDeclaredConstructor().newInstance();
		if(palabras.length>1) {
			if(palabras[1]!="")
				inst.val=Integer.parseInt(palabras[1]);
		}
		instrucciones.add(inst);
	}
	
	public void ejecutar() {
		vm=new VirtualMachine();
		while(vm.ip < instrucciones.size())
			vm = instrucciones.get(vm.ip).execute(vm);
		}
	
}
