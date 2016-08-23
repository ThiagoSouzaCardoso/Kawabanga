package fiap.com.br.kawabanga;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout tilLogin;
    private TextInputLayout tilPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tilLogin = (TextInputLayout)findViewById(R.id.tilLogin);
        tilPassword = (TextInputLayout)findViewById(R.id.tilPassword);
    }

    public void logar(View view){
        String login = tilLogin.getEditText().getText().toString();
        String password = tilPassword.getEditText().getText().toString();

        if(login.equals("fiap") && password.equals("123")){
            Intent i = new Intent(this,PedidoActivity.class);
               i.putExtra("user",login);
               startActivity(i);
               finish();
        }else{
            Toast.makeText(this,"Usuario ou Senha Inválido",Toast.LENGTH_LONG).show();
        }


    }


}
