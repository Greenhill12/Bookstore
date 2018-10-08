package CLASS;

    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import javax.swing.JOptionPane;

public class Books {
        
    Connection conn;
    
    private Integer id;
    private String name;
    private String author;
    private Integer year;
    
    public Books(){}
    
    public Books(Integer ID, String NAME, String AUTHOR, Integer YEAR){
        this.id = ID;
        this.name = NAME;
        this.author = AUTHOR;
        this.year = YEAR;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    
    public ArrayList<Books> booksList(){
        
        ArrayList<Books> books_list = new ArrayList<>();
        conn = DB_INFO.getConnection();
        
        ResultSet rs;
        PreparedStatement ps;

               String query = "SELECT `id`, `name`, `author`, `year` FROM `books` ORDER BY timestamp DESC";
        
        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
           
            Books book;          
            while(rs.next()){
                book = new Books(rs.getInt("id"), 
                                 rs.getString("name"),
                                 rs.getString("author"),
                                 rs.getInt("year")
                                 );                
                books_list.add(book);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
        }
        return books_list;        
    }
    
    public static void insertBook(Books book)
    {
        Connection conn = DB_INFO.getConnection();
        PreparedStatement ps;
        Statement st;
        ResultSet rs;
        
        try {
            
            st = conn.createStatement();
            
            String checkName = book.getName();

            rs = st.executeQuery("SELECT `name` FROM `books` WHERE `name`=\""+checkName+"\"");

            if(rs.next()){
                JOptionPane.showMessageDialog(null, "ALERT! Book is already in database!");
            }else{
                ps = conn.prepareStatement("INSERT INTO `books`(`name`, `author`, `year`) VALUES (?,?,?)");

                ps.setString(1, book.getName());
                ps.setString(2, book.getAuthor());
                ps.setInt(3, book.getYear());

                if(ps.executeUpdate() != 0){
                    JOptionPane.showMessageDialog(null, "New Book Added");                
                }else{
                    JOptionPane.showMessageDialog(null, "Something Wrong");                    
                } 
            }
        } catch (SQLException e) {
            Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public static void deleteBook(int bookId)
    {
        
        Connection conn = DB_INFO.getConnection();
        PreparedStatement ps;
        
        try {
            ps = conn.prepareStatement("DELETE FROM `books` WHERE `id` = ?");

            ps.setInt(1, bookId);

            int YesOrNo = JOptionPane.showConfirmDialog(null,"Do You Really Want To Delete This Book","Delete Book", JOptionPane.YES_NO_OPTION);
            if(YesOrNo == 0){
                
                if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Book Deleted");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Something Wrong");
                }
            }  
            
        } catch (SQLException ex) {
            Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }    
    
    public HashMap<String, Integer> populateCombo(){

      HashMap<String, Integer> map = new HashMap<>();

      conn = DB_INFO.getConnection();

      Statement st;

      ResultSet rs;

       try {
           st = conn.createStatement();

           rs = st.executeQuery("SELECT `id`, `name`, `author`, `year` FROM `books` ");

           Books book;

           while(rs.next()){
               book = new Books(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));

               map.put(book.getName(), book.getId());
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
       }   
       
       return map;
   }
}

