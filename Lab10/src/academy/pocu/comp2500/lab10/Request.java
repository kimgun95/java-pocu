package academy.pocu.comp2500.lab10;

import academy.pocu.comp2500.lab10.pocuflix.User;

public final class Request {
    private String title;
    private User user;

    public Request(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public User getUser() {
        return user;
    }

    // CacheMiddleware에서 비교를 사용하기 위해 오버라이딩을 통해 수정을 했다.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null
                || !(obj instanceof Request)
                || this.hashCode() != obj.hashCode()) {
            return false;
        }

        Request other = (Request) obj;
        if (user == null && other.user != null) {
            return false;
        }
        if (user != null && other.user == null) {
            return false;
        }
        if (user == null) {
            return title.equals(other.title);
        }

        return title.equals(other.title) && user.equals(other.user);
    }

    @Override
    public int hashCode() {
        if (user == null) {
            return title.hashCode();
        }

        return title.hashCode() ^ (user.hashCode() << 16);
    }
}
