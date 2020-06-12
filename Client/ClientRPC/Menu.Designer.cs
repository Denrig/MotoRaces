namespace app.ClientRPC
{
    partial class Menu
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
            this.racesSelector = new System.Windows.Forms.ComboBox();
            this.Nume = new System.Windows.Forms.TextBox();
            this.team = new System.Windows.Forms.ComboBox();
            this.racerEngine = new System.Windows.Forms.ComboBox();
            this.racerFilter = new System.Windows.Forms.Button();
            this.exit = new System.Windows.Forms.Button();
            this.racerDelete = new System.Windows.Forms.Button();
            this.racerAdd = new System.Windows.Forms.Button();
            this.racersData = new System.Windows.Forms.DataGridView();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            ((System.ComponentModel.ISupportInitialize)(this.racersData)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.SuspendLayout();
            // 
            // racesSelector
            // 
            this.racesSelector.FormattingEnabled = true;
            this.racesSelector.Location = new System.Drawing.Point(477, 134);
            this.racesSelector.Name = "racesSelector";
            this.racesSelector.Size = new System.Drawing.Size(345, 21);
            this.racesSelector.TabIndex = 17;
            this.racesSelector.Text = "Race";
            // 
            // Nume
            // 
            this.Nume.Location = new System.Drawing.Point(477, 52);
            this.Nume.Name = "Nume";
            this.Nume.Size = new System.Drawing.Size(345, 20);
            this.Nume.TabIndex = 16;
            this.Nume.Text = "Name";
            // 
            // team
            // 
            this.team.FormattingEnabled = true;
            this.team.Location = new System.Drawing.Point(477, 106);
            this.team.Name = "team";
            this.team.Size = new System.Drawing.Size(345, 21);
            this.team.TabIndex = 15;
            this.team.Text = "Team";
            // 
            // racerEngine
            // 
            this.racerEngine.FormattingEnabled = true;
            this.racerEngine.Location = new System.Drawing.Point(477, 78);
            this.racerEngine.Name = "racerEngine";
            this.racerEngine.Size = new System.Drawing.Size(345, 21);
            this.racerEngine.TabIndex = 14;
            this.racerEngine.Text = "Engine";
            this.racerEngine.SelectedIndexChanged += new System.EventHandler(this.racerEngine_SelectedIndexChanged);
            // 
            // racerFilter
            // 
            this.racerFilter.Location = new System.Drawing.Point(640, 23);
            this.racerFilter.Name = "racerFilter";
            this.racerFilter.Size = new System.Drawing.Size(75, 23);
            this.racerFilter.TabIndex = 13;
            this.racerFilter.Text = "Filter";
            this.racerFilter.UseVisualStyleBackColor = true;
            this.racerFilter.Click += new System.EventHandler(this.racerFilter_Click);
            // 
            // exit
            // 
            this.exit.Location = new System.Drawing.Point(721, 23);
            this.exit.Name = "exit";
            this.exit.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.exit.Size = new System.Drawing.Size(104, 23);
            this.exit.TabIndex = 12;
            this.exit.Text = "Exit";
            this.exit.UseVisualStyleBackColor = true;
            this.exit.Click += new System.EventHandler(this.exit_Click);
            // 
            // racerDelete
            // 
            this.racerDelete.Location = new System.Drawing.Point(559, 23);
            this.racerDelete.Name = "racerDelete";
            this.racerDelete.Size = new System.Drawing.Size(75, 23);
            this.racerDelete.TabIndex = 11;
            this.racerDelete.Text = "Delete";
            this.racerDelete.UseVisualStyleBackColor = true;
            this.racerDelete.Click += new System.EventHandler(this.racerDelete_Click);
            // 
            // racerAdd
            // 
            this.racerAdd.Location = new System.Drawing.Point(477, 23);
            this.racerAdd.Name = "racerAdd";
            this.racerAdd.Size = new System.Drawing.Size(76, 23);
            this.racerAdd.TabIndex = 10;
            this.racerAdd.Text = "Add";
            this.racerAdd.UseVisualStyleBackColor = true;
            this.racerAdd.Click += new System.EventHandler(this.racerAdd_Click);
            // 
            // racersData
            // 
            this.racersData.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.racersData.Location = new System.Drawing.Point(12, 12);
            this.racersData.Name = "racersData";
            this.racersData.Size = new System.Drawing.Size(459, 244);
            this.racersData.TabIndex = 9;
            // 
            // dataGridView1
            // 
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Location = new System.Drawing.Point(12, 268);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.Size = new System.Drawing.Size(459, 222);
            this.dataGridView1.TabIndex = 18;
            // 
            // Menu
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(834, 502);
            this.Controls.Add(this.dataGridView1);
            this.Controls.Add(this.racesSelector);
            this.Controls.Add(this.Nume);
            this.Controls.Add(this.team);
            this.Controls.Add(this.racerEngine);
            this.Controls.Add(this.racerFilter);
            this.Controls.Add(this.exit);
            this.Controls.Add(this.racerDelete);
            this.Controls.Add(this.racerAdd);
            this.Controls.Add(this.racersData);
            this.Name = "Menu";
            this.Text = "Menu";
            this.Load += new System.EventHandler(this.Menu_Load);
            ((System.ComponentModel.ISupportInitialize)(this.racersData)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ComboBox racesSelector;
        private System.Windows.Forms.TextBox Nume;
        private System.Windows.Forms.ComboBox team;
        private System.Windows.Forms.ComboBox racerEngine;
        private System.Windows.Forms.Button racerFilter;
        private System.Windows.Forms.Button exit;
        private System.Windows.Forms.Button racerDelete;
        private System.Windows.Forms.Button racerAdd;
        private System.Windows.Forms.DataGridView racersData;
        private System.Windows.Forms.DataGridView dataGridView1;
    }
}