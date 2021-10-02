package Instrucciones;

import VirtualMachine.VirtualMachine;

public class Output extends AInstruccion{

	public Output() {
		super();
	}
	
	
	public VirtualMachine execute(VirtualMachine vm) {
		System.out.println(vm.pop());
		vm.ip++;
		return vm;
	}
}
