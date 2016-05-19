package app.mock;


import app.entities.entityActivity.Tag;
import app.entities.post.Post;

import java.sql.Date;
import java.util.*;

/**
 * Created by click on 5/16/2016.
 */
public class PostService implements app.services.PostService{
    String[] p = {"Незабутня подорож карпатами",
                "Чому велика вода стирає пам'ять",
                "С высоты птичьего полета",
                "Путями Геродота или нетронутая история"};
    String[] author = {"qwe@gmail.com",
            "kokoko@gmail.com",
            "milin@gmail.com",
            "hululu@gmail.com"};
    static String[] tags = {"Гори", "Яхтинг", "Парашют", "Історія"};
    String smallText = "Food is my passion. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
    Map<Integer, Integer> ids;
    int[] i = {32542, 24534, 45334, 25443};

    public PostService() {
        ids = new HashMap<>();
        for (int j = 0; j < i.length; j++){
            ids.put(i[j], j);
        }
    }

    @Override
    public List<Post> getPostsList() {
        List<Post> posts = new ArrayList<>();
        for(int i = 0; i < p.length; i++){
            List tag = new ArrayList<>();
            tag.add(tags[i]);
            Object[] id = ids.values().toArray();
            posts.add(new Post((int)(this.i[i]), p[i], author[i], (new Random()).nextInt(60), new Date(12), tag, smallText));
        }
        return posts;
    }

    @Override
    public Post getPostById(int id) {
        int i = ids.get(id);
        List tag = new ArrayList<>();
        tag.add(tags[i]);
        return new Post(id, p[i], author[i], (new Random()).nextInt(60), new Date(12), tag, smallText);
    }

    public static List<Tag> getTags() {
        List<Tag> t = new ArrayList<>();
        for (int i = 0; i < tags.length; i++){
            Tag tag = new Tag(i, tags[i], (new Random()).nextInt(20));
            t.add(tag);
        }
        return t;
    }

    public List<Post> getPostByTag(int tag){
        Map<String, Integer> tagsMap = new HashMap<>();
        for(int i = 0; i < tags.length; i++){
            tagsMap.put(tags[i], i);
        }

        List<Post> posts = new ArrayList<>();
        posts.add(getPostById(this.i[tag]));
        return posts;
    }
}
