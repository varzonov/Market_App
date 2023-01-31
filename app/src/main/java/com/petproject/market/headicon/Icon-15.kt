package com.petproject.market.headicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.petproject.market.HeadIcon

public val HeadIcon.`Icon-15`: ImageVector
    get() {
        if (`_icon-15` != null) {
            return `_icon-15`!!
        }
        `_icon-15` = Builder(name = "Icon-15", defaultWidth = 12.8.dp, defaultHeight = 15.71.dp,
                viewportWidth = 12.8f, viewportHeight = 15.71f).apply {
            path(fill = SolidColor(Color(0xFF010035)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.84f, 14.85f)
                arcToRelative(1.36f, 1.36f, 0.0f, false, false, 0.61f, 0.19f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, false, 0.63f, -0.14f)
                lineTo(7.77f, 14.0f)
                arcToRelative(1.31f, 1.31f, 0.0f, false, false, 0.51f, -0.48f)
                arcToRelative(1.37f, 1.37f, 0.0f, false, false, 0.19f, -0.68f)
                verticalLineTo(9.08f)
                lineToRelative(3.0f, -3.09f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, false, 0.37f, -0.91f)
                verticalLineTo(3.34f)
                arcToRelative(1.33f, 1.33f, 0.0f, false, false, -0.37f, -0.92f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 10.59f, 2.0f)
                horizontalLineTo(2.12f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -0.89f, 0.38f)
                arcToRelative(1.34f, 1.34f, 0.0f, false, false, -0.38f, 0.92f)
                verticalLineTo(5.08f)
                arcTo(1.34f, 1.34f, 0.0f, false, false, 1.23f, 6.0f)
                lineToRelative(3.0f, 3.09f)
                verticalLineToRelative(4.66f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, false, 0.16f, 0.64f)
                arcTo(1.41f, 1.41f, 0.0f, false, false, 4.84f, 14.85f)
                close()
                moveTo(2.12f, 5.08f)
                verticalLineTo(3.34f)
                horizontalLineToRelative(8.47f)
                verticalLineTo(5.08f)
                lineTo(7.2f, 8.54f)
                verticalLineToRelative(4.34f)
                lineToRelative(-1.69f, 0.86f)
                verticalLineTo(8.54f)
                close()
            }
        }
        .build()
        return `_icon-15`!!
    }

private var `_icon-15`: ImageVector? = null
