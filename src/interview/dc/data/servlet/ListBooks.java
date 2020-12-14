package interview.dc.data.servlet;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import interview.dc.data.misc.DataAccessFactory;
import interview.dc.data.resources.Book;

public class ListBooks extends HttpServlet {
	
	public void init() throws ServletException {
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Book> books = (List<Book>) DataAccessFactory.getDataAccessObject("BOOKS");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Books");
		out.println("<table>");
		Iterator itr = books.iterator();
		while(itr.hasNext()) {
			Book book = (Book) itr.next();
			out.println("<TR>");
			out.println("<TD>");
			out.println(book.name);
			out.println("<TD>");
			out.println("<TD>");
			out.println(book.yearPublished);
			out.println("<TD>");
			out.println("<TD>");
			out.println(book.getPrice());
			out.println("<TD>");
			out.println("</TR>");
		}
		out.println("</table>");
	}
	
	public void destroy() {
		
	}

}
