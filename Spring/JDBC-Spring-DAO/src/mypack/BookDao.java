package mypack;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDao {
private JdbcTemplate jdbcTemplate;		//depenedent object
	
	
 

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

	public int insertRec(Book b)
	{
		String q="insert into book_info values("+b.getBid()+",'"+b.getBname()+"',"+b.getBprice()+" )";
		return jdbcTemplate.update(q);
	}
	
	public int updateRec(Book b)
	{
		String q=
	"update book_info set bname='"+b.getBname() +"',bprice="+b.getBprice()+" where bid="+b.getBid()+" ";
		return jdbcTemplate.update(q);
	}
	
	public int deleteRec(Book b)
	{
		String q="delete from book_info where bid="+b.getBid()+"";
		return jdbcTemplate.update(q);
	}
	
	public void show()
	{
		List<Book>li=new ArrayList<Book>();
		
		
		
		jdbcTemplate.query("select * from book_info",new RowMapper<Object>()
		{

			@Override
			public Object mapRow(ResultSet rs, int rows) throws SQLException {
				Book b=new Book();
				b.setBid(rs.getInt(1));
				b.setBname(rs.getString(2));
				b.setBprice(rs.getInt(3));
				li.add(b);
				return b;
			}
		});
		System.out.println("Book Id\t\t  Book Name\t\t\tPrice\n");
		for(Book b1:li )
		{
			System.out.println(b1);  //toString()
		}
	}

}