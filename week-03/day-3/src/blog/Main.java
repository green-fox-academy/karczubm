package blog;

import blogPost.BlogPost;

public class Main {
    public static void main(String[] args) {
        Blog blog=new Blog();
        blog.blogposts.add(new BlogPost("John Doe","Lorem ipsum","Lorem ipsum dolor sitamet","2000.05.04."));
        blog.blogposts.add(new BlogPost("John Doe","Lorem ipsum","Lorem ipsum dolor sitamet","2000.05.04."));
        blog.blogposts.add(new BlogPost("John Doe","Lorem ipsum","Lorem ipsum dolor sitamet","2000.05.04."));
        blog.blogposts.add(new BlogPost("JJohn Doe","Lorem ipsum","Lorem ipsum dolor sitamet","2000.05.04."));
        blog.blogposts.add(new BlogPost("JJJohn Doe","Lorem ipsum","Lorem ipsum dolor sitamet","2000.05.04."));
        blog.delete(2);
        blog.update(0,new BlogPost("1","2","3","4"));
    }
}
