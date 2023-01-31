package com.petproject.market.headicon.headicon

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
import com.petproject.market.headicon.HeadIcon

public val HeadIcon.`Icon-17`: ImageVector
    get() {
        if (`_icon-17` != null) {
            return `_icon-17`!!
        }
        `_icon-17` = Builder(name = "Icon-17", defaultWidth = 45.0.dp, defaultHeight = 46.4.dp,
                viewportWidth = 45.0f, viewportHeight = 46.4f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.83f, 4.2f)
                horizontalLineTo(16.17f)
                arcToRelative(5.29f, 5.29f, 0.0f, false, false, -5.28f, 5.28f)
                verticalLineTo(36.92f)
                arcToRelative(5.29f, 5.29f, 0.0f, false, false, 5.28f, 5.28f)
                horizontalLineTo(28.83f)
                arcToRelative(5.29f, 5.29f, 0.0f, false, false, 5.28f, -5.28f)
                verticalLineTo(9.48f)
                arcTo(5.29f, 5.29f, 0.0f, false, false, 28.83f, 4.2f)
                close()
                moveTo(32.0f, 36.92f)
                arcToRelative(3.17f, 3.17f, 0.0f, false, true, -3.17f, 3.17f)
                horizontalLineTo(16.17f)
                arcTo(3.17f, 3.17f, 0.0f, false, true, 13.0f, 36.92f)
                verticalLineTo(9.48f)
                arcToRelative(3.17f, 3.17f, 0.0f, false, true, 3.17f, -3.17f)
                horizontalLineTo(28.83f)
                arcTo(3.17f, 3.17f, 0.0f, false, true, 32.0f, 9.48f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 39.0f)
                arcToRelative(2.11f, 2.11f, 0.0f, true, false, -2.11f, -2.11f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 22.5f, 39.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.61f, 7.37f)
                horizontalLineTo(20.39f)
                arcToRelative(1.06f, 1.06f, 0.0f, true, false, 0.0f, 2.11f)
                horizontalLineToRelative(4.22f)
                arcToRelative(1.06f, 1.06f, 0.0f, true, false, 0.0f, -2.11f)
                close()
            }
        }
        .build()
        return `_icon-17`!!
    }

private var `_icon-17`: ImageVector? = null
