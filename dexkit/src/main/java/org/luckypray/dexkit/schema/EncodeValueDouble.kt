// automatically generated by the FlatBuffers compiler, do not modify

package org.luckypray.dexkit.schema

import com.google.flatbuffers.Constants
import com.google.flatbuffers.FlatBufferBuilder
import com.google.flatbuffers.Table
import java.nio.ByteBuffer
import java.nio.ByteOrder

@Suppress("unused")
class EncodeValueDouble : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : EncodeValueDouble {
        __init(_i, _bb)
        return this
    }
    val value : Double
        get() {
            val o = __offset(4)
            return if(o != 0) bb.getDouble(o + bb_pos) else 0.0
        }
    fun mutateValue(value: Double) : Boolean {
        val o = __offset(4)
        return if (o != 0) {
            bb.putDouble(o + bb_pos, value)
            true
        } else {
            false
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_23_5_26()
        fun getRootAsEncodeValueDouble(_bb: ByteBuffer): EncodeValueDouble = getRootAsEncodeValueDouble(_bb, EncodeValueDouble())
        fun getRootAsEncodeValueDouble(_bb: ByteBuffer, obj: EncodeValueDouble): EncodeValueDouble {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createEncodeValueDouble(builder: FlatBufferBuilder, value: Double) : Int {
            builder.startTable(1)
            addValue(builder, value)
            return endEncodeValueDouble(builder)
        }
        fun startEncodeValueDouble(builder: FlatBufferBuilder) = builder.startTable(1)
        fun addValue(builder: FlatBufferBuilder, value: Double) = builder.addDouble(0, value, 0.0)
        fun endEncodeValueDouble(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}