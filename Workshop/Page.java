package Workshop;
// Doubly linked list node
class Page {
    String url;
    Page prev, next;

    Page(String url) {
        this.url = url;
    }
}

class BrowserHistory {
    private Page current;

    // Navigate to new page
    public void visit(String url) {
        Page newPage = new Page(url);
        if (current != null) {
            current.next = newPage;
            newPage.prev = current;
        }
        current = newPage;
        System.out.println("Visited: " + url);
    }

    // Move back in history
    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Moved back to: " + current.url);
        } else {
            System.out.println("No previous page.");
        }
    }

    // Move forward in history
    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Moved forward to: " + current.url);
        } else {
            System.out.println("No next page.");
        }
    }

    // Current page
    public void currentPage() {
        if (current != null)
            System.out.println("Current Page: " + current.url);
        else
            System.out.println("No page visited.");
    }

    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();
        history.visit("google.com");
        history.visit("openai.com");
        history.visit("github.com");
        history.back();
        history.back();
        history.forward();
        history.currentPage();
    }
}
