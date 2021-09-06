package LinkedLIst

class LinkedList<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        return if (isEmpty()) {
            "Empty list"
        } else {
            head.toString()
        }
    }

    // push Node

    fun push(value: T) {
        head= Node(value = value, next = head)
        if (tail == null) {
            tail = head
        }
        size++
    }


}