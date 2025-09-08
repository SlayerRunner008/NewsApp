package Items

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NewsBoxList(){
    LazyRow(modifier = Modifier
        .fillMaxWidth()
    ) {
        items(newsBoxList){ news ->
            Box(
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(15.dp))
                    .background(Color.Magenta)
                    .padding(19.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()


                ) {
                    Text(text = news.title,
                        fontSize = 24.sp,
                      )
                    Text(text = news.date,
                        fontSize = 15.sp,

                    )
                }

            }

        }
    }
}