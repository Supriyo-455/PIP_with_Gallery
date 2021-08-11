package com.example.excellentvideochattingapp.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.excellentvideochattingapp.R
import kotlinx.android.synthetic.main.fragment_welcome.*

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_live.setOnClickListener {
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToCameraFragment()
            findNavController().navigate(action)
        }
    }
}