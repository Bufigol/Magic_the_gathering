package es.bufigol.entidades;

import java.time.LocalDateTime;

import es.bufigol.interfaces.INT_Player;

public class Player implements INT_Player {
	private String name;
	private String nick;
	private String email;
	private String password;
	private int idNumber;
	private LocalDateTime fechaCreacion;

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
		this.fechaCreacion = LocalDateTime.now();
	}

	@Override
	public void playsMatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean updateDataFromServer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateDataToServer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createDeck() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the nick
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the idNumber
	 */
	public int getIdNumber() {
		return idNumber;
	}

	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param nick the nick to set
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}