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

public val HeadIcon.`Icon-14`: ImageVector
    get() {
        if (`_icon-14` != null) {
            return `_icon-14`!!
        }
        `_icon-14` = Builder(name = "Icon-14", defaultWidth = 13.38.dp, defaultHeight = 17.75.dp,
                viewportWidth = 13.38f, viewportHeight = 17.75f).apply {
            path(fill = SolidColor(Color(0xFFff6e4e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.73f, 1.86f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 2.48f, 12.1f)
                lineTo(6.42f, 17.0f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.41f, 0.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, 0.4f, -0.21f)
                lineToRelative(4.0f, -5.15f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.49f, -10.0f)
                close()
                moveTo(10.43f, 11.14f)
                lineTo(10.43f, 11.14f)
                lineTo(6.82f, 15.81f)
                lineTo(3.27f, 11.42f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 8.45f, -3.52f)
                arcTo(4.9f, 4.9f, 0.0f, false, true, 10.43f, 11.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFFff6e4e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.73f, 5.68f)
                arcTo(1.89f, 1.89f, 0.0f, true, false, 8.61f, 7.56f)
                arcTo(1.89f, 1.89f, 0.0f, false, false, 6.73f, 5.68f)
                close()
                moveTo(6.73f, 8.4f)
                arcToRelative(0.84f, 0.84f, 0.0f, true, true, 0.83f, -0.84f)
                arcTo(0.83f, 0.83f, 0.0f, false, true, 6.73f, 8.4f)
                close()
            }
        }
        .build()
        return `_icon-14`!!
    }

private var `_icon-14`: ImageVector? = null
