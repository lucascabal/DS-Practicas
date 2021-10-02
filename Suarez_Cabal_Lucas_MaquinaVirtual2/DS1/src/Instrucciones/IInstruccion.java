package Instrucciones;

import VirtualMachine.VirtualMachine;

public interface IInstruccion {
	public VirtualMachine execute(VirtualMachine vm);
}
