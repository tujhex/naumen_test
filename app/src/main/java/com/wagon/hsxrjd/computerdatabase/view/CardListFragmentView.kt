package com.wagon.hsxrjd.computerdatabase.view

import com.wagon.hsxrjd.computerdatabase.model.Card

/**
 * Created by hsxrjd on 23.05.17.
 */


interface CardListFragmentView : BaseCardView {
    fun showCardList(cardList: List<Card>)
    fun showNextPage(cardList: List<Card>)
    fun switchLoadingAbility(flag: Boolean)
}