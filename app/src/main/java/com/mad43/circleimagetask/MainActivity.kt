package com.mad43.circleimagetask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.mad43.circleimagetask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.ivLocalOne.setImageResource(R.drawable.twitterone)
        binding.ivLocalTwo.setImageResource(R.drawable.twittertwo)
        binding.ivLocalThree.setImageResource(R.drawable.twitterthree)
        binding.ivLocalFour.setImageResource(R.drawable.twitterfour)

        Glide.with(this)
            .load(MyURL.FIRST_IMAGE)
            .error(R.drawable.ic_launcher_background)
            .placeholder(R.drawable.loading)
            .into(binding.ivRemoteOne)
        Glide.with(this)
            .load(MyURL.SECOND_IMAGE)
            .error(R.drawable.ic_launcher_background)
            .placeholder(R.drawable.loading)
            .into(binding.ivRemoteTwo)
        Glide.with(this)
            .load(MyURL.THIRD_IMAGE)
            .error(R.drawable.ic_launcher_background)
            .placeholder(R.drawable.loading)
            .into(binding.ivRemoteThree)
        Glide.with(this)
            .load(MyURL.FOURTH_IMAGE)
            .placeholder(R.drawable.loading)
            .error(R.drawable.ic_launcher_background)
            .into(binding.ivRemoteFour)
    }
}