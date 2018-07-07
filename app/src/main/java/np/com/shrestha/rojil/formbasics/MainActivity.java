package np.com.shrestha.rojil.formbasics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import np.com.shrestha.rojil.formbasics.utils.ShowToast;

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

    private void getFormValue() {
        name = edName.getText().toString().trim();
        email = edEmail.getText().toString().trim();
        password = edPassword.getText().toString().trim();
        email = edEmail.getText().toString().trim();
        if (TextUtils.isEmpty(name)) {
            ShowToast.showToast(MainActivity.this, "Name cannot be empty", true);
        } else if (TextUtils.isEmpty(email)) {
            ShowToast.showToast(MainActivity.this, "Email number cannot be empty", true);
        } else if (TextUtils.isEmpty(password)) {
            ShowToast.showToast(MainActivity.this, "password cannot be empty", true);
        } else {
            ShowToast.showToast(MainActivity.this, "Form received", true);

        }
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra("Email", "email");
        startActivity(intent);
    }
}
