package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

public class App {
    public App(Registry registry) {
        // Register like this
        registry.registerBlogCreator("User");
        registry.registerTagFilterSetter("Blog", "setTag");
        registry.registerAuthorFilterSetter("Blog", "setAuthor");
        registry.registerPostOrderSetter("Blog", "setPostOrder");
        registry.registerPostListGetter("Blog", "getPostList");
        registry.registerPostAdder("Blog", "addPost");
        registry.registerPostTitleUpdater("Blog", "updatePostTitle");
        registry.registerPostBodyUpdater("Blog", "updatePostBody");
        registry.registerPostTagAdder("Post", "addPostTag");
        registry.registerCommentAdder("Post", "addComment");
        registry.registerSubcommentAdder("Comment", "addSubcomment");
        registry.registerCommentUpdater("Comment", "updateComment");
        registry.registerSubcommentUpdater("Comment", "updateComment");
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
