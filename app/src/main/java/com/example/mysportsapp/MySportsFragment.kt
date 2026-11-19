package com.example.mysportsapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MySportsFragment : Fragment(R.layout.fragment_mysports) {

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnBasketball)
            .setOnClickListener {
                findNavController().navigate(
                    R.id.action_mySports_to_basketball
                )
            }

        view.findViewById<Button>(R.id.btnArchery)
            .setOnClickListener {
                findNavController().navigate(
                    R.id.action_mySports_to_archery
                )
            }

        view.findViewById<Button>(R.id.btnVolleyball)
            .setOnClickListener {
                findNavController().navigate(
                    R.id.action_mySports_to_volleyball
                )
            }

        view.findViewById<Button>(R.id.btnBadminton)
            .setOnClickListener {
                findNavController().navigate(
                    R.id.action_mySports_to_badminton
                )
            }
    }
}