package com.example.logintabdemo
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SignupFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstances: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.layout_signup, container, false
        )
    }
}