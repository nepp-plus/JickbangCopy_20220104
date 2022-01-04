package com.neppplus.jickbangcopy_20220104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20220104.models.RoomData
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("room") as RoomData  // Serializable 첨부된것을 -> RoomData 원복

        txtPrice.text = roomData.getFormattedPrice()
        txtDescription.text = roomData.description

        txtAddress.text = roomData.address
        txtFloor.text = roomData.getFormattedFloor()


    }
}