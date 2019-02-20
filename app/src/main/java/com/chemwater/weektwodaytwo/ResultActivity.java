package com.chemwater.weektwodaytwo;

import android.app.Activity ;
import android.content.SharedPreferences;
import android.os.Bundle ;
import android.view.View ;
import android.widget.EditText ;
import android.content.Intent ;

public class ResultActivity extends Activity {


    public static final int RESPONSE_CODE = 422 ;


    //When declaring at the top of a class it is known as declaring globally
    Bundle bundle ;
    Intent passedIntent ;
    EditText etCarMake, etCarModel, etCarYear, etCarTitleStatus, etCarColor, etCarEngine, etCarTransmission ;

    SharedPreferences sharedPreferences ;




    //Car car ;
    //Car car = new Car(carMake, carModel, carYear, carTitleStatus, carColor, carEngine, carTransmission) ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result) ;
        passedIntent = new Intent(this, MainActivity.class) ;


        etCarMake = findViewById(R.id.etCarMake) ;
        etCarModel = findViewById(R.id.etCarModel) ;
        etCarYear = findViewById(R.id.etCarYear) ;
        etCarTitleStatus = findViewById(R.id.etCarTitleStatus) ;
        etCarColor = findViewById(R.id.etCarColor) ;
        etCarEngine = findViewById(R.id.etCarEngine) ;
        etCarTransmission = findViewById(R.id.etCarTransmission) ;

        sharedPreferences = getSharedPreferences("shared_pref", MODE_PRIVATE) ;




/*        etCarMake.setText(savedInstanceState.getString("carmMake", "")) ;
        etCarModel.setText(savedInstanceState.getString("carModel", ""))  ;
        etCarYear.setText(savedInstanceState.getString("carYear", "")) ;
        etCarTitleStatus.setText(savedInstanceState.getString("carTitleStatus", "")) ;
        etCarColor.setText(savedInstanceState.getString("carColor", "")) ;
        etCarEngine.setText(savedInstanceState.getString("carEngine", "")) ;
        etCarTransmission.setText(savedInstanceState.getString("carTransmissioin", "")) ;*/



        passedIntent = getIntent() ;
    }




    public void onClick(View view) {

        String carMake = etCarMake.getText().toString() ;
        String carModel = etCarModel.getText().toString() ;
        String carYear = etCarYear.getText().toString() ;
        String carTitleStatus = etCarTitleStatus.getText().toString() ;
        String carColor = etCarColor.getText().toString() ;
        String carEngine = etCarEngine.getText().toString() ;
        String carTransmission = etCarTransmission.getText().toString() ;

        Car car = new Car(carMake, carModel, carYear, carTitleStatus, carColor, carEngine, carTransmission) ;
        bundle = new Bundle() ;



        //Adding key value pairs to this bundle
        //there are quite a lot data types you can store in a bundle
        bundle.putParcelable("car", car) ;

        passedIntent = new Intent() ;
        passedIntent.putExtras(bundle) ;

        setResult(RESPONSE_CODE, passedIntent) ;
        finish() ;



        /*
    public void onClick(View view) {

        //create a Bundle object
        Bundle extras = new Bundle();
        //Adding key value pairs to this bundle
        //there are quite a lot data types you can store in a bundle
        extras.putParcelable("car",car);

        passedIntent = new Intent();
        passedIntent.putExtras(extras);

        setResult(RESPONSE_CODE, passedIntent) ;
        //Make sure to destroy activity after we are done
        finish() ;
    }
 */



        /*
        if(!carMake.isEmpty() && !carModel.isEmpty() && !carYear.isEmpty() && !carTitleStatus.isEmpty() && !carColor.isEmpty() && !carEngine.isEmpty() && !carTransmission.isEmpty()) {

            passedIntent.putExtra("carMake", carMake) ;
            passedIntent.putExtra("carModel", carModel) ;
            passedIntent.putExtra("carYear", carYear) ;
            passedIntent.putExtra("carTitleStatus", carTitleStatus) ;
            passedIntent.putExtra("carColor", carColor) ;
            passedIntent.putExtra("carEngine", carEngine) ;
            passedIntent.putExtra("carTransmission", carTransmission) ;

            bundle.getString("carMake", carMake) ;
            bundle.getString("carModel", carModel) ;
            bundle.getString("carYear", carYear) ;
            bundle.getString("carTitleStatus", carTitleStatus) ;
            bundle.getString("carColor", carColor) ;
            bundle.getString("carEngine", carEngine) ;
            bundle.getString("carTransmission", carTransmission) ;
            startActivityForResult(passedIntent, RESPONSE_CODE, bundle) ;


            //setResult(RESPONSE_CODE, passedIntent) ;
            //Make sure to destroy activity after we are done
            finish() ;
        }*/
    }

}






/*
    public void onClick(View view) {

        //create a Bundle object
        Bundle extras = new Bundle();
        //Adding key value pairs to this bundle
        //there are quite a lot data types you can store in a bundle
        extras.putParcelable("car",car);

        passedIntent = new Intent();
        passedIntent.putExtras(extras);

        setResult(RESPONSE_CODE, passedIntent) ;
        //Make sure to destroy activity after we are done
        finish() ;
    }
 */