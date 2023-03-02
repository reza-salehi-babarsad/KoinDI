package com.rezoo.koin_di

class UserPresent(val repository: UserRepository) {
    fun getUsers():List<User>{
        val mylist=repository.getAllUser()
        return mylist 
    }
}