package es.bufigol.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import es.bufigol.utilidades.INT_Constantes;
import es.bufigol.utilidades.Validador;

public class T_Validador {

	@Test
	public void testIsValidNick() {
		// testeo nullo
		assertFalse(Validador.isValidNick(null));
		// testeo estrictamente mayor que el maximo
		assertFalse(Validador.isValidNick(generateRandomString(INT_Constantes.MAX_NICK + 1)));
		assertFalse(Validador.isValidNick(generateRandomString(INT_Constantes.MAX_NICK + 2)));
		// testeo length maximo y minimo
		assertTrue(Validador.isValidNick(generateRandomString(INT_Constantes.MAX_NICK)));
		assertTrue(Validador.isValidNick(generateRandomString(INT_Constantes.MIN_NICK)));
		// testeo entre el rango
		assertTrue(Validador.isValidNick(generateRandomString(INT_Constantes.MIN_NICK + 2)));
		assertTrue(Validador.isValidNick(generateRandomString(INT_Constantes.MAX_NICK - 2)));

		// the same with number
		assertFalse(Validador.isValidNick(generateRandomStringWithNumbres(INT_Constantes.MAX_NICK + 1)));
		assertFalse(Validador.isValidNick(generateRandomStringWithNumbres(INT_Constantes.MAX_NICK + 2)));
		// testeo length maximo y minimo
		assertTrue(Validador.isValidNick(generateRandomStringWithNumbres(INT_Constantes.MAX_NICK)));
		assertTrue(Validador.isValidNick(generateRandomStringWithNumbres(INT_Constantes.MIN_NICK)));
		// testeo entre el rango
		assertTrue(Validador.isValidNick(generateRandomStringWithNumbres(INT_Constantes.MIN_NICK + 2)));
		assertTrue(Validador.isValidNick(generateRandomStringWithNumbres(INT_Constantes.MAX_NICK - 2)));

	}

	@Test
	public void testIsValidName() {
		// testeo nullo
		assertFalse(Validador.isValidName(null));
		// testeo estrictamente mayor que el maximo
		assertFalse(Validador.isValidName(generateRandomString(INT_Constantes.MAX_NICK + 1)));
		assertFalse(Validador.isValidName(generateRandomString(INT_Constantes.MAX_NICK + 2)));
		// testeo length maximo y minimo
		assertTrue(Validador.isValidName(generateRandomString(INT_Constantes.MAX_NICK)));
		assertTrue(Validador.isValidName(generateRandomString(INT_Constantes.MIN_NICK)));
		// testeo entre el rango
		assertTrue(Validador.isValidName(generateRandomString(INT_Constantes.MIN_NICK + 2)));
		assertTrue(Validador.isValidName(generateRandomString(INT_Constantes.MAX_NICK - 2)));

		// the same with number
		assertFalse(Validador.isValidName(generateRandomStringWithNumbres(INT_Constantes.MAX_NICK + 1)));
		assertFalse(Validador.isValidName(generateRandomStringWithNumbres(INT_Constantes.MAX_NICK + 2)));
		// testeo length maximo y minimo
		assertFalse(Validador.isValidName(generateRandomStringWithNumbres(INT_Constantes.MAX_NICK)));
		assertFalse(Validador.isValidName(generateRandomStringWithNumbres(INT_Constantes.MIN_NICK)));
		// testeo entre el rango
		assertFalse(Validador.isValidName(generateRandomStringWithNumbres(INT_Constantes.MIN_NICK + 2)));
		assertFalse(Validador.isValidName(generateRandomStringWithNumbres(INT_Constantes.MAX_NICK - 2)));
	}

	private String generateRandomStringWithNumbres(int integer) {
		// Array where whe get the letters
		String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
				"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7",
				"8", "9", " " };
		int min = 0; // minimum of the random number
		int max = letters.length - 1; // maximum of the random number
		int random; // declaration for storing the random number
		String exit = ""; // initialization the exit value.
		for (int i = 0; i < integer; i++) {
			// Generate a random number and cast it to int form double
			random = (int) (Math.random() * (max - min + 1) + min);
			exit += letters[random]; // get the random letter from the arrya and add it to the exit value
		}
		return exit;
	}

	private String generateRandomString(int integer) {
		// Array where whe get the letters
		String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
				"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " " };
		int min = 0; // minimum of the random number
		int max = letters.length - 1; // maximum of the random number
		int random; // declaration for storing the random number
		String exit = ""; // initialization the exit value.
		for (int i = 0; i < integer; i++) {
			// Generate a random number and cast it to int form double
			random = (int) (Math.random() * (max - min + 1) + min);
			exit += letters[random]; // get the random letter from the arrya and add it to the exit value
		}
		return exit;
	}
}
