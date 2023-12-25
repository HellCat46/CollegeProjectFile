using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace File_work
{
    public partial class GridView1 : System.Web.UI.Page
    {
        SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["conn"].ToString());
        protected void Page_Load(object sender, EventArgs e)
        {
            displayGrid();
        }

        void displayGrid()
        {
            try
            {
                string query = "select * from BookInfo";
                con.Open();
                DataTable dt = new DataTable();
                SqlDataAdapter adapter = new SqlDataAdapter(query,con);
                adapter.Fill(dt);
                gvBooks.DataSource = dt;
                gvBooks.DataBind();
            }
            catch { }
        }
    }
}