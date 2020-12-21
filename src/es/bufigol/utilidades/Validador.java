package es.bufigol.utilidades;

public class Validador {

	public static boolean isValidNick(String nick) {
		boolean exit = false;
		if ((nick != null) && (nick.length() >= INT_Constantes.MIN_NICK)
				&& (nick.length() <= INT_Constantes.MAX_NICK)) {
			exit = true;
		}
		return exit;
	}

	public static boolean isValidName(String name) {
		boolean exit = false;
		if ((name != null) && (name.length() >= INT_Constantes.MIN_NICK)
				&& (name.length() <= INT_Constantes.MAX_NICK)) {
			exit = true;
		}
		while (exit) {
			int i = 0;
			Character space = ' ';
			if ((!(space.equals(name.charAt(i)))) && (!(Character.isLetter(name.charAt(i))))) {
				exit = false;
			}
			i++;
		}
		return exit;
	}
}
