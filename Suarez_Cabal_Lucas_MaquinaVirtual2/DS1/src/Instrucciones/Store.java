package Instrucciones;

import VirtualMachine.VirtualMachine;

public class Store extends AInstruccion{

	public Store() {
		super();
	}
	
	
	public VirtualMachine execute(VirtualMachine vm) {
		int valor = vm.pop();
		int direccion = vm.pop();
		vm.memoria[direccion] = valor;
		vm.ip++;
		return vm;
	}
}
