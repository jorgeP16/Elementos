package jorgepinto.elementos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Checkbox
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.trace


@Preview(showBackground = true)
@Composable

fun ElementosPrincipales(){

   Column(
       modifier = Modifier.padding(12.dp).fillMaxSize()
   ) {
       Card(
           elevation = CardDefaults.cardElevation(15.dp)
       ) {

           Row(modifier = Modifier.fillMaxWidth().padding(12.dp),
               verticalAlignment = Alignment.CenterVertically) {
               Icon(
                   modifier = Modifier.size(56.dp),
                   imageVector = Icons.Default.AccountCircle,
                   contentDescription = null
               )
               Column(modifier = Modifier.weight(1f)) {
                   Text("Jorge Pinto")
                   Text("Ing.sistemas")

               }
               IconButton(onClick = {}) {
                   Icon(imageVector = Icons.Default.MoreVert,
                       contentDescription = null
                   )
               }


           }
       }
       Spacer(modifier = Modifier.height(12.dp))

       TextField(
           modifier = Modifier.fillMaxWidth(),
           value = "Imput 1",
           onValueChange = {},
           leadingIcon = {
               Icon(Icons.Default.Search,
                   contentDescription = null)
           },
           trailingIcon = {
               Icon(Icons.Default.Close,
                   contentDescription = null)
           }
       )
       Spacer(modifier = Modifier.height(12.dp))
       OutlinedTextField(
           modifier = Modifier.fillMaxWidth(),
           value = "Imput 2",
           onValueChange = {},
           leadingIcon = {
               Icon(Icons.Default.Search,
                   contentDescription = null)
           },
           trailingIcon = {
               Icon(Icons.Default.Close,
                   contentDescription = null)
           }
       )
       Spacer(modifier = Modifier.height(12.dp))

       Row {
           Button(modifier = Modifier.weight(1f), onClick = {}) {
               Icon(Icons.Default.Send,
                   contentDescription = null)
               Spacer(modifier = Modifier.width(12.dp))
               Text("Enviar")

           }
           Spacer(modifier = Modifier.width(12.dp))
           FilledTonalButton(modifier = Modifier.weight(1f),onClick = {}) {
               Icon(
                   Icons.Default.Send,
                   contentDescription = null
               )
               Spacer(modifier = Modifier.width(12.dp))
               Text("Enviar")
           }

       }
       Spacer(modifier = Modifier.height(12.dp))
       Row(
           verticalAlignment = Alignment.CenterVertically
       ){
           Checkbox(checked = true, onCheckedChange = {})
           Text("Seleccionar")

       }

       Row(
           verticalAlignment = Alignment.CenterVertically
       ){
           Switch(checked = true, onCheckedChange = {})
           Text("Seleccionar")

       }


   }

}