package sample

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class SampleAction : AnAction() {

    init {
        templatePresentation.text = "Sample Action"
        templatePresentation.description = "Show the Balloon"
    }

    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return
        SampleNotificationService.instance.balloon(project, "Hi from SampleAction!")
    }

}