package vcmsa.ci.assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)



        // Initialize UI elements

        val timeOfDayEditText: EditText = findViewById(R.id.searchView)

        val showMealButton: Button = findViewById(R.id.button2)

        val resetButton: Button = findViewById(R.id.button1)

        val mealSuggestionsTextView: TextView = findViewById(R.id.textView2recipes)



        // Show meal suggestions when button is clicked

        showMealButton.setOnClickListener {

            val timeOfDay = timeOfDayEditText.text.toString().trim()



            if (timeOfDay.isEmpty()) {

                // Show a Toast if no time of day is entered

                Toast.makeText(this, "Please enter a time of day", Toast.LENGTH_SHORT).show()

            } else {

                // Display meal suggestions based on the time of day

                val mealSuggestions = when (timeOfDay.lowercase()) {

                    "morning" -> {

                        "Breakfast: Avocado bread\nSmoothie Bowl\nOatmeal Porridge"

                    }

                    "mid-morning" -> {

                        "Snack: Cinnamon Apples\nGreek Yoghurt with Berries\nNuts and Dried Fruits"

                    }

                    "afternoon" -> {

                        "Lunch: Grain Bowl\nWrap or Sandwich\nSalad with Grilled Protein"

                    }

                    "mid-afternoon" -> {

                        "Snack: Hummus and Veggies\nRice cakes with Nut Butter\nTrail Mix Bites"

                    }

                    "dinner" -> {

                        "Dinner: Grilled Salmon with Veggies\nStir-Fried Tofu with Veggies\nChicken and Vegetable Casserole"

                    }

                    "after dinner" -> {

                        "Dessert: Baked Cinnamon Apples\nDark chocolate with Almonds\nHerbal Tea and Whole-Grain Biscuit"

                    }

                    else -> {

                        "Invalid time of day. Please enter a valid time."

                    }

                }



                // Show the meal suggestions in the TextView

                mealSuggestionsTextView.text = mealSuggestions

            }

        }



        // Reset the input and suggestions when reset button is clicked

        resetButton.setOnClickListener {

            timeOfDayEditText.text.clear()

            mealSuggestionsTextView.text = ""

        }

    }

}