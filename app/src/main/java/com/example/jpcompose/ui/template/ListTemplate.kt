package com.example.jpcompose.ui.template

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.jpcompose.model.RegularList
import com.example.jpcompose.model.RegularListItem

object ListTemplate {

    @Composable
    fun ListItemRowCompose(listItem : RegularListItem)
    {
        Card(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .padding(10.dp)
            )
            {
                if(listItem.image?.imageId!! > 0)
                    Image(
                    painter = painterResource(listItem.image!!.imageId),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(20.dp)
                        .size(40.dp)
                    )
                else
                    AsyncImage(model = listItem.image?.imageUrl,
                        contentDescription ="",
                        modifier = Modifier.padding(20.dp))


                Spacer(modifier = Modifier.width(8.dp))

                Column {
                    Text(listItem.title)
                    Text(listItem.description)
                }
            }
        }
    }

    @Composable
    fun ListCompose(list : RegularList) {
        Scaffold() {
            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                items(list.items) { li ->
                    ListItemRowCompose(listItem = li)
                }
            }
        }
    }
}