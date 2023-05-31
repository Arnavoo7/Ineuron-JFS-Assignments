import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestApp 
{
    public static void main(String[] args)
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try
        {
            //Step1. Load and Register the Driver
            // Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println();
            System.out.println("Driver loaded successfully...");        
            System.out.println();

            //Step2. Establishing the connection
            //String url = "jdbc:mysql://localhost:3306/dbconnect"; (not necessary if both IP and DB are on same machine)
            String url = "jdbc:mysql:///dbconnect";
            
            String userName = "root";
            String passWord = "Password123#@!";

            connection = DriverManager.getConnection(url, userName, passWord);

            System.out.println("connection to DB successfully done...");
            System.out.println("The implement class name is "+ connection.getClass().getName());


            //Step3. Create Statement Object and Send the Query
            String sqlSelectQuery = "SELECT sid, sname, sage, saddress FROM student";
            
            statement = connection.createStatement();
            System.out.println("The implement class name is "+ statement.getClass().getName());

            resultSet = statement.executeQuery(sqlSelectQuery);
            System.out.println("The implement class name is "+ resultSet.getClass().getName());

            System.out.println();
            System.out.println("SID\tSNAME\tSAGE\tSADDRESS");
            //Step4. Process the resultSet
            while(resultSet.next())
            {
                Integer sid = resultSet.getInt(1);
                String sname = resultSet.getString(2);
                Integer sage = resultSet.getInt(3);
                String saddr = resultSet.getString(4);

                System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+saddr);
            }
            System.out.println();

        }
        //Step5. Handling the Exception
        //If Driver class not found at the classpath
        // catch(ClassNotFoundException ce)
        // {
        //     /*It is a method of Java's throwable class which prints the throwable along with other details like the line number and class name where the exception occurred. */
        //     ce.printStackTrace();
        // }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        //Step6. Closing the resources
        finally
        {
            if(connection != null)
            {
                try
                {
                    connection.close();
                }
                catch(SQLException se)
                {
                    se.printStackTrace();
                }
            }
            System.out.println("connection to DB closed successfully...");
            System.out.println();
        }
    }    
}
