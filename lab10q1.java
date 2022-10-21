class Database {
    private static String filename;
    private static Database instance;
    private Database(String newFile) {
        this.filename = newFile;
        System.out.printf("Create a connection to %s\n", this.filename);
    }
    public void executeQuery(String query) {
        System.out.printf("Execute %s from the %s database\n", query, this.filename);
    }
    public static Database getInstance(String filename) {
    	if(instance == null) {
    		instance = new Database(filename);
    	}
        return instance;
    }
    public static String getFilename() {
        return filename;
    }
}
