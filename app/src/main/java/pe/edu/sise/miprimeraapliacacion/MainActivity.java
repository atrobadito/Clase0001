package pe.edu.sise.miprimeraapliacacion;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import pe.edu.sise.miprimeraapliacacion.pe.edu.sise.miprimeraapliacioncion.domain.Usuario;
import pe.edu.sise.miprimeraapliacacion.repository.UsuarioSQLiteHelper;

public class MainActivity extends AppCompatActivity {



    public TextView te;
    private EditText nombre,email,telefono;
    protected Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final UsuarioSQLiteHelper usuarioHelper=
                new UsuarioSQLiteHelper(this,"db_usuarios",null,1);

        btnIniciar= (Button) findViewById(R.id.btnGuardar);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Recuperar informacion de la pantalla
                EditText txtnombre= (EditText) findViewById(R.id.txtName);
                String nombre=txtnombre.getText().toString();
                EditText txtemail= (EditText) findViewById(R.id.txtemail);
                String email=txtemail.getText().toString();
                EditText txttelefono= (EditText) findViewById(R.id.txttelefono);
                String telefono=txttelefono.getText().toString();
                RadioButton rb_masculino= (RadioButton) findViewById(R.id.rbtMasculino);
                RadioButton rb_femenino= (RadioButton) findViewById(R.id.rbtfemenino);
                int sexo=0;
                if(rb_masculino.isChecked()){
                    sexo=1;
                }else if(rb_femenino.isChecked()) {
                    sexo = 2;
                }
                Usuario usuario=new Usuario();
                usuario.setId(1L);
                usuario.setNombre(txtnombre.getText().toString());
                usuario.setEmail(txtemail.getText().toString());
                usuario.setTeledono(txttelefono.getText().toString());
                usuario.setSexo(sexo);

                //guardar la informacion en la base de datos.
                SQLiteDatabase db=usuarioHelper.getWritableDatabase();
                if(db!=null){
                    db.execSQL("INSERT INTO Usuario (id,Nombre,email,teledono,sexo)"+
                            " values (" +
                            "'"+usuario.getId()+"','"+usuario.getNombre()+"'"+
                            ",'"+usuario.getEmail()+"','"+usuario.getTeledono()+"'"+
                            "'"+usuario.getSexo()+"')");
                    Toast.makeText(getApplicationContext()
                    ,"Gaurdado",Toast.LENGTH_SHORT);
                }
                db.close();
            }
        });


    }
    public void mensajeToast(View v){

        String nombres=nombre.getText().toString();
        String emaila= email.getText().toString();

        Toast.makeText(this,"Hola"+nombres+emaila, Toast.LENGTH_SHORT).show();

    }


}
