package Instrucciones;

import java.util.Scanner;

import VirtualMachine.VirtualMachine;

public class Input extends AInstruccion{
	
	private static Scanner console = new Scanner(System.in);

	public Input() {
		super();
	}
	
	
	public VirtualMachine execute(VirtualMachine vm) {
		System.out.println("Escriba un entero:");
		vm.push(console.nextInt());
		vm.ip++;
		return vm;
	}
}
