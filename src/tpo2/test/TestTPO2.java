package tpo2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tpo2.Ejercicios;

public class TestTPO2 {


	@Test
	public void testARomanos() {
		assertEquals("I", Ejercicios.aRomanos(1));
		assertEquals("XXII", Ejercicios.aRomanos(22));
		assertEquals("XLIX", Ejercicios.aRomanos(49));
		assertEquals("MMXIII", Ejercicios.aRomanos(2013));
		assertEquals("MCMLXXVIII", Ejercicios.aRomanos(1978));
	}
	
	@Test
	public void testIntercambiarFilas() {
		int[][] caso1 =
			{
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}
			};
		
		int[][] caso1matriz0 =
			{
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}
			};

		
		int[][] caso1matriz1 =
			{
					{5,6,7,8},
					{1,2,3,4},
					{9,10,11,12},
					{13,14,15,16}
			};

		int[][] caso1matriz2 =
			{
					{13,14,15,16},
					{5,6,7,8},
					{9,10,11,12},
					{1,2,3,4}
			};
		
		
		assertArrayEquals(caso1matriz1, Ejercicios.intercambiarFilas(caso1, 0, 1));
		assertArrayEquals(caso1matriz0, Ejercicios.intercambiarFilas(caso1, 1, 0));
		assertArrayEquals(caso1matriz2, Ejercicios.intercambiarFilas(caso1, 0, 3));
		assertArrayEquals(caso1matriz0, Ejercicios.intercambiarFilas(caso1, 0, 3));

		int[][] caso2 =
			{
					{1,2},
					{3,4,5,6},
					{7,8,9,10,11,12}
			};
	
		int[][] caso2matriz0 =
			{
					{1,2},
					{3,4,5,6},
					{7,8,9,10,11,12}
			};
		
		int[][] caso2matriz1 =
			{
					{7,8,9,10,11,12},
					{3,4,5,6},
					{1,2}
			};
	
		assertArrayEquals(caso2matriz1, Ejercicios.intercambiarFilas(caso2, 0, 2));
		assertArrayEquals(caso2matriz0, Ejercicios.intercambiarFilas(caso2, 0, 2));
	
	}
	
	
	@Test
	public void testCifradoVingenere() {
		assertEquals("aolxdjujepctyihtxsmhp", Ejercicios.cifradoVigenere("parisvautbienunemesse", "loup"));
		assertEquals("joyi", Ejercicios.cifradoVigenere("hola", "caniggia"));
		assertEquals("kafch t rasog tzvo", Ejercicios.cifradoVigenere("vamos a cazar algo", "pato"));
		assertEquals("miw nllokef stfuteq obv rx ubyyr mlum tmnlewv", Ejercicios.cifradoVigenere("las blancas siempre dan el jaque mate ganador", "bienmal"));
	}
	
	@Test
	public void testDecifradoVingenere() {
		assertEquals("las blancas siempre dan el jaque mate ganador", Ejercicios.decifradoVigenere("miw nllokef stfuteq obv rx ubyyr mlum tmnlewv", "bienmal"));
		assertEquals("el enemigo logro quebrar el frente defensivo y penetrar en la posicion propia", Ejercicios.decifradoVigenere("gz yamoijc zaaew qxsdfml mn ifgbfy lgfhbuwhi g phbghdue gn zc bifqeirb ddicqc", "comunicado"));
		assertEquals("la pelota no dobla", Ejercicios.decifradoVigenere("ge hsgsks is vcwpr", "verso"));
		assertEquals("la libertad consiste en poder hacer todo aquello que no cause perjuicio a los demas", Ejercicios.decifradoVigenere("oe wisetboq grrjmuas hr aouet vnfiu ksfv stygwlf scs qs gryul hhvlfitiq o osv uiohg", "declaraciondederechos"));		
	}

	
	@Test
	public void testSumarMatrices() {
		int[][] caso1operando1 =
			{
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}
			};

		int[][] caso1operando2 =
			{
					{-1,2,-3,4},
					{1,1,1,1},
					{12,11,10,9},
					{13,14,15,16}
			};
		
		int[][] caso1resultado =
			{
					{0,4,0,8},
					{6,7,8,9},
					{21,21,21,21},
					{26,28,30,32}
			};

		assertArrayEquals(caso1resultado, Ejercicios.sumarMatrices(caso1operando1, caso1operando2));
		
		
	}
	
}
