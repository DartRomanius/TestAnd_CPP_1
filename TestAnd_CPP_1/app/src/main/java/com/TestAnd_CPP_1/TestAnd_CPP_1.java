
package com.TestAnd_CPP_1;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class TestAnd_CPP_1 extends Activity implements OnClickListener
{
    /** ���������� ��� ������ �������� ��������. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /* �������� ���������� ������������� � �������� � �������� ������ "Hello world" */
        TextView  tv = new TextView(this);
        tv.setText("Hello World!");
        setContentView(tv);
    }

    @Override
    public void onClick(View v) {

    }
}
