package hrSystem;

public interface User {
	String getUsername();
    String getPassword();
    boolean login(String username, String password);
}
