package com.example.sampleappscvoicecall

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
/*import com.calls.sdk.SecuredCalls
import com.calls.sdk.User*/
//import com.example.sampleappscvoicecall.ui.theme.SampleAppSCVoiceCallTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
     /*   val user = User("Rahul", age = 32)
        val sc = SecuredCalls()
        val json = sc.toJson(user)
        Toast.makeText(this,json, Toast.LENGTH_SHORT).show()*/
        setContent {
           /* SampleAppSCVoiceCallTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                */    Greeting(
                      //  name = "${user.name} ${user.age}",
                        name = "Android",
                        modifier = Modifier.padding(PaddingValues(100.dp))
                    )
            /*    }
            }*/
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
  //  SampleAppSCVoiceCallTheme {
        Greeting("Android")
   // }
}