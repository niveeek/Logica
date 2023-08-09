import neto.util.extraer.datos.bean.EstructuraDatos;
import neto.util.extraer.datos.dto.ExtraccionImp;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PruebaExtraccion2 {
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
        ExtraccionImp extraer = new ExtraccionImp();
        List<Map<String, String>> result;
        Map<String, EstructuraDatos> datos = new HashMap<>();
        datos.put("numeroCuentaBancaria", new EstructuraDatos(1, LONG_18));
        datos.put("fechaOperacion", new EstructuraDatos(19, LONG_10));
        datos.put("fechaAplicacion", new EstructuraDatos(29, LONG_10));
        datos.put("numeroSucursalOperante", new EstructuraDatos(39, LONG_4));
        datos.put("numeroMovimiento", new EstructuraDatos(43, LONG_9));
        datos.put("saldoInicialMovimiento", new EstructuraDatos(53, LONG_17));
        datos.put("codigoOperacion", new EstructuraDatos(70, LONG_3));
        datos.put("descripcionOperacion", new EstructuraDatos(73, LONG_30));
        datos.put("importeMovimiento", new EstructuraDatos(104, LONG_17));
        datos.put("concepto", new EstructuraDatos(121, LONG_35));
        datos.put("saldoFinalMovimiento", new EstructuraDatos(157, LONG_17));
        datos.put("referenciaInterna", new EstructuraDatos(174, LONG_15));
        datos.put("detalleTransaccion", new EstructuraDatos(189, LONG_300));
        File folder = new File("C:\\jboss-eap-7.3\\standalone\\crones\\03_35_041944666_01720171932512_230620_0000.txt");
        try {
            result = extraer.extraerDatos(folder, datos, 5);
            result.forEach(System.out::println);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
