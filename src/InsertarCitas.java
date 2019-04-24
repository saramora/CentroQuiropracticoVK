import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class InsertarCitas {

	public static void main(String[] args) {
        // Instanciamos la clase Ejemplo
		InsertarCitas citas = new InsertarCitas();
	        
        // Creamos las fechas utilizando la clase Calendar (recomendado)
        Calendar c1 = Calendar.getInstance();
        c1.set(2019, 03, 01); // Recuerda, en Java los meses empiezan desde 0
	                              // por lo tanto el mes 02 equivale a Marzo.
        Calendar c2 = Calendar.getInstance();
        c2.set(2019, 03, 30);
	        
        // Obtenemos la lista de fechas utilizando el método que está líneas más abajo
        java.util.List<Date> listaEntreFechas = citas.getListaEntreFechas(c1.getTime(), c2.getTime());
	        
        // Creamos el SimpleDateFormat con nuestro patrón deseado E yyyy-MM-dd
        //SimpleDateFormat sdf = new SimpleDateFormat("E yyyy-MM-dd");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        // Recorremos la lista 
        for (Date date : listaEntreFechas) {
        	
        	
            // Imprimimos en consola la fecha formateada
            //System.out.println(sdf.format(date));
            if(date.getDay() > 0 && date.getDay() < 6) {
            	String query1 = "insert into centrovk.CITAS (FECHA, HORARIO, DISPONIBLE) values (STR_TO_DATE('" + sdf.format(date) + "', '%d/%m/%Y'), '10:00 - 11:00', 'S');";
            	
            	String query2 = "insert into centrovk.CITAS (FECHA, HORARIO, DISPONIBLE) values (STR_TO_DATE('" + sdf.format(date) + "', '%d/%m/%Y'), '11:00 - 12:00', 'S');";
            	
            	String query3 = "insert into centrovk.CITAS (FECHA, HORARIO, DISPONIBLE) values (STR_TO_DATE('" + sdf.format(date) + "', '%d/%m/%Y'), '12:00 - 13:00', 'S');";
            	
            	String query4 = "insert into centrovk.CITAS (FECHA, HORARIO, DISPONIBLE) values (STR_TO_DATE('" + sdf.format(date) + "', '%d/%m/%Y'), '17:00 - 18:00', 'S');";
            	
            	String query5 = "insert into centrovk.CITAS (FECHA, HORARIO, DISPONIBLE) values (STR_TO_DATE('" + sdf.format(date) + "', '%d/%m/%Y'), '18:00 - 19:00', 'S');";
            	
            	String query6 = "insert into centrovk.CITAS (FECHA, HORARIO, DISPONIBLE) values (STR_TO_DATE('" + sdf.format(date) + "', '%d/%m/%Y'), '19:00 - 20:00', 'S');";
            	
            	System.out.println(query1);
            	System.out.println(query2);
            	System.out.println(query3);
            	System.out.println(query4);
            	System.out.println(query5);
            	System.out.println(query6);
            }
	    }
        
    }
	    
	/**
	  * Método para obtener una lista con fechas en el intervalo indicado
	  * @param fechaInicio Fecha inicial del intervalo
	  * @param fechaFin Fecha final del intervalo
	  * @return Fecha final
	  */
	public List<Date> getListaEntreFechas(Date fechaInicio, Date fechaFin) {
		// Convertimos la fecha a Calendar, mucho más cómodo para realizar
	    // operaciones a las fechas
	    Calendar c1 = Calendar.getInstance();
	    c1.setTime(fechaInicio);
	    Calendar c2 = Calendar.getInstance();
	    c2.setTime(fechaFin);
	        
	    // Lista donde se irán almacenando las fechas
	    List<Date> listaFechas = new ArrayList<Date>();
	        
	    // Bucle para recorrer el intervalo, en cada paso se le suma un día.
	    while (!c1.after(c2)) {
	    	listaFechas.add(c1.getTime());
	        c1.add(Calendar.DAY_OF_MONTH, 1);
	    }
	    return listaFechas;
	}	
}

