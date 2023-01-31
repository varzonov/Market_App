package com.petproject.market

import androidx.compose.ui.graphics.vector.ImageVector
import com.petproject.market.explorericon.`Icon-02`
import com.petproject.market.explorericon.`Icon-03`
import com.petproject.market.explorericon.`Icon-04`
import kotlin.collections.List as ____KtList

public object explorerIcon

private var __AllIcons: ____KtList<ImageVector>? = null

public val explorerIcon.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(`Icon-02`, `Icon-03`, `Icon-04`)
    return __AllIcons!!
  }
