package My_Little_Teamy.My_Little_Cinemy.compositeKeys;

import My_Little_Teamy.My_Little_Cinemy.domain.Film;
import My_Little_Teamy.My_Little_Cinemy.domain.Genre;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
public class FilmGenreId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;
}