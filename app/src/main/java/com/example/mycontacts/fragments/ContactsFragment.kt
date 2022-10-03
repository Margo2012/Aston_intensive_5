package com.example.mycontacts.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.mycontacts.R
import com.example.mycontacts.utils.createContacts


class ContactsFragment : Fragment() {

    private lateinit var fragment: ContactsDetailFragment


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_contacts, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val personList = createContacts()
        val personTextList = createPersonTextList(view)

        var fullPersonName: String = ""
        for (i in personList.indices) {
            fullPersonName =
                personList[i].lastName + " " + personList[i].name + " " + personList[i].secondName
            personTextList[i].text = fullPersonName
            goToDetailFragment(personTextList[i])
        }
    }

    private fun goToDetailFragment(view: View) {
        view.setOnClickListener {
            fragment = ContactsDetailFragment()
//            val bundle = Bundle()
//            bundle.putString("person", "fullPersonName")
//            fragment.arguments = bundle

            activity?.supportFragmentManager?.beginTransaction()?.apply {
                replace(R.id.fragment_container, fragment)
                addToBackStack("backstack tag")
                commit()
            }
        }
    }

    private fun createPersonTextList(view: View): List<TextView> {
        val personText1: TextView = view.findViewById(R.id.person1)
        val personText2: TextView = view.findViewById(R.id.person2)
        val personText3: TextView = view.findViewById(R.id.person3)
        return listOf(personText1, personText2, personText3)
    }
}






