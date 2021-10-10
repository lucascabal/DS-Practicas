import campo.CampoNombre;
import campo.CampoNumero;
import campo.CampoUbicacion;

public class Main {

	public static void main(String[] args) {
		Formulario formulario = new Formulario();

		formulario.addCampo(new CampoNombre("Nombre"));
		formulario.addCampo(new CampoNombre("Apellido"));
		formulario.addCampo(new CampoNumero("Telefono"));
		formulario.addCampo(new CampoUbicacion("Ciudad"));
		formulario.PideDatos();
	}
}
