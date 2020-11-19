package com.example.tugasnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_soal.*

class SoalFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonSubmit.setOnClickListener { view: View ->
            val checkedId =
                soalradioGroup.checkedRadioButtonId
            if (-1 != checkedId) {
                var answerIndex = 0
                when (checkedId) {
                    R.id.pilihan1 -> answerIndex = 0
                    R.id.pilihan2 -> answerIndex = 1
                    R.id.pilihan3 -> answerIndex = 2
                    R.id.pilihan4 -> answerIndex = 3
                    R.id.pilihan5 -> answerIndex = 4
                }
                if (answerIndex == 2) {
                    view.findNavController()
                        .navigate(R.id.action_soalFragment_to_successFragment)
                } else {
                    view.findNavController()
                        .navigate(R.id.action_soalFragment_to_failFragment)
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_soal, container, false)
    }

}