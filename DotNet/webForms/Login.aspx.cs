using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace File_work
{
    public partial class Login : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnSubmit_Click(object sender, EventArgs e)
        {
            string email = "user@gmail";
            string password = "test";
            
            if(txtEmail.Text == email && txtPass.Text == password)
            {
                Response.Write("<script>alert('logged in succesfully')</script>");
            }
            else 
            {
                Response.Write("<script>alert('email or password is incorrect')</script>");
            }
        }
    }
}