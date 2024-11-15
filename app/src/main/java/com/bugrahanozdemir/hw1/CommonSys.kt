package com.bugrahanozdemir.hw1

import java.util.Collections

object CommonSys {
    val selectedItems = ArrayList<String>()


    // Static method to prepare data
    fun prepareData() {
        Collections.addAll(
            selectedItems,
        )
    }

    // Method to add object to list
    fun addItem(item: String) {
        selectedItems.add(item)
    }

}