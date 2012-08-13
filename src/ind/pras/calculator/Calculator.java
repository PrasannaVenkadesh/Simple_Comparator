package ind.pras.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends Activity {
	
	EditText value1;
	EditText value2;
	EditText value3;
	
	Button calculate;
	
	double x = 0, y=0, z=0;
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initControls();
    }
    
    private void initControls() {
    	
    	value1 = (EditText) findViewById(R.id.value1);
    	value2 = (EditText) findViewById(R.id.value2);
    	value3 = (EditText) findViewById(R.id.value3);
    	
    	calculate = (Button) findViewById(R.id.calculate);
    	
    	calculate.setOnClickListener(new Button.OnClickListener()
    	{
    		public void onClick(View v) {
    			calculate();
    		}
    		
    	});
    }
    
    private void calculate() {
    	x = Double.parseDouble(value1.getText().toString());
    	y = Double.parseDouble(value2.getText().toString());
    	
    	if (x > y){
    		value3.setText(Double.toString(x));
    	}
    	else {
    		value3.setText(Double.toString(y));
    	}
    	
    }
}