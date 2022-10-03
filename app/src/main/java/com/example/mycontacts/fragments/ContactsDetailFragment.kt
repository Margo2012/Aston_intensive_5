package com.example.mycontacts.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mycontacts.R
import com.example.mycontacts.databinding.FragmentContactsDetailBinding


class ContactsDetailFragment: Fragment() {
    private lateinit var binding: FragmentContactsDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_contacts_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val bundle = arguments
//        if (bundle != null) {
//            binding.lastNameTextView.text = bundle.getString("person")
//        }
    }

}