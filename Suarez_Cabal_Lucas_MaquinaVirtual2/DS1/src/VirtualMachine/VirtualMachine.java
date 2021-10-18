package VirtualMachine;


public class VirtualMachine {
	
	public int ip = 0;

	public int[] memoria = new int[1024];

	public int[] pila = new int[32];
	public int sp = 0;
	
	
	public VirtualMachine() {
		this.ip=0;
		this.memoria= new int[1024];
		this.pila=new int[32];
		this.sp=0;
	}
	
	
	public void push(int valor) {
		pila[sp] = valor;
		sp++;
	}

	public int pop() {
		sp--;
		return pila[sp];
	}
	
}
