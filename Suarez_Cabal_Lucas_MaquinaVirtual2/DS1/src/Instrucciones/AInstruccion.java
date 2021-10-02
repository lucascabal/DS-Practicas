package Instrucciones;

import VirtualMachine.VirtualMachine;

public abstract class AInstruccion implements IInstruccion {
	
	
	public int val;

	public AInstruccion () {
		
	}
	
	public VirtualMachine execute(VirtualMachine vm) {
		return null;
	}
	
	
	
}
