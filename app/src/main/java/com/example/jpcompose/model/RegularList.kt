package com.example.jpcompose.model

data class RegularList(val id: Int)
{
    var name = ""
    var order = 1
    var items : MutableList<RegularListItem> = mutableListOf()
}

