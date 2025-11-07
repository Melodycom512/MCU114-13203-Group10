package com.example.fastfoodwizard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fastfoodwizard.ui.theme.FastFoodWizardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FastFoodWizardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FastFoodWizardTheme {
        Greeting("Android")
    }
}
package com.example.fastfoodwizard

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var mainMeal: String? = null
    var sideDish: String? = null
    var drink: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnMainMeal).setOnClickListener {
            startActivity(Intent(this, MainMealActivity::class.java))
        }

        findViewById<Button>(R.id.btnSideDish).setOnClickListener {
            startActivity(Intent(this, SideDishActivity::class.java))
        }

        findViewById<Button>(R.id.btnDrink).setOnClickListener {
            startActivity(Intent(this, DrinkActivity::class.java))
        }

        findViewById<Button>(R.id.btnConfirm).setOnClickListener {
            val intent = Intent(this, ConfirmActivity::class.java)
            intent.putExtra("mainMeal", mainMeal)
            intent.putExtra("sideDish", sideDish)
            intent.putExtra("drink", drink)
            startActivity(intent)
        }
    }
}
