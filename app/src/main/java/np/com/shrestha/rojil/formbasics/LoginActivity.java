package np.com.shrestha.rojil.formbasics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    String email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent getValues = getIntent();
        email = getValues.getStringExtra("Name");
        EditText edView = findViewById(R.id.loginEmail);
        edView.setText("The passe value is " + email);
    }
}
