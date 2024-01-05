package com.example.navigation.ui.places

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.navigation.R


class PlacesFragment : Fragment() {
    private val placesViewModel: PlacesViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_places, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textView: TextView = view.findViewById(R.id.text_places)
        val button: Button = view.findViewById(R.id.button)

        button.setOnClickListener {
            findNavController().navigate(R.id.action_placesFragment2_to_titleFragment3)
        }
        placesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
    }


}