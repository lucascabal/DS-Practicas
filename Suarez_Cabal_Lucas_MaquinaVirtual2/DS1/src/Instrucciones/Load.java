package Instrucciones;

import VirtualMachine.VirtualMachine;

public class Load extends AInstruccion{

	public Load() {
		super();
	}
	
	
	public VirtualMachine execute(VirtualMachine vm) {
		int direccion= vm.pop();
		vm.push(vm.memoria[direccion]);
		vm.ip++;
		return vm;
	}
}
