package com.example.excellentvideochattingapp.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.excellentvideochattingapp.R
import com.example.excellentvideochattingapp.adapter.GalleryImageAdapter
import com.example.excellentvideochattingapp.adapter.GalleryImageClickListener
import com.example.excellentvideochattingapp.adapter.Image
import kotlinx.android.synthetic.main.image_gallery.*

class ImagegalleryFragment : Fragment(R.layout.image_gallery), GalleryImageClickListener {
    //gallery image count
    private val SPAN_COUNT = 3
    private val imageList = ArrayList<Image>()
    lateinit var galleryImageAdapter: GalleryImageAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //init adapter
        galleryImageAdapter = GalleryImageAdapter(imageList)
        galleryImageAdapter.listener = this

        //init recycler view
        image_recycler_view.layoutManager = GridLayoutManager(context, SPAN_COUNT)
        image_recycler_view.adapter = galleryImageAdapter

        //load images
        loadImages()
    }
    private fun loadImages() {
        imageList.add(Image("https://i.ibb.co/wBYDxLq/beach.jpg", "Beach Houses"))
        imageList.add(Image("https://i.ibb.co/gM5NNJX/butterfly.jpg", "Butterfly"))
        imageList.add(Image("https://i.ibb.co/10fFGkZ/car-race.jpg", "Car Racing"))
        imageList.add(Image("https://i.ibb.co/ygqHsHV/coffee-milk.jpg", "Coffee with Milk"))
        imageList.add(Image("https://i.ibb.co/7XqwsLw/fox.jpg", "Fox"))
        imageList.add(Image("https://i.ibb.co/L1m1NxP/girl.jpg", "Mountain Girl"))
        imageList.add(Image("https://i.ibb.co/wc9rSgw/desserts.jpg", "Desserts Table"))
        imageList.add(Image("https://i.ibb.co/wdrdpKC/kitten.jpg", "Kitten"))
        imageList.add(Image("https://i.ibb.co/dBCHzXQ/paris.jpg", "Paris Eiffel"))
        imageList.add(Image("https://i.ibb.co/JKB0KPk/pizza.jpg", "Pizza Time"))
        imageList.add(Image("https://i.ibb.co/VYYPZGk/salmon.jpg", "Salmon "))
        imageList.add(Image("https://i.ibb.co/JvWpzYC/sunset.jpg", "Sunset in Beach"))
        galleryImageAdapter.notifyDataSetChanged()
    }

    override fun onClick(position: Int) {
        // handle click of image
    }
}