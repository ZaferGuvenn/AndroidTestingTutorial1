package com.lafimsize.androidtestingtutorial1

class Calculator {


    fun calculateTax(grossIncome:Double,taxRate:Double):Double{

        return grossIncome*taxRate

    }


    fun calculateIncome(grossIncome: Double,taxRate: Double):Double{

        return grossIncome-(grossIncome*taxRate)

    }


}