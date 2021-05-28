package yuki.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countupButton: Button = findViewById(R.id.count_up_button)
        countupButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "Dice Rolled!"
        resultText.text = randomInt.toString()
//        Toast.makeText(this, "button clicked",
//                Toast.LENGTH_SHORT).show()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val textInResultText: String = resultText.getText() as String
        try {
            val resultInt = textInResultText.toInt()
            if (resultInt < 6) {
                resultText.text = (resultInt + 1).toString()
            }
        } catch(e: Exception) {
            resultText.text = "1"
        }
    }
}