using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace isOdd
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void submit_Click(object sender, EventArgs e)
        {
            if (Int32.Parse(textbox.Text) % 2 != 0)
                MessageBox.Show("Given number is Odd.");
            else
                MessageBox.Show("Given number is not Odd.");
        }
    }
}
