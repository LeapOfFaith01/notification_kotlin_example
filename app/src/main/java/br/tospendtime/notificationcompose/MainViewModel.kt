package br.tospendtime.notificationcompose

import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val notificationBuilder: NotificationCompat.Builder,
    private val notificationManager: NotificationManagerCompat
): ViewModel(){
    fun showSimpleNotification(){
        notificationManager.notify(1, notificationBuilder.build())
    }

    fun updateSimpleNotification(){
        notificationManager.notify(1, notificationBuilder.setContentText("Essa notificação foi atualizada").build())
    }

    fun cancelSimpleNotification(){
        notificationManager.cancel(1)
    }
}