package np.com.shrestha.rojil.formbasics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private String name = "", password = "";
    private EditText loginName;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        name = intent.getStringExtra("qString");

        password = intent.getStringExtra("masterPassword");

        final EditText editText = (EditText) findViewById(R.id.userName);

        final EditText editPassword = (EditText) findViewById(R.id.logPassword);

        editText.setText(name);
        editPassword.setText(password);
    }

    private void initView() {
        btnLogin = findViewById(R.id.btnLogIn);
        btnLogin.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        String  username = intent.getStringExtra("qString");

        Intent i = new Intent(this, DashboardActivity.class);
        i.putExtra("UserName", username);
        startActivity(i);

    }
}