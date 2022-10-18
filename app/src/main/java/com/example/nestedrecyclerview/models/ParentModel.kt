package com.example.nestedrecyclerview.models

data class ParentModel (
        val title : String = "",
        val children : List<ChildModel>
)