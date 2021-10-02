package Instrucciones;

import VirtualMachine.VirtualMachine;

public class Jmp extends AInstruccion{
	

	public Jmp() {
		super();
	}
	
	
	public VirtualMachine execute(VirtualMachine vm) {
		vm.ip=val;
		return vm;
	}
}
