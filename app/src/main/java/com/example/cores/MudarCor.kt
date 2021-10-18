package com.example.cores

import kotlin.random.Random

class MudarCor {
    private var rgb: MutableSet<Int>


    constructor(){
        this.rgb = mutableSetOf()
        this.setRgb()
    }

    private fun setRgb (){
        while(rgb.size <3){
            rgb.add(Random.nextInt(0, 255))
        }
    }


    public fun getColor(): MutableSet<Int> {
        return this.rgb
    }
}