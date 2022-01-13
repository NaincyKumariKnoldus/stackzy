package com.theapache64.stackzy.test

import com.theapache64.stackzy.data.remote.ApiInterface
import com.theapache64.stackzy.data.repo.*
import com.theapache64.stackzy.di.module.*
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        NetworkModule::class,
        PreferenceModule::class,
        CryptoModule::class,
        JadxModule::class,
    ]
)
interface TestComponent {
    fun apiInterface(): ApiInterface
    fun librariesRepo(): LibrariesRepo
    fun adbRepo(): AdbRepo
    fun authRepo(): AuthRepo
    fun configRepo(): ConfigRepo
    fun resultRepo(): ResultsRepo
    fun playStoreRepo(): PlayStoreRepo
    fun apkAnalyzerRepo(): ApkAnalyzerRepo
    fun untrackedLibsRepo(): UntrackedLibsRepo
    fun jadxRepo(): JadxRepo
}