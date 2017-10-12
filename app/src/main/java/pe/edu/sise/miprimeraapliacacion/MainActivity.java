package pe.edu.sise.miprimeraapliacacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public TextView te;
    private EditText nombre,email,telefono;
    private Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre= (EditText) findViewById(R.id.txtName);
        email= (EditText) findViewById(R.id.txtemail);
        telefono= (EditText) findViewById(R.id.txttelefono);
        btnIniciar= (Button) findViewById(R.id.btnGuardar);


    }
    public void mensajeToast(View v){

        String nombres=nombre.getText().toString();
        String emaila= email.getText().toString();

        Toast.makeText(this,"Hola"+nombres+emaila, Toast.LENGTH_SHORT).show();

    }


}
