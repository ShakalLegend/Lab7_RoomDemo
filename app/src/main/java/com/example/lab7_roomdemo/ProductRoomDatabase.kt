package com.example.lab7_roomdemo
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [(Product::class)], version = 1, exportSchema = false)
abstract class ProductRoomDatabase: RoomDatabase() {

    abstract fun productDao(): ProductDao

    companion object {
        private var INSTANSE: ProductRoomDatabase?=null

        fun getInstance(context: Context): ProductRoomDatabase{
            synchronized(this){
                var instance = INSTANSE

                if (instance == null) {
                    instance= Room.databaseBuilder(
                        context.applicationContext,
                        ProductRoomDatabase::class.java,
                        "product_database"
                    ).fallbackToDestructiveMigration()
                        .build()

                    INSTANSE = instance
                }
                return instance
            }
        }
    }

}