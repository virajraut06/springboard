import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	public static void main(String[] args) throws IOException {
		Connection connection = null;
		Statement statement = null;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
			System.out.println("Connected");
			System.out.println("Enter employee details:");
			System.out.println("Enter emp id");
			int empid = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter emp name");
			String empname = bufferedReader.readLine();
			System.out.println("Enter emp designation");
			String empdesg = bufferedReader.readLine();
			System.out.println("Enter location");
			String location = bufferedReader.readLine();
			System.out.println("Enter emp salary");
			double salary = Double.parseDouble(bufferedReader.readLine());
			statement = connection.createStatement();
			
			String query = "insert into employeedetails values("+empid+",'"+empname+"','"+empdesg+"','"+location+"',"+salary+")";
			int success = statement.executeUpdate(query);
			if(success>0)
				System.out.println(success+" row(s) inserted.");
			else
				System.out.println("Rows not inserted.");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
