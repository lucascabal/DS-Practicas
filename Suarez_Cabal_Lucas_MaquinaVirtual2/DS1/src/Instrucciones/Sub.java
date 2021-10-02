package Instrucciones;

import VirtualMachine.VirtualMachine;

public class Sub extends AInstruccion{
	
	VirtualMachine vm = new VirtualMachine();

	public Sub() {
		super();
	}
	
	
	public VirtualMachine execute(VirtualMachine vm) {
		int a = vm.pop();
		int b = vm.pop();
		vm.push(a-b);
		vm.ip++;
		return vm;
	}
}
