package com.catalyst.grocerystores.data.local.typeconverters

import androidx.room.TypeConverter
import java.math.BigDecimal

class ApplicationTypeConverter {
    @TypeConverter
    fun bigDecimalToString(input: BigDecimal) :String {
        return input.toPlainString()
    }

    @TypeConverter
    fun stringToBigDecimal(input: String) : BigDecimal {
        return input.toBigDecimalOrNull() ?: BigDecimal.valueOf(0.0)
    }
}