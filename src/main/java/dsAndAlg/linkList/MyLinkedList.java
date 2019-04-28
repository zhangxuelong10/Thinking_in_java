package dsAndAlg.linkList;

public class MyLinkedList {
    // 链表头的引用
    Node head = null;

    /**
     * 向链表中插入数据
     */
    public void addNode(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        // 把节点添加到尾部
        tmp.next = newNode;
    }

    /**
     * 删除第index个结点
     */
    public Boolean deleteNode(int index) {
        // 3假定是链表的长度
        if (index < 1 || index > 3) {
            return false;
        }
        // 删除链表的第一个元素
        if (index == 1) {

        }
        return true;
    }
}
