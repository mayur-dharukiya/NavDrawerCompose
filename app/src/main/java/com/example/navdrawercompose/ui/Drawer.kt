package com.example.navdrawercompose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.navdrawercompose.R
import com.example.navdrawercompose.ui.theme.NavDrawerComposeTheme
import com.example.navdrawercompose.Model.data.Screens

@Composable
fun Drawer(

    modifier: Modifier =Modifier,
    onDestinationClicked:(route:String)->Unit

    )
{
       Column(
           modifier
               .fillMaxSize()
               .padding(start = 24.dp, top = 48.dp)

       ) {

           Image(painter = painterResource(R.drawable.kiwi) , contentDescription ="App Icon" )

           Spacer(Modifier.height(24.dp))

          Screens.forEach{screen->
              Spacer(Modifier.height(24.dp))
              Text(
                  text = screen.title,
                  style=MaterialTheme.typography.h4,
                  modifier=Modifier.clickable {onDestinationClicked(screen.route) })


          }

       }
}
@Preview
@Composable
fun DrawerPreview()
{
    NavDrawerComposeTheme {

        Drawer{}
    }

}











