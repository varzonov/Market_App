package com.petproject.market.headicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.petproject.market.HeadIcon

public val HeadIcon.`Icon-13`: ImageVector
    get() {
        if (`_icon-13` != null) {
            return `_icon-13`!!
        }
        `_icon-13` = Builder(name = "Icon-13", defaultWidth = 17.45.dp, defaultHeight = 18.62.dp,
                viewportWidth = 17.45f, viewportHeight = 18.62f).apply {
            path(fill = SolidColor(Color(0xFFff6e4e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.41f, 1.85f)
                arcToRelative(6.76f, 6.76f, 0.0f, true, false, 6.76f, 6.76f)
                arcTo(6.76f, 6.76f, 0.0f, false, false, 7.41f, 1.85f)
                close()
                moveTo(7.41f, 14.19f)
                arcTo(5.58f, 5.58f, 0.0f, true, true, 13.0f, 8.61f)
                arcTo(5.59f, 5.59f, 0.0f, false, true, 7.41f, 14.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFFff6e4e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.48f, 16.84f)
                lineToRelative(-4.3f, -4.29f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, false, -0.83f, 0.0f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, 0.0f, 0.83f)
                lineToRelative(4.29f, 4.3f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.84f, 0.0f)
                arcTo(0.6f, 0.6f, 0.0f, false, false, 16.48f, 16.84f)
                close()
            }
        }
        .build()
        return `_icon-13`!!
    }

private var `_icon-13`: ImageVector? = null
