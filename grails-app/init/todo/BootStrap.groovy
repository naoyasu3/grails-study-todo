package todo

class BootStrap {

    def init = { servletContext ->
        environments {
            development {
                new Todo(content: "山田さんに電話").save()
                new Todo(content: "ゴミ袋を買う").save()
                new Todo(content: "猫に餌をやる").save()
            }
        }
    }
    def destroy = {
    }
}
