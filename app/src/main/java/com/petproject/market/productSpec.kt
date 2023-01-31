package com.petproject.market

data class productSpec(
    val id: Int,
    val is_new: Boolean = false,
    val is_favorites: Boolean = false,
    val title: String,
    val subtitle: String,
    val picture: String,
    val price_without_discount: Int = 0,
    val discount_price: Int = 0,
    val is_buy: Boolean = false
    )
