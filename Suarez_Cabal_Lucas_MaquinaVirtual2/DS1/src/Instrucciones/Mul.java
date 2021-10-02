package Instrucciones;

import VirtualMachine.VirtualMachine;

public class Mul extends AInstruccion{

	public Mul() {
		super();
	}
	
	
	public VirtualMachine execute(VirtualMachine vm) {
		int a = vm.pop();
		int b = vm.pop();
		vm.push(a*b);
		vm.ip++;
		return vm;
	}
}
