
public class Usuario {
	@ValidField(minLength = 1, maxLength = 10)
	String name;
	
	@ValidField(minLength = 1, maxLength = 5)
	String password;

	public Usuario() {
		this(null, null);
	}
	
	public Usuario(String name, String passw) {
		this.setName(name);
		this.setPassword(passw);
	}
	
	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
