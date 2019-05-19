package net.gregorycheng.myweather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_ten_day.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class TenDayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ten_day)

        //var listView = findViewById<ListView>(R.id.lvTenDay)


        //example of an adapter to populate the listview
        // var randomThing = listOf("hello",
        //                         "how are you",
        //                         "goodbye",
        //                         "Today")

        //var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,randomThing)

        //listView.adapter = adapter


        var retriever = WeatherRetriever()

        val callBack = object : Callback<List<Forecast>>{
            override fun onResponse(call: Call<List<Forecast>>?, response: Response<List<Forecast>>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                println("got a response")
                println(response?.body())

                for (forecastday in response!!.body()!!){
                    println("High:${forecastday.high} Low:${forecastday.low}")
                }
            }

            override fun onFailure(call: Call<List<Forecast>>?, t: Throwable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                println("failed")
            }



        }

        retriever.getForecast(callBack)




    }
}
