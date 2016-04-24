package com.example.ziyang.potpan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class cll_main extends AppCompatActivity {

    private Button loginbutton;
    private TextView create;
    private TextView retrive;

//    private TextView username;
//    private TextView password;
//    private int x = 1;
//    private ArrayList<String> list1 = new ArrayList<String>();
//    private ArrayList<String> list2 = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cll_main);

//        username = (TextView) findViewById(R.id.UserName);
//        password = (TextView) findViewById(R.id.Password);
//        UserDB userdb = new UserDB(this);
//        final SQLiteDatabase dbread = userdb.getReadableDatabase();
//        Cursor c = dbread.query("UserDB", new String[]{"account", "password"}, null, null, null, null, null);
//        while (c.moveToNext()) {
//            String a = c.getString(c.getColumnIndex("account"));
//            String p = c.getString(c.getColumnIndex("password"));
//            list1.add(a);
//            list2.add(p);
//        }



        loginbutton = (Button) findViewById(R.id.login);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String UserAccount = username.getText().toString();
//                String UserPassword = password.getText().toString();

//                System.out.println(UserAccount);
//                System.out.println(UserPassword);
//                for (int i = 0; i < list1.size(); i++) {
//                    String l1 = list1.get(i).toString();
//                    String l2 = list2.get(i).toString();
//                    System.out.println(l1);
//                    System.out.println(l2);
//                    if (UserAccount.equals(l1)) {
//                        if (UserPassword.equals(l2)) {
//                            x = 2;
//                        }
//                    }
//                }
//
//                if (x == 2) {
//
                Intent intent = new Intent();
                intent.setClass(cll_main.this, wxx_main.class);
                startActivity(intent);
//                    x = 1;
//                }
            }
        });

        create=(TextView)findViewById(R.id.create);
        retrive=(TextView)findViewById(R.id.retrieve);
        String text1="Create new account.";
        String text2="Forget password?";
        SpannableString spannableString1=new SpannableString(text1);
        spannableString1.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cll_main.this, cll_cu.class);
                startActivity(intent);

            }
        }, 0, text1.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        SpannableString spannableString2=new SpannableString(text2);
        spannableString2.setSpan(new ClickableSpan() {
            public void onClick(View view) {
                Intent intent = new Intent(cll_main.this, cll_retrieve.class);
                startActivity(intent);

            }
        }, 0, text2.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        create.setText(spannableString1);
        create.setMovementMethod(LinkMovementMethod.getInstance());
        retrive.setText(spannableString2);
        retrive.setMovementMethod(LinkMovementMethod.getInstance());


    }
}
