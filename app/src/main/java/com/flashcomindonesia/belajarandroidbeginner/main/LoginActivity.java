package com.flashcomindonesia.belajarandroidbeginner.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.flashcomindonesia.belajarandroidbeginner.R;

/**
 * Created by kakaroto on 10/08/18.
 */
public class LoginActivity extends AppCompatActivity {

    private EditText etEmail, etPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_password);
        Button btnOk = findViewById(R.id.btn_ok);

/*        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ok();
            }
        });*/

    }

    public void ok(View view) {
        Toast.makeText(LoginActivity.this, "Email : "
                + etEmail.getText().toString() + " password: "
                + etPassword.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
