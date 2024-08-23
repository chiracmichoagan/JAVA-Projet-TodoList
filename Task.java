public  class Task {

  // Les proprietés de la classe && attribut
    private int id;
    private String title;
    private boolean status;

  // Create a class constructor 
  public Task(int id, String title) {
    this.id = id;
    this.title = title;
    this.status = false;
  }

//Create les methodes Getter

 public int getId() {
    return this.id;
  }

 public String getTitle() {
    return this.title;
  }

 public boolean getStatus() {
    return this.status;
  }


//Create les methodes Setter

  public void setId(int id) {
    this.id = id; }

  public void setTitle(String title) {
    this.title = title; }

  public void setStatus(boolean status) {
    this.status = status; }


}