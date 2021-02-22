package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

public class App {
    public App(Registry registry) {
        // Register like this
        registry.registerBlogCreator("Blog");
        registry.registerTagFilterSetter("Blog", "setTagFilter");
        registry.registerAuthorFilterSetter("Blog", "setAuthorFilter");
        registry.registerPostOrderSetter("Blog", "setPostOrder");
        registry.registerPostListGetter("Blog", "getPostList");
        registry.registerPostAdder("Blog", "addPost");

        registry.registerPostTitleUpdater("Post", "setTitle");
        registry.registerPostBodyUpdater("Post", "setBody");
        registry.registerPostTagAdder("Post", "addTag");
        registry.registerCommentAdder("Post", "addComment");
        registry.registerCommentListGetter("Post", "getComments");
        registry.registerReactionAdder("Post", "addReaction");
        registry.registerReactionRemover("Post", "removeReaction");

        registry.registerCommentUpdater("Comment", "setContent");
        registry.registerSubcommentAdder("Comment", "addSubcomment");
        registry.registerSubcommentListGetter("Comment", "getSubcomments");
        registry.registerCommentUpvoter("Comment", "addUpVoter");
        registry.registerCommentDownvoter("Comment", "addDownVoter");
        registry.registerSubcommentUpdater("Comment", "setContent");
        registry.registerSubcommentUpvoter("Comment", "addUpVoter");
        registry.registerSubcommentDownvoter("Comment", "addDownVoter");
    }
}
