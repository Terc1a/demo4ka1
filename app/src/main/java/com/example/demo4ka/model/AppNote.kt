package com.example.demo4ka.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName ="notes_tables")
data class AppNote (
        @PrimaryKey(autoGenerate = true) val id:Int  = 0,
        @ColumnInfo val name:String = "",
        @ColumnInfo val text:String = "",
        @ColumnInfo val idFirebase:String = ""

        ):Serializable
