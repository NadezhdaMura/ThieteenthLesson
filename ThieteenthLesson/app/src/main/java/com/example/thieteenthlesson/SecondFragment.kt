package com.example.thieteenthlesson

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class SecondFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_two,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var toast1 = arguments?.getString("key")
        var toast2 = arguments?.getString("key2")
        Log.d("smt","$toast1 $toast2")
        Toast.makeText(requireContext(), "$toast1 $toast2", Toast.LENGTH_LONG).show()


    }
}