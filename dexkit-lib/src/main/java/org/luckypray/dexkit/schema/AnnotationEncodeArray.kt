// automatically generated by the FlatBuffers compiler, do not modify

package org.luckypray.dexkit.schema

import com.google.flatbuffers.BaseVector
import com.google.flatbuffers.BooleanVector
import com.google.flatbuffers.ByteVector
import com.google.flatbuffers.Constants
import com.google.flatbuffers.DoubleVector
import com.google.flatbuffers.FlatBufferBuilder
import com.google.flatbuffers.FloatVector
import com.google.flatbuffers.LongVector
import com.google.flatbuffers.StringVector
import com.google.flatbuffers.Struct
import com.google.flatbuffers.Table
import com.google.flatbuffers.UnionVector
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.math.sign

@Suppress("unused")
class AnnotationEncodeArray : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : AnnotationEncodeArray {
        __init(_i, _bb)
        return this
    }
    fun values(j: Int) : AnnotationEncodeValueMeta? = values(AnnotationEncodeValueMeta(), j)
    fun values(obj: AnnotationEncodeValueMeta, j: Int) : AnnotationEncodeValueMeta? {
        val o = __offset(4)
        return if (o != 0) {
            obj.__assign(__indirect(__vector(o) + j * 4), bb)
        } else {
            null
        }
    }
    val valuesLength : Int
        get() {
            val o = __offset(4); return if (o != 0) __vector_len(o) else 0
        }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_23_5_26()
        fun getRootAsAnnotationEncodeArray(_bb: ByteBuffer): AnnotationEncodeArray = getRootAsAnnotationEncodeArray(_bb, AnnotationEncodeArray())
        fun getRootAsAnnotationEncodeArray(_bb: ByteBuffer, obj: AnnotationEncodeArray): AnnotationEncodeArray {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createAnnotationEncodeArray(builder: FlatBufferBuilder, valuesOffset: Int) : Int {
            builder.startTable(1)
            addValues(builder, valuesOffset)
            return endAnnotationEncodeArray(builder)
        }
        fun startAnnotationEncodeArray(builder: FlatBufferBuilder) = builder.startTable(1)
        fun addValues(builder: FlatBufferBuilder, values: Int) = builder.addOffset(0, values, 0)
        fun createValuesVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addOffset(data[i])
            }
            return builder.endVector()
        }
        fun startValuesVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        fun endAnnotationEncodeArray(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}