package by.htp.library.bean;

public class Book {
	private int id;
	private String title;
	private String avtor;
	private String cover;
	private String countpage;

	public Book() {

	}

	public Book(int id, String avtor, String title, String cover, String countpage) {
		super();
		this.id = id;
		this.avtor = avtor;
		this.title = title;
		this.cover = cover;
		this.countpage = countpage;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAvtor() {
		return avtor;
	}

	public void setAvtor(String avtor) {
		this.avtor = avtor;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getCountpage() {
		return countpage;
	}

	public void setCountpage(String countpage) {
		this.countpage = countpage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((avtor == null) ? 0 : avtor.hashCode());
		result = prime * result + ((countpage == null) ? 0 : countpage.hashCode());
		result = prime * result + ((cover == null) ? 0 : cover.hashCode());
		result = prime * result + id;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (avtor == null) {
			if (other.avtor != null)
				return false;
		} else if (!avtor.equals(other.avtor))
			return false;
		if (countpage == null) {
			if (other.countpage != null)
				return false;
		} else if (!countpage.equals(other.countpage))
			return false;
		if (cover == null) {
			if (other.cover != null)
				return false;
		} else if (!cover.equals(other.cover))
			return false;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", avtor=" + avtor + ", cover=" + cover + ", countpage="
				+ countpage + "]";
	}

}
