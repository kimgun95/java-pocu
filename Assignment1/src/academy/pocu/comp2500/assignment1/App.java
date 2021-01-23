package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

public class App {
    public App(Registry registry) {
        // Register like this
        registry.registerBlogCreator("User");
        registry.registerTagFilterSetter("User", "setTag");
        registry.registerAuthorFilterSetter("User", "setAuthor");
        registry.registerPostOrderSetter("User", "setPostOrder");
        registry.registerPostListGetter("User", "getPostList");
        registry.registerPostAdder("User", "addPost");
        registry.registerPostTitleUpdater("User", "updatePostTitle");
        registry.registerPostBodyUpdater("User", "updatePostBody");
        registry.registerPostTagAdder("User", "addPostTag");
        registry.registerCommentAdder("User", "addComment");
        registry.registerSubcommentAdder("User", "addSubcomment");
        registry.registerCommentUpdater("User", "updateComment");
        registry.registerSubcommentUpdater("User", "updateComment");
        registry.registerReactionAdder("User", "addReaction");
        registry.registerReactionRemover("User", "removeReaction");
        registry.registerCommentUpvoter("User", "commentUpvoter");
        registry.registerCommentDownvoter("User", "commentDownvoter");
        registry.registerCommentListGetter("User", "getCommentList");
        registry.registerSubcommentListGetter("User", "getSubCommentList");
        registry.registerSubcommentUpvoter("User", "subCommentUpvoter");
        registry.registerSubcommentDownvoter("User", "subCommentDownvoter");
    }
}
