package four.zero.gorm

class SubChild extends SuperChild {

    static mapping = {
        tablePerHierarchy false
    }

    def message() {
        return "I am sub"
    }
}
