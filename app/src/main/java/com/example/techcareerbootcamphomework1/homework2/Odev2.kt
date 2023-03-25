package com.example.techcareerbootcamphomework1.homework2

class Odev2 {

    // convert C to F
    fun convertFahrenheit(celcius : Int) : Double{
        var fahrenheit = (celcius * 1.8) + 32
        return fahrenheit
    }

    // dikdörtgenin çevresi
    fun perimeterOfRectangle(side1:Int,side2:Int){
        var perimeter = 2 * (side1 + side2)
        println("Dikdörtgenin Çevresi : $perimeter")
    }

    //faktoriyel

    fun factorial(number : Int) : Int{
        var result = 1
        if(number >= 0){
            for(i in number downTo  1){
                result *= i
            }
        }
        else{
            return -1
        }

        return result
    }

    // kaç tane a var

    fun numberOfa(word:String){
        var count = 0
        for (i in 0..word.length-1){
            if(word.substring(i,i+1) == "a"){
                count++
            }
        }
        println("number of 'a' in $word : $count")
    }

    // iç açılar toplamı

    fun sumOfAngle(numberOfSide : Int) : Int{
        var angel = (numberOfSide - 2) * 180
        return angel
    }

    // güne göre maaş hesapla

    fun calculateSalary(numberOfDay : Int) : Int{
        var workingHour = numberOfDay * 8
        var salary = 0
        var shift = 0
        if(workingHour <= 160){
            salary = workingHour * 10
        }
        else{
            shift = workingHour - 160;
            salary = (160*10) + (shift*20)
        }
        return salary
    }

    // kotaya göre ücret hesapla

    fun calculatePrice(gb : Int) : Int{
        var price = 0
        var overQuota = 0
        if(gb <= 50){
            price = gb*2
        }
        else{
            overQuota = gb - 50
            price = 100 + (overQuota*4)
        }
        return price
    }
}