package com.example.lab7_roomdemo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
class Product {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    @ColumnInfo(name = "productName")
    var productName: String = ""
    var quentity: Int = 0

    constructor()

    constructor(productName: String, quentity: Int) {
        this.productName = productName
        this.quentity = quentity
    }
}