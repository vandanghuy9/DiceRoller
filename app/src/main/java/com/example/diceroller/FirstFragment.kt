package com.example.diceroller

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBindings
import com.example.diceroller.databinding.FragmentFirstBinding
import com.example.diceroller.model.Dice

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstFragmentTextView: TextView = binding.textviewFirst;
        val dice = Dice(6);
        binding.buttonFirst.setOnClickListener {
            var result: String =  "Result:" + dice.roll().toString();
            firstFragmentTextView.text = result;
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
