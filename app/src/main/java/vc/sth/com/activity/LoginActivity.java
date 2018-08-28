package vc.sth.com.activity;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import vc.sth.com.voicecodetemp.R;

public class LoginActivity extends AppCompatActivity {

    private EditText userNameEdit = null;
    private EditText passwordEdit = null;
    private Button loginBtn = null;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView() {
        this.userNameEdit = this.findViewById(R.id.userNameEdit);
        this.passwordEdit = this.findViewById(R.id.passwordEdit);
        this.loginBtn = this.findViewById(R.id.loginBtn);
        this.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginAction();
            }
        });
    }

    private void loginAction() {
        if (!checkInput())
            return;

        requestLogin();
    }

    private boolean checkInput() {
        if (this.userNameEdit.getText().toString().isEmpty()) {
            Toast.makeText(this, "请输入用户名", Toast.LENGTH_SHORT).show();
            return false;
        } else if (this.passwordEdit.getText().toString().isEmpty()) {
            Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    private void requestLogin() {

    }

    private void responseLogin() {

    }

}

