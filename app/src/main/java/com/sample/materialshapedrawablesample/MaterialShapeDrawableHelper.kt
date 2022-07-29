package com.sample.materialshapedrawablesample

import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.google.android.material.shape.*
fun getBubbleRight(context: Context): Drawable? {
    val shapeModel = ShapeAppearanceModel.builder()
        .setAllCornerSizes(context.resources.getDimension(R.dimen.dp_6))
        .setRightEdge(
            OffsetEdgeTreatment(
                TriangleEdgeTreatment(context.resources.getDimension(R.dimen.dp_6), false),
                0f
            )
        )
        .build()
    val backgroundDrawable = MaterialShapeDrawable(shapeModel).apply {
        setTint(Color.parseColor("#FA4B05"))
        paintStyle = Paint.Style.FILL
    }
    return backgroundDrawable
}
fun getBubbleBottom(context: Context): Drawable? {
    val shapeModel = ShapeAppearanceModel.builder()
        .setAllCornerSizes(context.resources.getDimension(R.dimen.dp_6))
        .setBottomEdge(
            OffsetEdgeTreatment(
                TriangleEdgeTreatment(context.resources.getDimension(R.dimen.dp_6), false),
                context.resources.getDimension(R.dimen.dp_30)
            )
        )
        .build()
    val backgroundDrawable = MaterialShapeDrawable(shapeModel).apply {
        setTint(Color.parseColor("#FA4B05"))
        paintStyle = Paint.Style.FILL
    }
    return backgroundDrawable
}
fun getTriangleOuter(context: Context): Drawable? {
    val shapeModel = ShapeAppearanceModel.builder()
        .setAllCorners(RoundedCornerTreatment())
        .setAllCornerSizes(context.resources.getDimension(R.dimen.dp_10))
        .setAllEdges(TriangleEdgeTreatment(context.resources.getDimension(R.dimen.dp_10), false))
        .build()
    val backgroundDrawable = MaterialShapeDrawable(shapeModel).apply {
        setTint(Color.GRAY)
        paintStyle = Paint.Style.FILL_AND_STROKE
        strokeWidth = context.resources.getDimension(R.dimen.dp_2)
        strokeColor = ContextCompat.getColorStateList(context, R.color.red)
    }
    return backgroundDrawable
}
fun getTriangleInner(context: Context): Drawable? {
    val shapeModel = ShapeAppearanceModel.builder()
        .setAllCorners(RoundedCornerTreatment())
        .setAllCornerSizes(context.resources.getDimension(R.dimen.dp_10))
        .setAllEdges(TriangleEdgeTreatment(context.resources.getDimension(R.dimen.dp_10), true))
        .build()
    val backgroundDrawable = MaterialShapeDrawable(shapeModel).apply {
        setTint(Color.GRAY)
        paintStyle = Paint.Style.FILL_AND_STROKE
        strokeWidth = context.resources.getDimension(R.dimen.dp_2)
        strokeColor = ContextCompat.getColorStateList(context, R.color.red)
    }
    return backgroundDrawable
}

fun getMarker(context: Context): Drawable? {
    val shapeModel = ShapeAppearanceModel.builder()
        .setAllCorners(RoundedCornerTreatment())
        .setAllCornerSizes(context.resources.getDimension(R.dimen.dp_10))
        .setAllEdges(MarkerEdgeTreatment(context.resources.getDimension(R.dimen.dp_10)))
        .build()
    val backgroundDrawable = MaterialShapeDrawable(shapeModel).apply {
        setTint(Color.GRAY)
        paintStyle = Paint.Style.FILL_AND_STROKE
        strokeWidth = context.resources.getDimension(R.dimen.dp_2)
        strokeColor = ContextCompat.getColorStateList(context, R.color.red)
    }
    return backgroundDrawable
}

fun getCutCorner(context: Context): Drawable? {
    val shapeModel = ShapeAppearanceModel.builder()
        .setAllCorners(CutCornerTreatment())
        .setAllCornerSizes(context.resources.getDimension(R.dimen.dp_10))
        .build()
    val backgroundDrawable = MaterialShapeDrawable(shapeModel).apply {
        setTint(Color.GRAY)
        paintStyle = Paint.Style.FILL
    }
    return backgroundDrawable
}

fun getRoundedCorner(context: Context): Drawable? {
    val shapeModel = ShapeAppearanceModel.builder()
        .setAllCorners(RoundedCornerTreatment())
        .setAllCornerSizes(context.resources.getDimension(R.dimen.dp_10))
        .build()
    val backgroundDrawable = MaterialShapeDrawable(shapeModel).apply {
        setTint(Color.GRAY)
        paintStyle = Paint.Style.FILL
    }
    return backgroundDrawable
}
fun getShadow(context: Context): Drawable? {
    val shapeModel = ShapeAppearanceModel.builder()
        .setAllCorners(RoundedCornerTreatment())
        .setAllCornerSizes(context.resources.getDimension(R.dimen.dp_16))
        .build()
    val drawable = MaterialShapeDrawable(shapeModel).apply {
        setTint(Color.GRAY)
        paintStyle = Paint.Style.FILL

        //绘制阴影
        shadowCompatibilityMode = MaterialShapeDrawable.SHADOW_COMPAT_MODE_ALWAYS
        initializeElevationOverlay(context)
        setShadowColor(Color.RED)
        elevation = context.resources.getDimension(R.dimen.dp_10)
    }
    return  drawable
}