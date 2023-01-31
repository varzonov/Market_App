package com.petproject.market.headicon.headicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.petproject.market.headicon.HeadIcon

public val HeadIcon.`Icon-25`: ImageVector
    get() {
        if (`_icon-25` != null) {
            return `_icon-25`!!
        }
        `_icon-25` = Builder(name = "Icon-25", defaultWidth = 15.42.dp, defaultHeight = 11.64.dp,
                viewportWidth = 15.42f, viewportHeight = 11.64f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFb3b3b3)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.45f, 8.06f)
                lineTo(11.75f, 3.76f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFb3b3b3)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.39f, 8.02f)
                lineTo(2.99f, 3.84f)
            }
        }
        .build()
        return `_icon-25`!!
    }

private var `_icon-25`: ImageVector? = null
