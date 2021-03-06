package jp.techacademy.takao.miyake.taskapp0808

import java.io.Serializable
import java.util.Date
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Task : RealmObject(), Serializable {
   // var category: String = ""   //カテゴリ
    var title: String = ""      // タイトル
    var contents: String = ""   // 内容
    var date: Date = Date()     // 日時

    // id をプライマリーキーとして設定
    @PrimaryKey
    var id: Int = 0
}