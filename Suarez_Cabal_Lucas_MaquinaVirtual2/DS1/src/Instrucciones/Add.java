package Instrucciones;

import VirtualMachine.VirtualMachine;

public class Add extends AInstruccion{

	public Add() {
		super();
	}
	
	
	public VirtualMachine execute(VirtualMachine vm) {
		vm.push(vm.pop() + vm.pop());
		vm.ip++;
		return vm;
	}
}
