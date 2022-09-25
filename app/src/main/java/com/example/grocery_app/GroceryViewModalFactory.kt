package com.example.av_grocery_app
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class GroceryViewModalFactory (private val repository: GroceryRepository) : ViewModelProvider.NewInstanceFactory() {

    override fun <T: ViewModel> create(modelClass: Class<T>):T{
        return GroceryViewModal(repository) as T
    }
}