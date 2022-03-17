package com.example.navdrawercompose.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navdrawercompose.Model.data.DrawerScreen
import com.example.navdrawercompose.ui.theme.NavDrawerComposeTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavDrawerComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                          AppMainScreen()

                }
            }
        }
    }
}

@Composable
fun AppMainScreen(){

    val navController= rememberNavController()
    androidx.compose.material.Surface(
        color=MaterialTheme.colors.background

    ) {

        var drawerState= rememberDrawerState(DrawerValue.Closed )
        var scope= rememberCoroutineScope() //corouitines
        var openDrawer = {

            scope.launch {

                drawerState.open()
            }
        }

        //ModalDrawer

        ModalDrawer(

            drawerState=drawerState,
            gesturesEnabled = drawerState.isOpen,
            drawerContent = {

                  Drawer(onDestinationClicked = { route ->

                      scope.launch {

                          drawerState.close()

                      }
                      navController.navigate(route)
                      {
                          popUpTo=navController.graph.startDestinationId //replaced
                          //popUpToId=navController.graph.startDestinationId
                          launchSingleTop=true
                      }
                  })
            }


        ) {

            NavHost(navController = navController, startDestination = DrawerScreen.Home.route)
            {

                composable(DrawerScreen.Home.route)
                {

                    Home (openDrawer ={

                        openDrawer()
                    }

                    )
                }

                //2nd

                composable(DrawerScreen.Account.route)
                {

                    Account (openDrawer ={

                        openDrawer()
                    }

                    )
                }

                //3rd

                composable(DrawerScreen.Help.route)
                {

                   Help ( navController=navController

                    )
                }


            }




        }


    }




}

