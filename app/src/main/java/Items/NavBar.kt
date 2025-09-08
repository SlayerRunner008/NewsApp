package Items

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun NavBar(){
    var query by remember { mutableStateOf("") }
    TextField(
        value = query,
        onValueChange = {query = it},
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Icono de busccar",
                tint = Color.Gray
            )
        },
        placeholder = {
            Text(text = "Buscar", color = Color.Gray)
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clip(RoundedCornerShape(12.dp)),
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = Color(0xFFE0E0E0),
            focusedContainerColor = Color(0xFFE0E0E0),
            cursorColor = Color.Black,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            focusedTextColor = Color.Black,
            unfocusedTextColor = Color.Black
        ),
        singleLine = true
    )
}