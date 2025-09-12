package jorgepinto.elementos

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun ProductCard() {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .width(200.dp)
            .height(280.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.iphone),
                    contentDescription = "Producto",
                    modifier = Modifier
                        .height(180.dp)
                        .width(200.dp)
                )
            }
            Spacer(modifier = Modifier.height(8.dp))

            Column(modifier = Modifier.padding(horizontal = 8.dp)) {
                Text(
                    text = "Nombre del Producto",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Categoría del Producto",
                    fontSize = 12.sp,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "$99.99",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFF9800)
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 4.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Editar",
                        tint = Color.Gray
                    )
                }
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "Eliminar",
                        tint = Color.Red
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun ScreenLogin() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 32.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        Image(
            painter = painterResource(id = R.drawable.unab),
            contentDescription = "Logo UNAB",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Iniciar Sesión",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFFF9900)
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Correo Electrónico") },
            leadingIcon = { Icon(Icons.Default.Email, contentDescription = null) },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Contraseña") },
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null) },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(32.dp))


        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF9900))
        ) {
            Text(
                text = "Iniciar Sesión",
                fontSize = 16.sp,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        TextButton(onClick = { }) {
            Text(
                text = "¿No tienes una cuenta? Regístrate",
                fontSize = 14.sp,
                color = Color(0xFFFF9900)
            )
        }
    }
}

@Preview
@Composable
fun ScreenDetailProduct() {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .width(260.dp)
            .wrapContentHeight(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {

            Box(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.computador),
                    contentDescription = "Producto",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)),
                    contentScale = ContentScale.Crop
                )

                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(8.dp)
                        .size(36.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.95f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = "Favorito",
                        tint = Color(0xFFFFD54F) // amarillo
                    )
                }
            }

            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp)
            ) {
                Text(
                    text = "Nombre del Producto",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "$99.99",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2E7D32)
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Descripción del producto con detalles importantes, características y beneficios.",
                    fontSize = 13.sp,
                    color = Color.Gray,
                    maxLines = 3
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 12.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Button(
                    onClick = { },
                    modifier = Modifier
                        .weight(1f)
                        .height(44.dp),
                    shape = RoundedCornerShape(24.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6A1B9A))
                ) {
                    Icon(imageVector = Icons.Default.Edit, contentDescription = "Editar", tint = Color.White)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "Editar", color = Color.White)
                }

                Button(
                    onClick = { },
                    modifier = Modifier
                        .weight(1f)
                        .height(44.dp),
                    shape = RoundedCornerShape(24.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE53935))
                ) {
                    Icon(imageVector = Icons.Default.Delete, contentDescription = "Eliminar", tint = Color.White)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "Eliminar", color = Color.White)
                }
            }
        }
    }
}




@Preview
@Composable
fun ScreenRegister() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 32.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {


        Image(
            painter = painterResource(id = R.drawable.unab),
            contentDescription = "Logo UNAB",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Registro de Usurio",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFFF9900)
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Nombre") },
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = null) },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))


        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Correo Electrónico") },
            leadingIcon = { Icon(Icons.Default.Email, contentDescription = null) },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))


        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Contraseña") },
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null) },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Confirmar Contraseña") },
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null) },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(32.dp))


        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF9900))
        ) {
            Text(
                text = "Registrarse",
                fontSize = 16.sp,
                color = Color.White
            )
        }
    }
}


@Preview
@Composable
fun BasicListCard(
    items: List<String> = List(5) { "Elemento ${it + 1}" },
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp),
        shape = RoundedCornerShape(6.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 12.dp, top = 16.dp, bottom = 12.dp)
        ) {
            items.forEachIndexed { index, item ->

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = item,
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier
                            .wrapContentWidth()
                    )
                }
                if (index < items.lastIndex) {
                    Spacer(modifier = Modifier.height(8.dp))
                    HorizontalDivider(thickness = 1.dp, modifier = Modifier.fillMaxWidth())
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}