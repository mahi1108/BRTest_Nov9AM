package cubex.mahesh.brtest_nov9am

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView

class MyReceiver(var tv1:TextView) : BroadcastReceiver()
{
    override fun onReceive(p0: Context?, p1: Intent?) {
            tv1.text = p1!!.action
    }

}