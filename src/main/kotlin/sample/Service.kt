package sample

import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project

interface SampleNotificationService {

    fun balloon(project: Project, text: String)

    companion object {
        val instance: SampleNotificationService
            get() = service()
    }
}

class NotificationServiceImpl : SampleNotificationService {

    override fun balloon(project: Project, text: String) {
        val notificationService = "Sample Notification Service"
        val notification = Notification(notificationService, notificationService, text, NotificationType.INFORMATION)
        notification.notify(project)
    }

}