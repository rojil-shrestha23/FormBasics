package np.com.shrestha.rojil.formbasics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import np.com.shrestha.rojil.formbasics.utils.ShowToast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button btnRegs;
    private EditText edName, edEmail, edPassword;
    private String name, email, password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btnRegs = findViewById(R.id.btnRegister);
        edName = findViewById(R.id.name);
        edEmail = findViewById(R.id.email);
        edPassword =findViewById(R.id.password);
        btnRegs.setOnClickListener(this);

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
        Intent i = new Intent(this, LoginActivity.class);

        EditText editText1 = (EditText) findViewById(R.id.name);

        EditText editText2 = (EditText) findViewById(R.id.password);

        String myString = editText1.getText().toString();

        String enterPassword = editText2.getText().toString();

        i.putExtra("qString", myString);

        i.putExtra("masterPassword", enterPassword);
        startActivity(i);
    }
}
