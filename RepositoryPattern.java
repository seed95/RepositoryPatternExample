

public class RepositoryPattern {

	private DataBase db;
	private Server remote;

	public RepositoryPattern() {
		db = new DataBase();
		remote = new Server();
	}


	public String getUser1() {
		return "Data from database:\t" + db.getUser();
	}

	public String getUser2() {
		return "Data from server:\t" + new String(remote.getUser());
	}

}