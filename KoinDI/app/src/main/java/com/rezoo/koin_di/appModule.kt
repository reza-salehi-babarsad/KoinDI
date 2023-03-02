package com.rezoo.koin_di
import org.koin.dsl.module

val appModule = module {
    single<UserRepository> {
        UserRepositoryImpl()
    }
    factory {
        UserPresent(get())
    }

}