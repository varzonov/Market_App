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

public val HeadIcon.`Icon-09`: ImageVector
    get() {
        if (`_icon-09` != null) {
            return `_icon-09`!!
        }
        `_icon-09` = Builder(name = "Icon-09", defaultWidth = 71.0.dp, defaultHeight = 71.0.dp,
                viewportWidth = 71.0f, viewportHeight = 71.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.5f, 35.5f)
                moveToRelative(-35.5f, 0.0f)
                arcToRelative(35.5f, 35.5f, 0.0f, true, true, 71.0f, 0.0f)
                arcToRelative(35.5f, 35.5f, 0.0f, true, true, -71.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFb3b3c3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.83f, 16.5f)
                horizontalLineTo(29.17f)
                arcToRelative(5.29f, 5.29f, 0.0f, false, false, -5.28f, 5.28f)
                verticalLineTo(49.22f)
                arcToRelative(5.29f, 5.29f, 0.0f, false, false, 5.28f, 5.28f)
                horizontalLineTo(41.83f)
                arcToRelative(5.29f, 5.29f, 0.0f, false, false, 5.28f, -5.28f)
                verticalLineTo(21.78f)
                arcTo(5.29f, 5.29f, 0.0f, false, false, 41.83f, 16.5f)
                close()
                moveTo(45.0f, 49.22f)
                arcToRelative(3.17f, 3.17f, 0.0f, false, true, -3.17f, 3.17f)
                horizontalLineTo(29.17f)
                arcTo(3.17f, 3.17f, 0.0f, false, true, 26.0f, 49.22f)
                verticalLineTo(21.78f)
                arcToRelative(3.17f, 3.17f, 0.0f, false, true, 3.17f, -3.17f)
                horizontalLineTo(41.83f)
                arcTo(3.17f, 3.17f, 0.0f, false, true, 45.0f, 21.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFFb3b3c3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.5f, 51.33f)
                arcToRelative(2.11f, 2.11f, 0.0f, true, false, -2.11f, -2.11f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 35.5f, 51.33f)
                close()
            }
            path(fill = SolidColor(Color(0xFFb3b3c3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(37.61f, 19.67f)
                horizontalLineTo(33.39f)
                arcToRelative(1.06f, 1.06f, 0.0f, true, false, 0.0f, 2.11f)
                horizontalLineToRelative(4.22f)
                arcToRelative(1.06f, 1.06f, 0.0f, true, false, 0.0f, -2.11f)
                close()
            }
        }
        .build()
        return `_icon-09`!!
    }

private var `_icon-09`: ImageVector? = null
