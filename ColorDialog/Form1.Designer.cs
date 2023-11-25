namespace ColorDialog
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
            this.chngFont = new System.Windows.Forms.Button();
            this.colorDialog = new System.Windows.Forms.ColorDialog();
            this.SuspendLayout();
            // 
            // text
            // 
            this.text.AutoSize = true;
            this.text.Font = new System.Drawing.Font("Microsoft Sans Serif", 27.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.text.Location = new System.Drawing.Point(140, 182);
            this.text.Name = "text";
            this.text.Size = new System.Drawing.Size(484, 42);
            this.text.TabIndex = 0;
            this.text.Text = "Example Text to show Color";
            this.text.TextAlign = System.Drawing.ContentAlignment.BottomCenter;
            // 
            // chngFont
            // 
            this.chngFont.Location = new System.Drawing.Point(355, 227);
            this.chngFont.Name = "chngFont";
            this.chngFont.Size = new System.Drawing.Size(96, 23);
            this.chngFont.TabIndex = 1;
            this.chngFont.Text = "Change Font";
            this.chngFont.UseVisualStyleBackColor = true;
            this.chngFont.Click += new System.EventHandler(this.chngFont_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.chngFont);
            this.Controls.Add(this.text);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label text;
        private System.Windows.Forms.Button chngFont;
        private System.Windows.Forms.ColorDialog colorDialog;
    }
}

