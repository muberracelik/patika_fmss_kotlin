package com.muberracelik.solarsystemapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muberracelik.solarsystemapp.databinding.FragmentGetStartedBinding
import androidx.navigation.fragment.findNavController


class GetStartedFragment : Fragment() {

    private lateinit var fragmentGetStartedBinding: FragmentGetStartedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentGetStartedBinding = FragmentGetStartedBinding.inflate(inflater)
        return fragmentGetStartedBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentGetStartedBinding.apply {
            startedButton.setOnClickListener{
                findNavController().navigate(R.id.action_getStartedFragment_to_mainFragment)
            }

        }
    }

}