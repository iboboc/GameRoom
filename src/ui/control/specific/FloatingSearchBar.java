package ui.control.specific;

import javafx.beans.value.ChangeListener;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import ui.control.button.ImageButton;

/**
 * Created by LM on 10/02/2017.
 */
public class FloatingSearchBar extends HBox {
    private SearchBar searchBar;
    private ImageButton closeButton;

    public FloatingSearchBar(ChangeListener<String> changeListener){
        searchBar = new SearchBar(changeListener);

        closeButton = new ImageButton("toaddtile-ignore-button", searchBar.getImgSize()/2, searchBar.getImgSize()/2);
        closeButton.setFocusTraversable(false);
        closeButton.setOnAction(event -> {
            hide();
            clearSearchField();
        });

        getChildren().addAll(searchBar,closeButton);

        setId("search-bar");
        setAlignment(Pos.BASELINE_CENTER);
        setFocusTraversable(false);
        setPickOnBounds(false);
    }

    public void clearSearchField() {
        searchBar.clearSearchField();
    }

    public TextField getSearchField() {
        return searchBar.getSearchField();
    }

    public void show(){
        setVisible(true);
        setMouseTransparent(false);
    }

    public void hide(){
        setVisible(false);
        setMouseTransparent(true);
    }
}