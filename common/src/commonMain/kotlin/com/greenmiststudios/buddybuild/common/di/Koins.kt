package com.greenmiststudios.buddybuild.common.di

import org.koin.dsl.KoinAppDeclaration
import org.koin.core.context.startKoin as startInternalKoin

public fun startKoin(platformSpecificConfig: KoinAppDeclaration = {}) {
  startInternalKoin {
    // modules(appModule())
    // platformSpecificConfig()
  }
}