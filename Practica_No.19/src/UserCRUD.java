import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UserCRUD {
    private Connection conexion;

    //Constructor de la clase que arranca la conexión a BD
    public UserCRUD(){
        conexion = Conexión_MySQL.conectar();
    }

    //----------------------------------------------------------------------------------------------------------------------------------

    public boolean InsertUsuario(String nombre, String correo, String contrasena){ //INSERT dentro de MySQL Workbench
        String insertSQL = " INSERT INTO Usuarios(Nombre, Correo, Contraseña) VALUES(?,?,?)";
        try{
            PreparedStatement ps = conexion.prepareStatement(insertSQL); //Aginación de la sentencia y parámetros para su ejecución
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contrasena);
            return ps.executeUpdate()>0;
        }
        catch(SQLException e){
            System.out.print("Error al crear el usuario "+e.getMessage()); //Impresión en consola en caso de que no se ejectue el INSERT
            return false;
        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------

    public ResultSet buscarPorID(int id){ //SELECT dentro de MySQL Workbench
        String sqlBuscar = "SELECT * FROM Usuarios WHERE id_usuario = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlBuscar); //Aginación de la sentencia y parámetros para su ejecución
            ps.setInt(1, id);
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.print("Error al buscar por ID"+e.getMessage());
            return null;
        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------

    public ResultSet obtenerTodos(){ //SELECT general dentro de MySQL Workbench
        String sqlBuscarTodo = "SELECT * FROM Usuarios";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlBuscarTodo); //Asignación de la sentencia y parámetros para su ejecución
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.print("Error al buscar todos los usuarios"+e.getMessage());
            return null;
        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------

    public boolean ActualizarPorID(String nombre, String correo, String contrasena, int id){ //UPDATE dentro de MySQL Workbench
        String updateSQL = "UPDATE Usuarios SET Nombre = ?, Correo = ?, Contraseña = ? WHERE id_usuario = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(updateSQL); //Aginación de la sentencia y parámetros para su ejecución
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contrasena);
            ps.setInt(4, id);
            return ps.executeUpdate()>0;
        }
        catch(SQLException e){
            System.out.print("Error al actualizar el usuario "+e.getMessage()); //Impresión en consola en caso de que no se ejectue el INSERT
            return false;
        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------

    public boolean EliminarPorID(int id){ //DELETE dentro de MySQL Workbench
        String deleteSQL = "DELETE FROM Usuarios WHERE id_usuario = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(deleteSQL); //Asignación de la sentencia y parámetros para su ejecución
            ps.setInt(1, id);
            return ps.executeUpdate()>0;
        }
        catch(SQLException e){
            System.out.print("Error al eliminar el usuario "+e.getMessage()); //Impresión en consola en caso de que no se ejecute el DELETE
            return false;
        }
    }
}


