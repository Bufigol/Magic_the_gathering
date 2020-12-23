package es.bufigol.entidades;

public class Player {
	private String name;
	private String nick;
	private String email;
	private String password;
	private int idNumber;

	/**
	 * 
	 */
	public Player() {
		super();
	}

	/**
	 * @param name
	 * @param nick
	 * @param email
	 * @param password
	 * @param idNumber
	 */
	public Player(String name, String nick, String email, String password, int idNumber) {
		this.name = name;
		this.nick = nick;
		this.email = email;
		this.password = password;
		this.idNumber = idNumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the nick
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * @param nick the nick to set
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the idNumber
	 */
	public int getIdNumber() {
		return idNumber;
	}

	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

}
