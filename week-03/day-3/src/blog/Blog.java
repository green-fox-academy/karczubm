package blog;

import blogPost.BlogPost;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blogposts=new ArrayList<>();
    public void delete(int index){
        blogposts.remove(index);
    }
    public void update(int index, BlogPost post){
        delete(index);
        blogposts.add(index,post);
    }
}
