package com.example.mainscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mainscreen.ui.theme.MainScreenTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {

            var screen by remember { mutableStateOf("login") }

            if (screen == "login") {
                LoginScreen(
                    goToSignUp = { screen = "signup" }
                )
            } else {
                SignUpScreen(
                    goToLogin = { screen = "login" }
                )
            }
        }
    }
}

@Composable
fun MainScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 50.dp, horizontal = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.phone),
            contentDescription = "Banner Image",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(280.dp)
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Hello",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Welcome To Little Drop, where you manage you daily tasks",
            fontSize = 16.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(34.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color(0xFF524EB6)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Login",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.White)
                .border(
                    width = 2.dp,
                    color = Color(0xFF4B49AC)
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Sign up",
                color = Color(0xFF524EB6),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Sign up using",
            fontSize = 12.sp,
            color = Color.Gray
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.icono_facebook),
                contentDescription = "Facebook",
                modifier = Modifier.size(40.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.google_icon),
                contentDescription = "Google",
                modifier = Modifier.size(40.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.ln_icon),
                contentDescription = "Linkedin",
                modifier = Modifier.size(45.dp)
            )
        }
    }
}

@Composable
fun LoginScreen(goToSignUp: () -> Unit) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 50.dp, horizontal = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.phone),
            contentDescription = "Banner Image",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(280.dp)
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Login",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Name",
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.Start)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Escribe tu nombre") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(10.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Email",
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.Start)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Escribe tu email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(10.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Password",
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.Start)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(10.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = goToSignUp) {
            Text(text = "Sign Up")
        }
    }
}

@Composable
fun SignUpScreen(goToLogin: () -> Unit) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 150.dp, horizontal = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Sign Up",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Nombre") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Correo") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Telefono") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Contraseña") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Confirmar Contraseña") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Button(onClick = goToLogin) {
                Text("Aceptar")
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {}
            ) {
                Text("Cancelar")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    MainScreenTheme {
        LoginScreen(goToSignUp = {})
    }
}