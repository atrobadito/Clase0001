package pe.edu.sise.miprimeraapliacacion.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import pe.edu.sise.miprimeraapliacacion.pe.edu.sise.miprimeraapliacioncion.domain.Usuario;
import pe.edu.sise.miprimeraapliacacion.repository.UsuarioSQLiteHelper;

/**
 * Created by cisco on 13/10/2017.
 */

public class UsuarioDAO {
    private Context context;

                public  UsuarioDAO(Context context){
               this.context = context;
            }

                public UsuarioSQLiteHelper conectarUsuarioHelper(){
                UsuarioSQLiteHelper usuarioHelper =
                                new UsuarioSQLiteHelper(context,
                                                "db_usuarios", null, 1);
                return usuarioHelper;
            }

                public boolean insertarUsuario(Usuario usuario){
               // Guardar la información en la Base de datos.
                SQLiteDatabase db = conectarUsuarioHelper().getWritableDatabase();
                if(db != null){
                        db.execSQL("INSERT INTO Usuario (id, nombre, email," +
                                        "teledono, sexo) VALUES (" +
                                                    "'"+usuario.getId()+"','"+usuario.getNombre()+"'" +
                                        ",'"+usuario.getEmail()+"','"+usuario.getTeledono()+"'," +
                                        "'"+usuario.getSexo()+"') ");
                       db.close();
                        return true;
                    }
                return false;
           }
}
