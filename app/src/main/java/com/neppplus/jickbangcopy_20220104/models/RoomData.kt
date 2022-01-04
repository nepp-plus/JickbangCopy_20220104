package com.neppplus.jickbangcopy_20220104.models

class RoomData(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String, // 파이썬과 같이, 추가로 들어올 파라미터가 없어도 ,로 마무리해도 됨.
) {

    fun getFormattedFloor() : String {

        if (this.floor > 0) {
            return "${ this.floor }층"  // 2층, 3층, 10층..
        }
        else if (this.floor < 0) {
            return "지하 ${-this.floor}층" // 지하 1층
        }
        else {
            return "반지하"
        }

    }

}