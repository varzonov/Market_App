package com.petproject.market.explorericon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.petproject.market.explorerIcon

public val explorerIcon.`Icon-04`: ImageVector
    get() {
        if (`_icon-04` != null) {
            return `_icon-04`!!
        }
        `_icon-04` = Builder(name = "Icon-04", defaultWidth = 18.0.dp, defaultHeight = 18.0.dp,
                viewportWidth = 18.0f, viewportHeight = 18.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 0.2f)
                curveToRelative(2.7f, 0.0f, 5.0f, 2.3f, 5.0f, 5.1f)
                curveToRelative(0.0f, 1.8f, -1.0f, 3.4f, -2.4f, 4.3f)
                curveToRelative(3.2f, 1.0f, 5.6f, 3.9f, 5.9f, 7.4f)
                curveToRelative(0.1f, 0.9f, -1.3f, 1.1f, -1.4f, 0.1f)
                curveToRelative(-0.4f, -3.7f, -3.4f, -6.6f, -7.1f, -6.6f)
                curveToRelative(-3.7f, 0.0f, -6.8f, 2.9f, -7.1f, 6.6f)
                curveToRelative(-0.1f, 0.9f, -1.5f, 0.8f, -1.4f, -0.1f)
                curveToRelative(0.4f, -3.6f, 2.8f, -6.4f, 6.0f, -7.4f)
                curveTo(5.0f, 8.7f, 4.0f, 7.1f, 4.0f, 5.3f)
                curveTo(4.0f, 2.5f, 6.3f, 0.2f, 9.0f, 0.2f)
                close()
                moveTo(9.0f, 1.6f)
                curveToRelative(-2.0f, 0.0f, -3.5f, 1.7f, -3.5f, 3.7f)
                curveToRelative(0.0f, 2.0f, 1.6f, 3.6f, 3.5f, 3.6f)
                curveToRelative(2.0f, 0.0f, 3.6f, -1.6f, 3.6f, -3.6f)
                curveTo(12.6f, 3.3f, 11.0f, 1.6f, 9.0f, 1.6f)
                close()
            }
        }
        .build()
        return `_icon-04`!!
    }

private var `_icon-04`: ImageVector? = null
