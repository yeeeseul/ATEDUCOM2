package ysyoon.ateducom2;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;
import ysyoon.ateducom2.databinding.HelpBinding;

/**
 * Created by YSYoon on 2017-02-24.
 */

public class Help extends Activity {
/*
    @Bind(R.id.btn_01) Button btn_01;
    @Bind(R.id.btn_02) Button btn_02;
    @Bind(R.id.btn_03) Button btn_03;
    @Bind(R.id.btn_04) Button btn_04;
    @Bind(R.id.btn_05) Button btn_05;
    @Bind(R.id.btn_06) Button btn_06;
*/
    HelpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.help);
       binding= DataBindingUtil.setContentView(this,R.layout.help);



        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_01)
    public void clickbtn_01(){



        PermissionListener permissionlistener = new PermissionListener() {
            @Override
            public void onPermissionGranted() {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:06 525 5585"));
                startActivity(intent);
            }

            @Override
            public void onPermissionDenied(ArrayList<String> deniedPermissions) {
                Toast.makeText(Help.this, "Permission Denied\n" + deniedPermissions.toString(), Toast.LENGTH_SHORT).show();
            }


        };


        new TedPermission(this)
                .setPermissionListener(permissionlistener)
                .setDeniedMessage("If you reject permission,you can not use this service\n\nPlease turn on permissions at [Setting] > [Permission]")
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check();

    }





}
