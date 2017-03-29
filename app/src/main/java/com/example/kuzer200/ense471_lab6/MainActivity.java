package com.example.kuzer200.ense471_lab6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView displayText;
    private String currentEntry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayText = (TextView)findViewById(R.id.calculatorText);
        currentEntry = "";
    }

    public void enterCharacter(View view) {

        switch (view.getId()) {
            case (R.id.btnZero): currentEntry += "0"; break;
            case (R.id.btnOne): currentEntry += "1"; break;
            case (R.id.btnTwo): currentEntry += "2"; break;
            case (R.id.btnThree): currentEntry += "3"; break;
            case (R.id.btnFour): currentEntry += "4"; break;
            case (R.id.btnFive): currentEntry += "5"; break;
            case (R.id.btnSix): currentEntry += "6"; break;
            case (R.id.btnSeven): currentEntry += "7"; break;
            case (R.id.btnEight): currentEntry += "8"; break;
            case (R.id.btnNine): currentEntry += "9"; break;
            case (R.id.btnPlus): currentEntry += "+"; break;
            case (R.id.btnMinus): currentEntry += "-"; break;
            case (R.id.btnMultiply): currentEntry += "*"; break;
            case (R.id.btnDivide): currentEntry += "/"; break;
            case (R.id.btnLeftBracket): currentEntry += "("; break;
            case (R.id.btnRightBracket): currentEntry += ")"; break;
            case (R.id.btnDot): currentEntry += "."; break;

            case (R.id.btnBack): if (currentEntry.length() > 0) currentEntry = currentEntry.substring(0, currentEntry.length()-1); break;
            case (R.id.btnClear): currentEntry = ""; break;
        }

        displayText.setText(currentEntry);
    }
}
