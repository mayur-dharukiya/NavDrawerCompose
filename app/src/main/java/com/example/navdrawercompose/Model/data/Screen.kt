package com.example.navdrawercompose.Model.data


sealed class DrawerScreen(val title:String, val route:String)
{

    object Home:DrawerScreen("Home","home")
    object Account:DrawerScreen("Account","account")
    object Help:DrawerScreen("Help","help")

}

 val Screens= listOf(

    DrawerScreen.Home,
    DrawerScreen.Account,
    DrawerScreen.Help


)