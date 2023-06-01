package com.example.noteappcoompose.util.tool

sealed class OrderType{
    object Ascending: OrderType()
    object Descending: OrderType()
}
