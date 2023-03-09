package com.lafimsize.androidtestingtutorial1

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class TestCalculator {



    @Test
    fun calculateTaxTest(){


        val calc=Calculator()
        val myTax=calc.calculateTax(100.0,0.1)

        assertThat(myTax).isEqualTo(10)//vergi 10 çıkmazsa hata ver!
    }

    @Test
    fun calculateIncomeTest(){

        val calc=Calculator()
        val myIncome=calc.calculateIncome(200.0,0.2)

        assertThat(myIncome).isEqualTo(160)//gelirim 160 değilse hata ver!
    }



}