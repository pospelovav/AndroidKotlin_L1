package geekbrains.androidkotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonTest = findViewById<Button>(R.id.bigBlueButton)
        val textViewTest = findViewById<TextView>(R.id.textViewForBigBlueButton)
        buttonTest.setOnClickListener {
            textViewTest.text = "BigBlueButtonClicked"
        }
    }
}