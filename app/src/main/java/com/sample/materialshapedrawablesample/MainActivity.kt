package com.sample.materialshapedrawablesample

import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.RoundedCornerTreatment
import com.google.android.material.shape.ShapeAppearanceModel

class MainActivity : AppCompatActivity() {
    lateinit var tv: View;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showRoundedCorner()
        showCutCorner()
        showMarker()
        showTriangleInner()
        showTriangleOuter()
        showBubbleBottom()
        showBubbleRight()
        showShadow()
    }

    private fun showBubbleRight() {
        val tv = findViewById<TextView>(R.id.tv_bubble_right)
        (tv.parent as ViewGroup).clipChildren = false
        tv.background = getBubbleRight(this)
    }

    private fun showBubbleBottom() {
        val tv = findViewById<TextView>(R.id.tv_bubble_bottom)
        (tv.parent as ViewGroup).clipChildren = false
        tv.background = getBubbleBottom(this)
    }

    private fun showTriangleOuter() {
        val tv = findViewById<TextView>(R.id.tv_triangle_outer)
        (tv.parent as ViewGroup).clipChildren = false
        tv.background = getTriangleOuter(this)
    }

    private fun showTriangleInner() {
        val tv = findViewById<TextView>(R.id.tv_triangle_inner)
        tv.background = getTriangleInner(this)
    }

    private fun showMarker() {
        val tv = findViewById<TextView>(R.id.tv_marker)
        tv.background = getMarker(this);
    }

    private fun showRoundedCorner() {
        val tv = findViewById<TextView>(R.id.tv_round_corner)
        tv.background = getRoundedCorner(this);
    }
    private fun showCutCorner() {
        val tv = findViewById<View>(R.id.tv_cut_corner)
        tv.background = getCutCorner(this)
    }

    private fun showShadow() {
        tv  = findViewById(R.id.tv_shadow)
        val backgroundDrawable = getShadow(this)
        (tv.parent  as ViewGroup).clipChildren = false
        tv.background = backgroundDrawable
    }


}