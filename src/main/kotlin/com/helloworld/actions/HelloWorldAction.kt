package com.helloworld.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class HelloWorldAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        println("Hello world from ${event.project}!")
    }
}