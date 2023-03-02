package com.rezoo.koin_di

class UserRepositoryImpl:UserRepository {
    override fun getAllUser(): List<User> {

        var mylist=ArrayList<User>()
        var user=User(1,"ali","ali22")
        mylist.add(user)
        user=User(2,"hadi","hadi33")
        mylist.add(user)
        user=User(3,"reza","reza44")
        mylist.add(user)
        return mylist
    }
}