package jp.techacademy.takao.miyake.taskapp0808

import android.app.Application
import io.realm.Realm

class TaskApp:Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}