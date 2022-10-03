package com.example.mycontacts.utils

import com.example.mycontacts.model.Person

fun createContacts(): List<Person> {
    val person1 = Person("Иванов", "Иван", "Иванович", "4754546546")
    val person2 = Person("Петров", "Пётр", "Петрович", "57876154425")
    val person3 = Person("Афанасьева", "Татьяна", "Викторовна", "5454546545")
    return listOf(person1, person2, person3)
}
