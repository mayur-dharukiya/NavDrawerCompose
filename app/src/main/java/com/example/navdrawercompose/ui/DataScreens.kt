package com.example.navdrawercompose.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.navdrawercompose.R
import androidx.navigation.NavController

@Composable
fun Home(openDrawer:()->Unit)
{
    Column(

        modifier=Modifier.fillMaxSize()
    ) {


        TopBar(title = "Home",   buttonIcon =Icons.Filled.Menu,onButtonClicked = {openDrawer()})


        Column(
            modifier=Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

             Text(text = "Home Page Content goes here")
        }

    }
    
    
}


@Composable
fun Account(openDrawer:()->Unit)
{
    Column(

        modifier=Modifier.fillMaxSize()
    ) {


        TopBar(title = "Account",   buttonIcon =Icons.Filled.Menu,onButtonClicked = {openDrawer()})


        Column(
            modifier=Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Text(text = "Account Page Content goes here")
        }

    }

}


@Composable
fun Help(navController:NavController)
{
    Column(

        modifier=Modifier.fillMaxSize()
    ) {


        TopBar(title = "Help",   buttonIcon =Icons.Filled.Menu,onButtonClicked = {navController.popBackStack()})


        Column(
            modifier=Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Text(text = "Help Page Content goes here")
        }

    }


}