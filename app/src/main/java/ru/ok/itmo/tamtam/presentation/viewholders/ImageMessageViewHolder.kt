package ru.ok.itmo.tamtam.presentation.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.ok.itmo.tamtam.R
import ru.ok.itmo.tamtam.domain.Message

class ImageMessageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val username = view.findViewById<TextView>(R.id.username)
    private val messageBody = view.findViewById<ImageView>(R.id.message_body)

    fun bind(message: Message) {
        username.text = message.user
        messageBody.setImageBitmap(message.data.Image?.bitmap)
    }
}