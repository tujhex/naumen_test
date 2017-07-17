package com.wagon.hsxrjd.computerdatabase

import android.app.Application
import com.wagon.hsxrjd.computerdatabase.dagger.*
import com.wagon.hsxrjd.computerdatabase.dagger.source.ApiModule
import com.wagon.hsxrjd.computerdatabase.dagger.source.DataSourceModule

/**
 * Created by hsxrjd on 24.05.17.
 */
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

    }

    companion object {
        val appComponent: AppComponent by lazy {
            DaggerAppComponent
                    .builder()
                    .apiModule(ApiModule())
                    .dataSourceModule(DataSourceModule())
                    .navigatorModule(NavigatorModule())
                    .build()
        }
    }
}
