import java.sql.*;

public class Main {
    public static void main(String[] args) {
        final String URL = "Jdbc:mysql://localhost:3306/cadaluno";
        final String USER = "root";
        final String PASSWORD = "root99";
        final String CONSULTA = "selec * from aluno";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado!");
            Statement st =con.createStatement();
            System.out.println("Statment criado!");

            String query = "insert into aluno(nome, matricula) values (?,?)";

            PreparedStatement stat = con.prepareStatement(query);
            stat.setString(1," Thais");
            stat.setInt(2, 16547489);

            int linhasAfetadas = stat.executeUpdate();
            System.out.println("Dados inseridos!");

            ResultSet resultSet = stat.executeQuery(CONSULTA);

            while (resultSet.next()){
                System.out.println(resultSet.getString("Nome"));
                System.out.println(resultSet.getString("Matricula"));
            }

        } catch (Exception e){
            System.out.println(e);
            e.printStackTrace();

        }
    }
}