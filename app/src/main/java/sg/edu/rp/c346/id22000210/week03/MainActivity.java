package sg.edu.rp.c346.id22000210.week03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    // Step 1: Declare the Field Variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);


        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action (When we click the button, these two codes will be executed)
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);

            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action


                // get the state of the toggle button
                boolean isChecked = tbtn.isChecked();
                if (isChecked) {
                    etInput.setEnabled(true);
                } else {
                    etInput.setEnabled(false);
                }

            }
        });


        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action (Gets the text from EditText)
                String stringResponse = etInput.getText().toString();
                // Gets the ID of the checked RadioButton
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                //Declare a variable 'say' to hold the string
                String say;
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    // Write the code when male selected
                    say = "He says: ";

                }
                else{
                    // Write the code when female selected
                    say = "She says: ";

                }
                String displayText = say + stringResponse;


                tvDisplay.setText(displayText);
            }
        });



    }
}