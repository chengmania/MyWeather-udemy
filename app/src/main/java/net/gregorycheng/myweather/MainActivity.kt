 package net.gregorycheng.myweather

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetForcast.setOnClickListener {
            println("You click get forecast")

            var moveIntent = Intent(this,TenDayActivity::class.java)
            startActivity(moveIntent)

        }




    }
}
