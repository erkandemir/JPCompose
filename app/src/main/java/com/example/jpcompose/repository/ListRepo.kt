package com.example.jpcompose.repository

import com.example.jpcompose.R
import com.example.jpcompose.model.ListItemImage
import com.example.jpcompose.model.RegularList
import com.example.jpcompose.model.RegularListItem

object ListRepo {
    fun getDummyList() : RegularList
    {
        var rList = RegularList(1)
        rList.name = "List1"
        for(i in 1..100)
        {
            rList.items.add(
                RegularListItem(i, "ListItem$i", "List Item $i Description",
                    ListItemImage(imageId = R.drawable.gat3, ""), "This is content for list item$i"))


        }
        return rList


    }
}