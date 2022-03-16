package com.example.navdrawercompose.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import com.example.navdrawercompose.R


@Composable
fun TopBar(title:String, buttonIcon: ImageVector,onButtonClicked:()->Unit)
{
    TopAppBar(
            title = { Text(text = title) },
            navigationIcon={ IconButton(onClick = { onButtonClicked() }) {
                Icon(buttonIcon,contentDescription = "")
            }
            },
            backgroundColor = MaterialTheme.colors.primaryVariant
        )
    }
