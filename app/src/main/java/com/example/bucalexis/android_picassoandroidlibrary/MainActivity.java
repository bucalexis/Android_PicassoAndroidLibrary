package com.example.bucalexis.android_picassoandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private Movie[] movies = {
            new Movie("Pulp Fiction","http://www.androidtutorialpoint.com/wp-content/uploads/2016/10/pulpfiction.jpg"),
            new Movie("Interstellar","http://www.androidtutorialpoint.com/wp-content/uploads/2016/10/interstellar.jpg"),
            new Movie("Batman v/s Superman","http://www.androidtutorialpoint.com/wp-content/uploads/2016/10/batmanvssuperman.jpg"),
            new Movie("Iron Man","http://www.androidtutorialpoint.com/wp-content/uploads/2016/10/ironman.jpg"),
            new Movie("Inception","http://www.androidtutorialpoint.com/wp-content/uploads/2016/10/inception.jpg"),
            new Movie("Avengers","http://www.androidtutorialpoint.com/wp-content/uploads/2016/10/avengers.jpg"),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView)findViewById(R.id.gridview);
        final MovieAdapter movieAdapter = new MovieAdapter(this, movies);
        gridView.setAdapter(movieAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                Movie movie = movies[position];
                movie.toggleFavorite();

                // This tells the GridView to redraw itself
                // in turn calling your MovieAdapter's getView method again for each cell
                movieAdapter.notifyDataSetChanged();
            }
        });
    }
}