package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quepiedraaplastalagarto() {
		Mano JugadorUno = new Mano(Forma.LAGARTO);
		Mano JugadorDos = new Mano(Forma.PIEDRA);
		
		assertEquals("Lagarto es aplastado por piedra",
				Resultado.PIERDE, JugadorUno.jugarCon(JugadorDos));	
	}

}
