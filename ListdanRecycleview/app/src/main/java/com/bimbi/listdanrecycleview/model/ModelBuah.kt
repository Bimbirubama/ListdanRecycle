package com.bimbi.listdanrecycleview.model

import com.bimbi.listdanrecycleview.R

data class ModelBuah(
    val image: Int,
    val nama: String
)

object MockList {

    fun getModel(): List<ModelBuah> {
        val itemModel1 = ModelBuah(
            image = R.drawable.apple,
            nama = "Apple"
        )
        val itemModel2 = ModelBuah(
            image = R.drawable.grapes,
            nama = "Anggur"
        )
        val itemModel3 = ModelBuah(
            image = R.drawable.orange,
            nama = "Jeruk"
        )
        val itemModel4 = ModelBuah(
            image = R.drawable.pear,
            nama = "Pir"
        )
        val itemModel5 = ModelBuah(
           image = R.drawable.strawberry,
            nama = "Strawberry"
        )

        val itemList : ArrayList<ModelBuah> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)

        return itemList




    }
}
