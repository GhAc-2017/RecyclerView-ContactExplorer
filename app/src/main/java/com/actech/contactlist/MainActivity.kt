package com.actech.contactlist

import android.Manifest
import android.content.ContentResolver
import android.content.pm.PackageManager
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.actech.contactlist.adapter.ContactsAdapter

class MainActivity : AppCompatActivity() {
    val REQUEST_READ_CONTACTS = 79
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contacts: RecyclerView = findViewById(R.id.contactList)
        contacts.layoutManager = LinearLayoutManager(this)

        val lang = arrayListOf("Java", "Javascript", "c#", "python", "ruby", "django", "haskell", "html", "go", "mango", "apple")

        contacts.adapter = ContactsAdapter(lang)
    }


}
