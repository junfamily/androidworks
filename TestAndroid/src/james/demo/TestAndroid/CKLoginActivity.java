package james.demo.TestAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created with IntelliJ IDEA.
 * User: ShiXujun
 * Date: 13-8-14
 * Time: 上午12:04
 * To change this template use File | Settings | File Templates.
 */
public class CKLoginActivity extends Activity {
    private Intent getintent;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getintent = getIntent();
        String getUser = getintent.getStringExtra("username");
        String getPass = getintent.getStringExtra("password");

        if(getUser=="1234")
        {
            getintent.putExtra("loginreturn","登录成功"+getUser+getPass);
            setResult(1234,getintent);
            finish();
        }else {
            getintent.putExtra("loginreturn","用户名或密码错误"+getUser+getPass);
            setResult(1234,getintent);
            finish();
        }


    }
}