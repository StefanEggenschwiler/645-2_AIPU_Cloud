package ch.hevs.aipu;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class _45_2_AIPU_CloudServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
