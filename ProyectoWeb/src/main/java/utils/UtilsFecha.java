package utils;

import java.util.Calendar;
import java.util.Date;

public class UtilsFecha {
	public static Date generaFecha(int anio) {
		Date fecha = null;
		Calendar calendario = Calendar.getInstance();

        //calendario.set(2019, Calendar.SEPTEMBER, 25, 18, 20, 10);
        calendario.set(Calendar.YEAR, anio);
        calendario.set(Calendar.MONTH, Calendar.DECEMBER);
        calendario.set(Calendar.DAY_OF_MONTH, 31);

        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 6);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 06);
        calendario.set(Calendar.SECOND, 00);
        calendario.set(Calendar.MILLISECOND, 000);

        fecha = calendario.getTime();
		
		return fecha;
	}


	public static Date generaFechaActual() {
		Date fecha = new Date();
		
		return fecha;
	}
	
	public static Date generaFechaMenosDias(int dias) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, -dias);
		Date nowMinusDays = c.getTime();
		System.out.println(nowMinusDays);
		return nowMinusDays;
	}
	
	
}
