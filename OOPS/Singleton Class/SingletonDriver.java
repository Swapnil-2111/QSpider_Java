class ConnectionDatabase{
    private static ConnectionDatabase obj;
    String username;
    String password;

    private ConnectionDatabase(String username, String password){
        super();
        this.username=username;
        this.password=password;
    }

    public static ConnectionDatabase getInstance(String username, String password){
        if (obj==null) {
            obj=new ConnectionDatabase(username, password);
        }
        return obj;

    }

    public void connectionWithDataBase(){
        System.out.println("User u have connected with the DataBase.");
        System.out.println("\n DataBase Credentials: \n USERNAME:"+username+"\n PASSWORD:"+password);
    }
}




public class SingletonDriver {
    public static void main(String[] args) {
        String username="admin";
        String password="admin";
        
        
        
        //  // Correct object reference
        // ConnectionDatabase obj1 = ConnectionDatabase.getInstance(username, password);
        // obj1.connectionWithDataBase();


      
        // First call: creates the singleton object
        ConnectionDatabase.getInstance("admin", "admin").connectionWithDataBase();

        // Second call: does NOT create a new object, just reuses the first one
        ConnectionDatabase.getInstance("root", "root").connectionWithDataBase();
     

    }
}
