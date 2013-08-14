package james.demo.TestAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created with IntelliJ IDEA.
 * User: ShiXujun
 * Date: 13-8-13
 * Time: 下午11:29
 * To change this template use File | Settings | File Templates.
 */
public class LoginActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //username
        Button btnLogin = (Button)findViewById(R.id.buttonLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etUser = (EditText)findViewById(R.id.editTextUser);
                EditText etPass = (EditText)findViewById(R.id.editTextPass);

                String username = etUser.getText().toString();
                String password = etPass.getText().toString();

                Intent _it = new Intent(LoginActivity.this,CKLoginActivity.class);
                _it.putExtra("username",username);
                _it.putExtra("password",password);
                startActivityForResult(_it,1234);


            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==1234)
        {
            String returnValue=data.getStringExtra("loginreturn");
            Toast.makeText(this,returnValue,4000).show();
        }
    }
}