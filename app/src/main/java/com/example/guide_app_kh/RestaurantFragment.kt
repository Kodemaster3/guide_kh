package com.example.guide_app_kh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.navigation.fragment.findNavController
import com.example.guide_app_kh.databinding.FragmentRestaurantBinding

/**
 * A simple [Fragment] subclass.
 * Use the [RestaurantFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RestaurantFragment : Fragment() {

    private var _binding: FragmentRestaurantBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRestaurantBinding.inflate(inflater, container, false)
            return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val context = context as MainActivity
        val listItem = resources.getStringArray(R.array.restaurants)

        val lv = context.findViewById(R.id.listItemTheather) as ListView
        val adapter = ArrayAdapter(context, android.R.layout.simple_list_item_1, listItem)
        lv.adapter = adapter

        binding.buttonHome.setOnClickListener {
            findNavController().navigate(R.id.action_restaurantFragment_to_homeFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}