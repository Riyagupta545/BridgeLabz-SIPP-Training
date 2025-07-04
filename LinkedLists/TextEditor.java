package LinkedLists;
class State {
    String text;
    State prev, next;

    State(String text) {
        this.text = text;
    }
}

public class TextEditor {
    State current;
    int size = 0, limit = 10;

    void type(String newText) {
        State newState = new State(newText);
        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }
        current = newState;
        size++;
        if (size > limit) {
            State temp = current;
            while (temp.prev.prev != null) temp = temp.prev;
            temp.prev = null;
            size--;
        }
    }

    void undo() {
        if (current != null && current.prev != null) current = current.prev;
    }

    void redo() {
        if (current != null && current.next != null) current = current.next;
    }

    void show() {
        if (current != null) System.out.println("Current: " + current.text);
        else System.out.println("Editor is empty.");
    }

    public static void main(String[] args) {
        TextEditor te = new TextEditor();
        te.type("Hello");
        te.type("Hello World");
        te.type("Hello Java");
        te.show();      // Hello Java
        te.undo();
        te.show();      // Hello World
        te.undo();
        te.show();      // Hello
        te.redo();
        te.show();      // Hello World
    }
}

