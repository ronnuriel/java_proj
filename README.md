This is a simplified representation of a Theatre Management System, consisting of three main classes: Theatre, Movie, and Show.

The Theatre Management System has the following attributes and methods:

**Theatre Management System**
- Attributes:
    - theaters: List of Theatre objects
    - movies: List of Movie objects
    - shows: List of Show objects

- Methods:
    - addTheater(theater: Theater): Adds a new Theatre object to the system.
    - removeTheater(theater: Theater): Removes a Theatre object from the system.
    - addMovie(movie: Movie): Adds a new Movie object to the system.
    - removeMovie(movie: Movie): Removes a Movie object from the system.
    - addShow(show: Show): Adds a new Show object to the system.
    - removeShow(show: Show): Removes a Show object from the system.
    - getTheaters(): Returns a list of all Theatre objects in the system.
    - getMovies(): Returns a list of all Movie objects in the system.
    - getShows(): Returns a list of all Show objects in the system.

**Theatre**
- Attributes:
    - theaterId: Unique identifier for the theatre.
    - name: Name of the theatre.
    - location: Location of the theatre.
    - capacity: Maximum capacity of the theatre.
    - shows: List of Show objects associated with the theatre.

- Methods:
    - Theater(theaterId: int, name: String, location: String, capacity: int): Constructor to initialize the Theatre object.
    - getTheaterId(): Returns the theaterId of the theatre.
    - getName(): Returns the name of the theatre.
    - setName(name: String): Sets the name of the theatre.
    - getLocation(): Returns the location of the theatre.
    - setLocation(location: String): Sets the location of the theatre.
    - getCapacity(): Returns the capacity of the theatre.
    - setCapacity(capacity: int): Sets the capacity of the theatre.
    - addShow(show: Show): Adds a Show object to the list of shows associated with the theatre.
    - removeShow(show: Show): Removes a Show object from the list of shows associated with the theatre.
    - getShows(): Returns a list of Show objects associated with the theatre.

**Movie**
- Attributes:
    - movieId: Unique identifier for the movie.
    - title: Title of the movie.
    - duration: Duration of the movie in minutes.
    - genre: Genre of the movie.
    - shows: List of Show objects associated with the movie.

- Methods:
    - Movie(movieId: int, title: String, duration: int, genre: String): Constructor to initialize the Movie object.
    - getMovieId(): Returns the movieId of the movie.
    - getTitle(): Returns the title of the movie.
    - setTitle(title: String): Sets the title of the movie.
    - getDuration(): Returns the duration of the movie.
    - setDuration(duration: int): Sets the duration of the movie.
    - getGenre(): Returns the genre of the movie.
    - setGenre(genre: String): Sets the genre of the movie.
    - addShow(show: Show): Adds a Show object to the list of shows associated with the movie.
    - removeShow(show: Show): Removes a Show object from the list of shows associated with the movie.
    - getShows(): Returns a list of Show objects associated with the movie.

**Show**
- Attributes:
    - showId: Unique identifier for the show.
    - movie: Movie object associated with the show.
    - theater: Theatre object associated with the show.
    - showTime: Date and time of the show.
    - available