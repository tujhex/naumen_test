package com.wagon.hsxrjd.computerdatabase.dagger

import com.wagon.hsxrjd.computerdatabase.MainActivity
import com.wagon.hsxrjd.computerdatabase.dagger.card.CardComponent
import com.wagon.hsxrjd.computerdatabase.dagger.card.CardInteractorModule
import com.wagon.hsxrjd.computerdatabase.dagger.card.CardPresenterModule
import com.wagon.hsxrjd.computerdatabase.dagger.container.ContainerComponent
import com.wagon.hsxrjd.computerdatabase.dagger.container.InteractorModule
import com.wagon.hsxrjd.computerdatabase.dagger.source.ApiModule
import com.wagon.hsxrjd.computerdatabase.dagger.source.DataSourceModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by erychkov on 7/13/17.
 */
@Singleton
@Component(
        modules = arrayOf(
                DataSourceModule::class,
                ApiModule::class,
//                ContextModule::class,
                NavigatorModule::class)
)
interface AppComponent {
    fun inject(mainActivity: MainActivity)
    fun plus(cardPresenterModule: CardPresenterModule, cardInteractorModule: CardInteractorModule): CardComponent
    fun plus(interactorModule: InteractorModule): ContainerComponent

}