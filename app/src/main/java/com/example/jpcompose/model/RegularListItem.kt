package com.example.jpcompose.model

data class RegularListItem(
    var id : Int,
    var title : String,
    var description : String,
    var image : ListItemImage?,
    var content : String,
)

data class ListItemImage(var imageId : Int = 0, var imageUrl : String)

