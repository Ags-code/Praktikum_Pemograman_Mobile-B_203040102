package com.example.AgungSeptiana203040102.di

import android.app.Application
import androidx.room.Room
import com.example.AgungSeptiana203040102.persistences.AppDatabase
import com.example.AgungSeptiana203040102.persistences.PendaftaranAwalDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn (SingletonComponent::class)
object PersistenceModule {
    @Provides
    @Singleton
    fun provideAppDatabase(application: Application) : AppDatabase {
        return Room
            .databaseBuilder(
                application,
                AppDatabase::class.java,
                "pengelolaan-pendaftaran awal posyandu"
            )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun providePendaftaranAwalDao(appDatabase: AppDatabase) : PendaftaranAwalDao {
        return appDatabase.pendaftaranAwalDao()
    }
}