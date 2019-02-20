package com.chemwater.weektwodaytwo;

import android.app.Activity ;
import android.content.SharedPreferences;
import android.os.Bundle ;
import android.view.View ;
import android.widget.TextView ;
import android.content.Intent ;

public class MainActivity extends Activity {


    public static final int RESPONSE_CODE = 422 ;


    //Car car ;
    //When declaring at the top of a class it is known as declaring globally
    Bundle bundle ;
    Intent passedIntent ;
    TextView tvCarMake, tvCarModel, tvCarYear, tvCarTitleStatus, tvCarColor, tvCarEngine, tvCarTransmission ;
    SharedPreferences sharedPreferences ;








    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main) ;
        passedIntent = new Intent(this, MainActivity.class) ;


        tvCarMake = findViewById(R.id.etCarMake) ;
        tvCarModel = findViewById(R.id.etCarModel) ;
        tvCarYear = findViewById(R.id.etCarYear) ;
        tvCarTitleStatus = findViewById(R.id.etCarTitleStatus) ;
        tvCarColor = findViewById(R.id.etCarColor) ;
        tvCarEngine = findViewById(R.id.etCarEngine) ;
        tvCarTransmission = findViewById(R.id.etCarTransmission) ;

        //bundle = new Bundle() ;
        sharedPreferences = getSharedPreferences("shared_pref", MODE_PRIVATE) ;


        /*
        tvCarMake.setText(sharedPreferences.getString("carMake", "")) ;
        tvCarModel.setText(sharedPreferences.getString("carModel", "")) ;
        tvCarYear.setText(sharedPreferences.getString("carYear", "")) ;
        tvCarTitleStatus.setText(sharedPreferences.getString("carTitleStatus", "")) ;
        tvCarColor.setText(sharedPreferences.getString("carColor", "")) ;
        tvCarEngine.setText(sharedPreferences.getString("carEngine", "")) ;
        tvCarTransmission.setText(sharedPreferences.getString("carTransmission", "")) ;*/

        /*
        etCarMake.setText(savedInstanceState.getString("carmMake", "")) ;
        etCarModel.setText(savedInstanceState.getString("carModel", ""))  ;
        etCarYear.setText(savedInstanceState.getString("carYear", "")) ;
        etCarTitleStatus.setText(savedInstanceState.getString("carTitleStatus", "")) ;
        etCarColor.setText(savedInstanceState.getString("carColor", "")) ;
        etCarEngine.setText(savedInstanceState.getString("carEngine", "")) ;
        etCarTransmission.setText(savedInstanceState.getString("carTransmissioin", "")) ;
        */

        //passedIntent = getIntent() ;
    }











    public void onClick(View view) {

        Intent intent = new Intent(this, ResultActivity.class) ;
        startActivityForResult(intent, RESPONSE_CODE) ;











        /*
        String carMake = tvCarMake.getText().toString() ;
        String carModel = tvCarModel.getText().toString() ;
        String carYear = tvCarYear.getText().toString() ;
        String carTitleStatus = tvCarTitleStatus.getText().toString() ;
        String carColor = tvCarColor.getText().toString() ;
        String carEngine = tvCarEngine.getText().toString() ;
        String carTransmission = tvCarTransmission.getText().toString() ;*/

        //car = new Car(carMake, carModel, carYear, carTitleStatus, carColor, carEngine, carTransmission) ;

        /*if(!carMake.isEmpty() && !carModel.isEmpty() && !carYear.isEmpty() && !carTitleStatus.isEmpty() && !carColor.isEmpty() && !carEngine.isEmpty() && !carTransmission.isEmpty()) {*/
            /*
            passedIntent.putExtra("carMake", carMake) ;
            passedIntent.putExtra("carModel", carModel) ;
            passedIntent.putExtra("carYear", carYear) ;
            passedIntent.putExtra("carTitleStatus", carTitleStatus) ;
            passedIntent.putExtra("carColor", carColor) ;
            passedIntent.putExtra("carEngine", carEngine) ;
            passedIntent.putExtra("carTransmission", carTransmission) ;*/

            /*
            bundle.putString("carMake", carMake) ;
            bundle.putString("carModel", carModel) ;
            bundle.putString("carYear", carYear) ;
            bundle.putString("carTitleStatus", carTitleStatus) ;
            bundle.putString("carColor", carColor) ;
            bundle.putString("carEngine", carEngine) ;
            bundle.putString("carTransmission", carTransmission) ;
            bundle.putParcelable("carinfo", car) ;*/


            //passedIntent.putExtras(bundle) ;
            //setResult(RESPONSE_CODE, passedIntent) ;
            //startActivityForResult(passedIntent, RESPONSE_CODE, bundle) ;


            //setResult(RESPONSE_CODE, passedIntent) ;
            //Make sure to destroy activity after we are done
            //finish() ;
        //}
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data) ;

        if(data != null) {

            //get the attached bundle from the intent
            Bundle extras = data.getExtras() ;
            Car car = extras.getParcelable("car") ;

            tvCarMake.setText(car.carMake) ;
            tvCarModel.setText(car.carModel) ;
            tvCarYear.setText(car.carYear) ;
            tvCarTitleStatus.setText(car.carTitleStatus) ;
            tvCarColor.setText(car.carColor) ;
            tvCarEngine.setText(car.carEngine) ;
            tvCarTransmission.setText(car.isAuto) ;

            SharedPreferences.Editor editor = sharedPreferences.edit() ;
            editor.putString("carMake", car.carMake)  ;
            editor.putString("carModel", car.carModel) ;
            editor.apply() ;
            editor.commit() ;
        }
    }

    /*






            SharedPreferences.Editor editor = sharedPreferences.edit() ;
            editor.putString("carMake", car.carMake);
            editor.putString("carModel", car.carModel) ;
            editor.apply() ;
            editor.commit();

        }
     */

}

