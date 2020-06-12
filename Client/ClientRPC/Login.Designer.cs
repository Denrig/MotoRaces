namespace app.ClientRPC
{
    partial class Login
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
            this.exec = new System.Windows.Forms.Button();
            this.backgroundWorker1 = new System.ComponentModel.BackgroundWorker();
            this.User = new System.Windows.Forms.TextBox();
            this.Pass = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // exec
            // 
            this.exec.Location = new System.Drawing.Point(117, 168);
            this.exec.Name = "exec";
            this.exec.Size = new System.Drawing.Size(75, 23);
            this.exec.TabIndex = 0;
            this.exec.Text = "Login";
            this.exec.UseVisualStyleBackColor = true;
            NewMethod();
            // 
            // User
            // 
            this.User.Location = new System.Drawing.Point(12, 58);
            this.User.Name = "User";
            this.User.Size = new System.Drawing.Size(298, 20);
            this.User.TabIndex = 1;
            // 
            // Pass
            // 
            this.Pass.Location = new System.Drawing.Point(12, 112);
            this.Pass.Name = "Pass";
            this.Pass.Size = new System.Drawing.Size(298, 20);
            this.Pass.TabIndex = 2;
            // 
            // Login
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(340, 245);
            this.Controls.Add(this.Pass);
            this.Controls.Add(this.User);
            this.Controls.Add(this.exec);
            this.Name = "Login";
            this.Text = "Login";
            this.ResumeLayout(false);
            this.PerformLayout();

            void NewMethod()
            {
                this.exec.Click += new System.EventHandler(this.exec_ClickAsync);
            }
        }

        #endregion

        private System.Windows.Forms.Button exec;
        private System.ComponentModel.BackgroundWorker backgroundWorker1;
        private System.Windows.Forms.TextBox User;
        private System.Windows.Forms.TextBox Pass;
    }
}