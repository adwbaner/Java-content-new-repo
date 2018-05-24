import com.cg.servlets.day2.bean.Bank;

@WebServlet("*.obj")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	Bank bank = new Bank();
 
	String target = null;
	IBankService bservice=new BankServiceImpl();
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		doPost(request, response);
	}
 
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		String bname,bstate;
		String path=request.getServletPath();
		System.out.println("Servlet path is "+path);
 
		switch (path) {
		case "/add.obj":
 
			target="addbank.html";
			break;
 
		case "/details.obj"://Absolute path 
 
			//target="Success.html";
 
			bname=request.getParameter("bname");
			System.out.println(bname);
			int bcode=Integer.parseInt(request.getParameter("bcode"));
			System.out.println(bcode);
			bstate=request.getParameter("bstate");
			System.out.println(bstate);
			bank.setBankName(bname);
			bank.setBankCode(bcode);
			bank.setBankState(bstate);
			bservice.addDetails(bank);
			System.out.println(bank);
 
 
			target="Success.html";
 
 
			break;
 
		case "/retrieve.obj":
 
 
 
			target="Getdetails.html";
			break;
 
		case "/show.obj":
 
			System.out.println(request.getParameter("ifsc"));
			int id=Integer.parseInt(request.getParameter("ifsc"));
			BankDetails bank2=bservice.getDetails(id);
			System.out.println(bank2.getBankName());
			System.out.println(bank2.getBankState());
 
 
			target="Success2.html";
 
			break;
 
 
		}
		RequestDispatcher disp=request.getRequestDispatcher(target);
		disp.forward(request, response);
	}
 
 
 
 
 
}
 