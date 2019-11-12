package com.example.kaanapos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        try {
//
//            Fragment fm = getSupportFragmentManager().findFragmentById(R.id.frame_cart);
//
//            if (fm instanceof CartFragment) {
//                Log.e("PUSH", "CartFragment");
////                if(mPreference.getBoolanValue(SharedValues.CHANGE_IN_CURRENT_OPENED_TICKET,false))
//                ((CartFragment) (fm)).cartRateDialogueListner.pushRecieved();
//            } else if (fm instanceof SavedOrderFragment) {
//                Log.e("PUSH", "SavedOrderFragment");
//                ((SavedOrderFragment) (fm)).updateSavedOrdersListner.updateSavedOrders();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
