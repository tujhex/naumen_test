package com.wagon.hsxrjd.computerdatabase.model

import io.realm.CardRealmProxy
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import org.parceler.Parcel

/**
 * Created by hsxrjd on 23.05.17.
 */
@Parcel(implementations = arrayOf(CardRealmProxy::class),
        value = Parcel.Serialization.BEAN,
        analyze = arrayOf(Card::class))
open class Card() : RealmObject() {
    @PrimaryKey var id: Int = -1
    var name: String = ""
    var imageUrl: String? = null
    var company: Company? = null
    var description: String? = null

    constructor(
            eid: Int,
            ename: String,
            eImageUrl: String?,
            eCompany: Company?,
            eDescription: String?
    ) : this() {
        id = eid
        name = ename
        imageUrl = eImageUrl
        company = eCompany
        description = eDescription
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as Card

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }

}