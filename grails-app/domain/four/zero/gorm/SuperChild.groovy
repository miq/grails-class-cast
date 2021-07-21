package four.zero.gorm

class SuperChild {

    static mapping = {
        tablePerHierarchy false
    }

    def message() {
        return "I am super"
    }
}
