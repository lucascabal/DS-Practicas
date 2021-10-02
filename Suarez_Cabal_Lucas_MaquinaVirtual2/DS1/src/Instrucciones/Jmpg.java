package Instrucciones;

import VirtualMachine.VirtualMachine;

public class Jmpg extends AInstruccion{
	

	public Jmpg() {
		super();
	}
	
	
	public VirtualMachine execute(VirtualMachine vm) {
		int b= vm.pop();
		int a = vm.pop();
		if(a>b)
			vm.ip=val;
		else
			vm.ip++;
		return vm;
	}
}
