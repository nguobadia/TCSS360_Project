package database;

   import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
   import java.sql.SQLException;
   import java.sql.Statement;

   public class databaseManager
    {
	   private static Statement statement = null;
	   private static Connection connect = null;
	   private static String userSql;
	   
	   public static void main( String args[] ) {
		   createNewDatabase("users.db");
		createNewUserTable("users.db");
		  
		   
		   
	   }
	   public static void createNewUserTable(String databaseName) {
	        // SQLite connection string
	        String url = "jdbc:sqlite:" +databaseName;
	        // SQL statement for creating a new table
	        String sql = "CREATE TABLE IF NOT EXISTS users (\n"
	                + "	id integer PRIMARY KEY,\n"
	                + "	name text NOT NULL,\n"
	                + "	capacity real\n"
	                + ");";
	        
	        try (Connection conn = DriverManager.getConnection(url);
	                Statement stmt = conn.createStatement()) {
	            // create a new table
	            stmt.execute(sql);
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
		
	   public static void createNewProjectTable(String databaseName) {
	        // SQLite connection string
	        String url = "jdbc:sqlite:" +databaseName;
	        // SQL statement for creating a new table
	        String sql = "CREATE TABLE IF NOT EXISTS projects (\n"
	                + "	id integer PRIMARY KEY,\n"
	                + "	materialName text NOT NULL,\n"
	                + "	capacity real\n"
	                + ");";
	        
	        try (Connection conn = DriverManager.getConnection(url);
	                Statement stmt = conn.createStatement()) {
	            // create a new table
	            stmt.execute(sql);
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
		
	   public static void createNewDatabase(String fileName) {
		   
		   Connection c = null;
		      
		      try {
		         Class.forName("org.sqlite.JDBC");
		         c = DriverManager.getConnection("jdbc:sqlite:"+ fileName);
		         System.out.println("Opened database successfully");
			      DatabaseMetaData meta = c.getMetaData();
	              System.out.println("The driver name is " + meta.getDriverName());
		      } catch ( Exception e ) {
		         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		         System.exit(0);
		      }
		     
		   }
	 
		   
		   private static Connection connectUser() throws SQLException {
			   String url = "jdbc:sqlite:users.db";
			   Connection con = null;
				   con = DriverManager.getConnection(url);
				  return con; 
		   }
		   
		   private Connection connectProject() throws SQLException {
			   String url = "jdbc:sqlite:projects.db";
			   Connection con = null;
				   con = DriverManager.getConnection(url);
				  return con; 
		   }
		   
		  public static void insertUser(int ID, String username, String email) throws SQLException  {
			  userSql = "INSERT INTO USERS(ID, USERNAME, EMAIL) VALUES (?,?,?)";
			  Connection con = connectUser();
			  PreparedStatement pstmt = connect.prepareStatement(userSql);
				  pstmt.setInt(1, ID);
				  pstmt.setString(2, username);
				  pstmt.setString(3, email);
				  pstmt.executeUpdate();		 	   
		   }
	   
	   
 }