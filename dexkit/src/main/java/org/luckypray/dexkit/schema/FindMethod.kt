// automatically generated by the FlatBuffers compiler, do not modify

package org.luckypray.dexkit.schema

import com.google.flatbuffers.Constants
import com.google.flatbuffers.FlatBufferBuilder
import com.google.flatbuffers.Table
import java.nio.ByteBuffer
import java.nio.ByteOrder

@Suppress("unused")
class FindMethod : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : FindMethod {
        __init(_i, _bb)
        return this
    }
    val uniqueResult : Boolean
        get() {
            val o = __offset(4)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else false
        }
    fun mutateUniqueResult(uniqueResult: Boolean) : Boolean {
        val o = __offset(4)
        return if (o != 0) {
            bb.put(o + bb_pos, (if(uniqueResult) 1 else 0).toByte())
            true
        } else {
            false
        }
    }
    fun inMethods(j: Int) : Int {
        val o = __offset(6)
        return if (o != 0) {
            bb.getInt(__vector(o) + j * 4)
        } else {
            0
        }
    }
    val inMethodsLength : Int
        get() {
            val o = __offset(6); return if (o != 0) __vector_len(o) else 0
        }
    val inMethodsAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(6, 4)
    fun inMethodsInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 6, 4)
    fun mutateInMethods(j: Int, inMethods: Int) : Boolean {
        val o = __offset(6)
        return if (o != 0) {
            bb.putInt(__vector(o) + j * 4, inMethods)
            true
        } else {
            false
        }
    }
    val matcher : MethodMatcher? get() = matcher(MethodMatcher())
    fun matcher(obj: MethodMatcher) : MethodMatcher? {
        val o = __offset(8)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_23_5_26()
        fun getRootAsFindMethod(_bb: ByteBuffer): FindMethod = getRootAsFindMethod(_bb, FindMethod())
        fun getRootAsFindMethod(_bb: ByteBuffer, obj: FindMethod): FindMethod {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createFindMethod(builder: FlatBufferBuilder, uniqueResult: Boolean, inMethodsOffset: Int, matcherOffset: Int) : Int {
            builder.startTable(3)
            addMatcher(builder, matcherOffset)
            addInMethods(builder, inMethodsOffset)
            addUniqueResult(builder, uniqueResult)
            return endFindMethod(builder)
        }
        fun startFindMethod(builder: FlatBufferBuilder) = builder.startTable(3)
        fun addUniqueResult(builder: FlatBufferBuilder, uniqueResult: Boolean) = builder.addBoolean(0, uniqueResult, false)
        fun addInMethods(builder: FlatBufferBuilder, inMethods: Int) = builder.addOffset(1, inMethods, 0)
        fun createInMethodsVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addInt(data[i])
            }
            return builder.endVector()
        }
        fun startInMethodsVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        fun addMatcher(builder: FlatBufferBuilder, matcher: Int) = builder.addOffset(2, matcher, 0)
        fun endFindMethod(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}