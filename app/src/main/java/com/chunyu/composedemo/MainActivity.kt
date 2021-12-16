package com.chunyu.composedemo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.chunyu.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Column {
                        Button(
                            onClick = {
                                startActivity(Intent(this@MainActivity, ComposeClassOneActivity::class.java))
                            }
                        ) {
                            Text(text = "open class 1")
                        }

                        Button(
                            onClick = {
                                startActivity(Intent(this@MainActivity, ComposeClassTwoActivity::class.java))
                            }
                        ) {
                            Text(text = "open class 2")
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeDemoTheme {
    }
}