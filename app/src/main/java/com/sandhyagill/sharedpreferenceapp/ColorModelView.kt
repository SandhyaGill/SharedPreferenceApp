package com.sandhyagill.sharedpreferenceapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ColorModelView: ViewModel() {
    var color : MutableLiveData<Int> = MutableLiveData()
}