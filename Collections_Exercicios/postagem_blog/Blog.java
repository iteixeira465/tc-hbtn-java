import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {

    private List<Post> listaPostagem = new ArrayList<>();

    public void adicionarPostagem(Post post) throws Exception {
        for (Post posts : listaPostagem) {
            if (posts.getAutor().equals(post.getAutor()) && posts.getTitulo().equals(post.getTitulo())) {
                throw new Exception("Postagem jah existente");
            }
        }

        this.listaPostagem.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();

        for(Post p : listaPostagem){
            autores.add(p.getAutor());
        }

        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias,Integer> mapaContagem = new TreeMap<>();

        for (Post post : listaPostagem) {
            if (mapaContagem.containsKey(post.getCategoria())) {
                mapaContagem.put(post.getCategoria(),mapaContagem.get(post.getCategoria())+1);
            }else {
                mapaContagem.put(post.getCategoria(), 1);
            }
        }

        return mapaContagem;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> postsCategoria = new TreeSet<>();
        for(Post p : listaPostagem){
            if(p.getCategoria().equals(categoria)){
                postsCategoria.add(p);
            }
        }
        return postsCategoria;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> posts = new TreeSet<>();

        for (Post post : listaPostagem) {
            if (post.getAutor().getNome().equals(autor.getNome()) && post.getAutor().getSobrenome().equals(autor.getSobrenome())) {
                posts.add(post);
            }
        }

        return posts;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> todos = new TreeMap<>();
        Set<Post> posts;

        for (Categorias categoria : Categorias.values()) {
            posts = new TreeSet<>();
            for (Post post : listaPostagem ) {
                if(post.getCategoria().equals(categoria)){
                    posts.add(post);
                }
            }
            todos.put(categoria, posts);
        }

        return todos;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> todosPorAutor = new TreeMap<>();
        Set<Post> posts;

        for (Autor autor : obterTodosAutores()) {
            posts = new TreeSet<>();
            for (Post post: listaPostagem) {
                if(post.getAutor().equals(autor)){
                    posts.add(post);
                }
            }
            todosPorAutor.put(autor, posts);
        }

        return todosPorAutor;
    }
}