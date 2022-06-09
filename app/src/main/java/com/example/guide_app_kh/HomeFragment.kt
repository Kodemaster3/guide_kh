package com.example.guide_app_kh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.guide_app_kh.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ///https://medium.com/nuances-of-programming/android-networking-%D0%B2-2019-retrofit-%D1%81-kotlin-coroutines-7254e68ca4a4

        


        binding.buttonRestaurant.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_restaurantFragment)
        }

        binding.buttonHistory.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_historyFragment)
        }

        binding.buttonPark.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_parkFragment)
        }

        binding.buttonTheater.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_theaterFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}