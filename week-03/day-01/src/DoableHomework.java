import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoableHomework {
  public static void main(String[] args) {
    List<Map<String, String>> treeList = new ArrayList<>();

    Map<String, String> oldOak = new HashMap<>();
    oldOak.put("type", "Oak");
    oldOak.put("leaf color", "green");
    oldOak.put("age", "100");
    oldOak.put("sex", "M");
    treeList.add(oldOak);

    Map<String, String> mammutPine = new HashMap<>();
    mammutPine.put("type", "Giant redwood");
    mammutPine.put("leaf color", "green");
    mammutPine.put("age", "300");
    mammutPine.put("sex", "M");
    treeList.add(mammutPine);

    Map<String, String> cherryTree = new HashMap<>();
    cherryTree.put("type", "Cherry tree");
    cherryTree.put("leaf color", "green");
    cherryTree.put("age", "10");
    cherryTree.put("sex", "F");
    treeList.add(cherryTree);

    Map<String, String> appleTree = new HashMap<>();
    appleTree.put("type", "Apple tree");
    appleTree.put("leaf color", "green");
    appleTree.put("age", "24");
    appleTree.put("sex", "F");
    treeList.add(appleTree);

    Map<String, String> peachTree = new HashMap<>();
    peachTree.put("type", "Peach tree");
    peachTree.put("leaf color", "green");
    peachTree.put("age", "8");
    peachTree.put("sex", "F");
    treeList.add(peachTree);

  }
}
