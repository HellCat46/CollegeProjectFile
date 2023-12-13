namespace Events
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
            this.btnclick = new System.Windows.Forms.Button();
            this.text = new System.Windows.Forms.Label();
            this.lbl = new System.Windows.Forms.Label();
            this.lblload = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // btnclick
            // 
            this.btnclick.Location = new System.Drawing.Point(351, 286);
            this.btnclick.Name = "btnclick";
            this.btnclick.Size = new System.Drawing.Size(75, 23);
            this.btnclick.TabIndex = 1;
            this.btnclick.Text = "Click";
            this.btnclick.UseVisualStyleBackColor = true;
            this.btnclick.Click += new System.EventHandler(this.btnclick_Click);
            // 
            // text
            // 
            this.text.AutoSize = true;
            this.text.Location = new System.Drawing.Point(0, 0);
            this.text.Name = "text";
            this.text.Size = new System.Drawing.Size(0, 13);
            this.text.TabIndex = 2;
            // 
            // lbl
            // 
            this.lbl.AutoSize = true;
            this.lbl.Location = new System.Drawing.Point(296, 188);
            this.lbl.Name = "lbl";
            this.lbl.Size = new System.Drawing.Size(186, 13);
            this.lbl.TabIndex = 3;
            this.lbl.Text = "Mouse hasn\'t move inside the window";
            // 
            // lblload
            // 
            this.lblload.AutoSize = true;
            this.lblload.Location = new System.Drawing.Point(296, 53);
            this.lblload.Name = "lblload";
            this.lblload.Size = new System.Drawing.Size(0, 13);
            this.lblload.TabIndex = 4;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.lblload);
            this.Controls.Add(this.lbl);
            this.Controls.Add(this.text);
            this.Controls.Add(this.btnclick);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.MouseMove += new System.Windows.Forms.MouseEventHandler(this.Form1_MouseMove);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Button btnclick;
        private System.Windows.Forms.Label text;
        private System.Windows.Forms.Label lbl;
        private System.Windows.Forms.Label lblload;
    }
}

