package four.zero.gorm

import grails.gorm.transactions.Transactional

class ContainerController {

    def index() {
        def containers = Container.findAll()

        render "Messages: ${containers.collect {it.child.message() }.join(",")}"
    }

    @Transactional
    def saveSub() {
        def child = new SubChild()
        def container = new Container(child: child)
        container.save(flush: true)
        redirect action: 'index'
    }

    @Transactional
    def saveSuper() {
        def child = new SuperChild()
        def container = new Container(child: child)
        container.save(flush: true)
        redirect action: 'index'
    }
}
