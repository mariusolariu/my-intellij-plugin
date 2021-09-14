package com.github.mariusolariu.myintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.mariusolariu.myintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
