package com.example.homework2

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
import com.example.homework2.ui.theme.Homework2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Homework2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                        package com.example.homework2

                            import android.os.Bundle
                            import android.view.View
                            import android.widget.Button
                            import android.widget.TextView
                            import androidx.appcompat.app.AppCompatActivity

                    class MainActivity : AppCompatActivity() {

                        private lateinit var txtShow: TextView
                        private lateinit var btnZero: Button
                        private lateinit var btnOne: Button
                        private lateinit var btnTwo: Button
                        private lateinit var btnThree: Button
                        private lateinit var btnFour: Button
                        private lateinit var btnFive: Button
                        private lateinit var btnSix: Button
                        private lateinit var btnSeven: Button
                        private lateinit var btnEight: Button
                        private lateinit var btnNine: Button
                        private lateinit var btnClear: Button
                        private lateinit var btnStar: Button

                        override fun onCreate(savedInstanceState: Bundle?) {
                            super.onCreate(savedInstanceState)
                            setContentView(R.layout.activity_main)

                            txtShow = findViewById(R.id.txtShow)
                            btnZero = findViewById(R.id.btnZero)
                            btnOne = findViewById(R.id.btnOne)
                            btnTwo = findViewById(R.id.btnTwo)
                            btnThree = findViewById(R.id.btnThree)
                            btnFour = findViewById(R.id.btnFour)
                            btnFive = findViewById(R.id.btnFive)
                            btnSix = findViewById(R.id.btnSix)
                            btnSeven = findViewById(R.id.btnSeven)
                            btnEight = findViewById(R.id.btnEight)
                            btnNine = findViewById(R.id.btnNine)
                            btnClear = findViewById(R.id.btnClear)
                            btnStar = findViewById(R.id.btnStar)

                            val myListener = View.OnClickListener { v ->
                                val s = txtShow.text.toString()
                                when (v.id) {
                                    R.id.btnZero -> txtShow.text = "$s0"
                                    R.id.btnOne -> txtShow.text = "$s1"
                                    R.id.btnTwo -> txtShow.text = "$s2"
                                    R.id.btnThree -> txtShow.text = "$s3"
                                    R.id.btnFour -> txtShow.text = "$s4"
                                    R.id.btnFive -> txtShow.text = "$s5"
                                    R.id.btnSix -> txtShow.text = "$s6"
                                    R.id.btnSeven -> txtShow.text = "$s7"
                                    R.id.btnEight -> txtShow.text = "$s8"
                                    R.id.btnNine -> txtShow.text = "$s9"
                                    R.id.btnStar -> txtShow.text = "$s*"
                                    R.id.btnClear -> txtShow.text = "電話號碼："
                                }
                            }

                            // 設定所有按鈕共用同一個 listener
                            listOf(
                                btnZero, btnOne, btnTwo, btnThree, btnFour,
                                btnFive, btnSix, btnSeven, btnEight, btnNine,
                                btnStar, btnClear
                            ).forEach { it.setOnClickListener(myListener) }
                        }
                    }

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
    Homework2Theme {
        Greeting("Android")
    }
}