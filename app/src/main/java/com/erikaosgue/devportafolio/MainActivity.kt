package com.erikaosgue.devportafolio

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.erikaosgue.devportafolio.controller.DevPagerAdapter
import com.erikaosgue.devportafolio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

	lateinit var  activityMainBinding: ActivityMainBinding
 	override fun onCreate(savedInstanceState: Bundle?) {
 		super.onCreate(savedInstanceState)
 		activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
 		setContentView(activityMainBinding.root)

		// Set up our tabs
		activityMainBinding.apply {
			viewPagerId.adapter = DevPagerAdapter(supportFragmentManager)
			tabLayoutId.setupWithViewPager(viewPagerId)
			tabLayoutId.setTabTextColors(Color.GRAY, Color.parseColor("white"))
		}

	}
}