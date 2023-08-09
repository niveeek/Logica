import neto.util.extraer.datos.Estructura;
import neto.util.extraer.datos.ExtraerDatos;
import neto.util.extraer.datos.ExtraerDatosImpl;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PruebaExtraccion {
	public static void main(String[] args) {
        final int LONG_3 = 3;
        final int LONG_4 = 4;
        final int LONG_9 = 9;
        final int LONG_10 = 10;
        final int LONG_15 = 15;
        final int LONG_17 = 17;
        final int LONG_18 = 18;
        final int LONG_30 = 30;
        final int LONG_35 = 35;
        final int LONG_300 = 300;
		ExtraerDatos extraer = new ExtraerDatosImpl();
		List<Map<String, String>> result = new ArrayList<>();
        Map<String, Estructura> datos = new HashMap<>();
        datos.put("numeroCuentaBancaria", new Estructura(1, LONG_18));
        datos.put("fechaOperacion", new Estructura(19, LONG_10));
        datos.put("fechaAplicacion", new Estructura(29, LONG_10));
        datos.put("numeroSucursalOperante", new Estructura(39, LONG_4));
        datos.put("numeroMovimiento", new Estructura(43, LONG_9));
        datos.put("saldoInicialMovimiento", new Estructura(53, LONG_17));
        datos.put("codigoOperacion", new Estructura(70, LONG_3));
        datos.put("descripcionOperacion", new Estructura(73, LONG_30));
        datos.put("importeMovimiento", new Estructura(104, LONG_17));
        datos.put("concepto", new Estructura(121, LONG_35));
        datos.put("saldoFinalMovimiento", new Estructura(157, LONG_17));
        datos.put("referenciaInterna", new Estructura(174, LONG_15));
        datos.put("detalleTransaccion", new Estructura(189, LONG_300));
		File folder = new File("C:\\jboss-eap-7.3\\standalone\\crones\\03_35_041944666_01720171932512_230620_0000.txt");
		try {
			result = extraer.extraerDatos(folder, datos);
			result.forEach(System.out::println);
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
