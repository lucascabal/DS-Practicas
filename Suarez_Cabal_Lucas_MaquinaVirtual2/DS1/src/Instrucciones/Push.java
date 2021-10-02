package Instrucciones;

import VirtualMachine.VirtualMachine;

public class Push extends AInstruccion{

	public Push() {
		super();
	}
	
	
	public VirtualMachine execute(VirtualMachine vm) {
		vm.push(val);
		vm.ip++;
		return vm;
	}
}
