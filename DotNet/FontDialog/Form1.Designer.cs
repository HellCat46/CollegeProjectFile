namespace FontDialog
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.text = new System.Windows.Forms.Label();
            this.chngfont = new System.Windows.Forms.Button();
            this.fontDialog = new System.Windows.Forms.FontDialog();
            this.SuspendLayout();
            // 
            // text
            // 
            this.text.Location = new System.Drawing.Point(-1, -2);
            this.text.Name = "text";
            this.text.Size = new System.Drawing.Size(800, 159);
            this.text.TabIndex = 0;
            this.text.Text = "Example Text to show select font";
            this.text.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // chngfont
            // 
            this.chngfont.Location = new System.Drawing.Point(356, 305);
            this.chngfont.Name = "chngfont";
            this.chngfont.Size = new System.Drawing.Size(88, 23);
            this.chngfont.TabIndex = 1;
            this.chngfont.Text = "Change Font";
            this.chngfont.UseVisualStyleBackColor = true;
            this.chngfont.Click += new System.EventHandler(this.chngfont_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.chngfont);
            this.Controls.Add(this.text);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Label text;
        private System.Windows.Forms.Button chngfont;
        private System.Windows.Forms.FontDialog fontDialog;
    }
}

