package com.example.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mycontacts.databinding.ActivityMainBinding
import com.example.mycontacts.fragments.ContactsDetailFragment
import com.example.mycontacts.fragments.ContactsFragment
import com.example.mycontacts.model.Person

private const val FRAGMENT_TAG = "Tag to check that Fragment is created"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val fragment = ContactsFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (supportFragmentManager.findFragmentByTag(FRAGMENT_TAG) == null) {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, fragment, FRAGMENT_TAG)
                commit()
            }
        }
    }
}