package com.greenmiststudios.buddybuild

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class BuddyBuildApplication : Application() {
  override fun onCreate() {
    super.onCreate()

    startKoin {
      // Log Koin into Android logger
      androidLogger()
      // Reference Android context
      androidContext(this@BuddyBuildApplication)
    }
  }
}