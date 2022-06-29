package com.catalyst.grocerystores.di

import android.app.Application
import androidx.room.Room
import com.catalyst.grocerystores.data.local.GroceriesDatabase
import com.catalyst.grocerystores.data.remote.Api
import com.catalyst.grocerystores.data.repositories.UserRepositoryImpl
import com.catalyst.grocerystores.domain.repositories.UserRepository
import com.catalyst.grocerystores.domain.usecases.auth.AuthenticationUseCases
import com.catalyst.grocerystores.domain.usecases.auth.Login
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    val baseUrl = "https://gorceriesonline.herokuapp.com/"

    @Singleton
    @Provides
    fun provideOkHttpClient():OkHttpClient{
        return OkHttpClient.Builder()
            .build()
    }

    @Singleton
    @Provides
    fun provideGroceriesApi(client: OkHttpClient) : Api{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl)
            .client(client)
            .build()
            .create(Api::class.java)
    }

    @Provides
    @Singleton
    fun provideUserRepository(api: Api): UserRepository {
        return UserRepositoryImpl(api = api)
    }

    @Provides
    @Singleton
    fun provideAuthenticationUseCases(repository: UserRepository): AuthenticationUseCases{
        return AuthenticationUseCases(
            login = Login(userRepository = repository)
        )
    }

    @Provides
    @Singleton
    fun provideGroceriesDatabase(app : Application) : GroceriesDatabase {
        return Room.databaseBuilder(
            app,
            GroceriesDatabase::class.java,
            GroceriesDatabase.DATABASE_NAME
        )
            .build()
    }

}