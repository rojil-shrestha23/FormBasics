package np.com.shrestha.rojil.formbasics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

   private String name ="", password ="";
   private EditText loginName;
   private Button btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        name = intent.getStringExtra("qString");


        final EditText editText = (EditText)
                findViewById(R.id.userName);
        editText.setText(name);
    }
}