import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import fourthweb.Post;
import java.util.ArrayList;
/**
 * Servlet implementation class AverageLookup
 */
@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//accepts parameters from client
		String ID = request.getParameter("id");
		long id = Long.parseLong(ID);
		String posttime = request.getParameter("posttime");
		String postcontent = request.getParameter("postcontent");
	    String table="";
		
		Post post = new Post();
		System.out.println(id+"  "+postcontent+" "+posttime);
		
		//post.setId(id);
		post.setId(id);
		post.setPostcontent(postcontent);
		
		try {
			post.setPosttime( new SimpleDateFormat(  
                "MM-dd-yyyy").parse(posttime));
		} catch (Exception e ) {
			post.setPosttime( null);
		}
		//userjpa.setUserid(uid++);	
		UserDB.insert(post);

		
		
		
		ArrayList<Post> lists = new ArrayList<Post>(UserDB.selectUnprocessedInvoices());
		if(lists == null || lists.size() == 0){
			table += "<h1>nonono</h1>";
		}else{
			table += "<div class=\"container\">" + "<h2>Result</h2>" + "<table class=\"table table-condensed\">"
				    + "<thead>" + "<tr>" + "<th>User Name</th>" + "<th>Post</th>" + "<th>Post Date</th></tr>"
				    +   "</thead>" + "<tbody>";	    
			for(Post u : lists){
				table += "<tr>";
				table += "<td>" + u.getId() + "</td>";
				table += "<td>" + u.getPostcontent() + "</td>";
				table += "<td>" + u.getPosttime() + "</td>";
				table += "</tr>";
			}
			table += "</tbody>" + "</table>" + "</div>";
			table += "<br/><br/>";
		}
		request.setAttribute("table", table); 

		
		
		
		
		
		
			//actual logic goes here
			request.setAttribute("table", table);
			
			getServletContext().getRequestDispatcher("/print.jsp").forward(request, response);
		}
	}

