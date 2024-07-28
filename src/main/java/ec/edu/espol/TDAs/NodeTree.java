
package ec.edu.espol.TDAs;

import java.util.LinkedList;

public class NodeTree<E> {
    private E content; 
    // private LinkedList<NodeTree<E>> children; // sus hijos, sin embargo no aplicaremos este metodo en este curso (no es el mejor approach)
    private LinkedList<Tree<E>> children;

    public NodeTree(E content) {
        this.content = content;
        this.children = new LinkedList<>(); // no esta en null, solo esta vacia ya que es una LinkedList
    }

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }

    public LinkedList<Tree<E>> getChildren() {
        return children;
    }

    public void setChildren(LinkedList<Tree<E>> children) {
        this.children = children;
    }
   
}
