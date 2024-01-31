package com.example.fragmentmanager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentmanager.databinding.FragmentMainBinding

class MainFragment: Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonTransition.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, DogsFragment())
                addToBackStack(null)
                commit()
            }
        }
    }
}