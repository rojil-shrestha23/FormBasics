package np.com.shrestha.rojil.formbasics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnRegister;
    private EditText edName, edEmail, edPassword;
    private String name, email, password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btnRegister = findViewById(R.id.btnRegister);
        edName = findViewById(R.id.name);
        edEmail = findViewById(R.id.email);
        edPassword =findViewById(R.id.password);

    }
    private void emptyForm(){
        edName.setText("");
        edPassword.setText("");
        edEmail.setText("");
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
//        Intent intent = new Intent(this, .class);
//        intent.putExtra("Name", "firstName");
//        startActivity(intent);
    }
}
