package com.example.rc402619.cycledevie

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class MainActivity : AppCompatActivity(),AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        info("ON CREATE")
        numberPicker.maxValue = 100;
        numberPicker.minValue = 0;
        numberPicker.value = 1;
    }
    override fun onStart() {
        super.onStart()
        info("ON START")

    }

    override fun onStop() {
        super.onStop()
        info("ON STOP")
    }

    override fun onResume() {
        super.onResume()
        info("ON RESUME")
    }

    override fun onPause() {
        super.onPause()
        info("ON PAUSE")
    }

    override fun onRestart() {
        super.onRestart()
        info("ON RESTART")
    }

    override fun onDestroy() {
        super.onDestroy()
        info("ON DESTROY")
    }
    companion object {
        val BUNDLE_VAL_PICKER = "BUNDLE_VAL_PICKER"
    }
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        info("ON SAVE")
        //save value of number picker in variable bundle_val_picker
        outState?.putInt(BUNDLE_VAL_PICKER, numberPicker.value)
    }

    override fun onRestoreInstanceState(inState: Bundle?) {
        super.onRestoreInstanceState(inState)
        info("ON RESTORE")
        if (inState != null) {
            numberPicker.value = inState.getInt(BUNDLE_VAL_PICKER)
        }
    }
}
