package com.lafimsize.androidtestingtutorial1

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TestCalculator2 {

    private lateinit var calc:Calculator

    @Before
    fun setup(){//test başlamadan önce çalıştır. oncreate gibi


        //gerekli tanımlamaları yap vs.
        calc=Calculator()
    }

    @After
    fun tearDown(){//test bittikten sonra çalıştır

        //vt kapat vs.
    }


    @Test
    fun calculateTaxTest(){

        val myTax=calc.calculateTax(500.0,0.9)//in Turkey:))
        assertThat(myTax).isEqualTo(450)
    }

    @Test
    fun calculateIncomeTest(){
        val myIncome=calc.calculateIncome(1000.0,0.9)
        assertThat(myIncome).isEqualTo(100)
    }
}