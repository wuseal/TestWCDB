package com.example.testwcdb

import com.tencent.wcdb.WCDBField
import com.tencent.wcdb.WCDBTableCoding


@WCDBTableCoding
class Demo {
    @WCDBField(isPrimary = true, isAutoIncrement = true)
    var databaseId:Long = 0L
}