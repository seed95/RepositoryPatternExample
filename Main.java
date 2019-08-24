


public class Main {


	public static void main(String[] args) {
		DataBase db = new DataBase();
		Server remote = new Server();

		System.out.println("Data from database:\t" + db.getUser());
		System.out.println("Data from server:\t" + new String(remote.getUser()));
	}
}