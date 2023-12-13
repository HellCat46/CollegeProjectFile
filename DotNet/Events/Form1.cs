using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Events
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_MouseMove(object sender, MouseEventArgs e)
        {
            lbl.Text = "The Mouse just moved inside the Window";
        }

        private void btnclick_Click(object sender, EventArgs e)
        {
            MessageBox.Show("You just generated a Click event.");
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            lbl.Text = "Windows has been loaded";
        }
    }
}
