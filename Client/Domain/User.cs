using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace app.Domain
{
    [Serializable]
    public class User : Entity<string>
    {
        private String username, passwd, name;
        public User(string id) : this(id, "", "")
        {

        }

        public User(string id, string passwd) : this(id, passwd, "")
        {

        }

        public User(string id, string passwd, string name)
        {
            this.username = id;
            this.passwd = passwd;
            this.name = name;
        }

        public string Id
        {
            get { return username; }
            set { username = value; }

        }

        public string Password
        {
            get { return passwd; }
            set { passwd = value; }

        }

        public string Name
        {
            get { return name; }
            set { name = value; }

        }

        public bool Equals(User obj)
        {
            if (ReferenceEquals(null, obj)) return false;
            if (ReferenceEquals(this, obj)) return true;
            return Equals(obj.username, username);
        }

        public override bool Equals(object obj)
        {
            if (ReferenceEquals(null, obj)) return false;
            if (ReferenceEquals(this, obj)) return true;
            if (obj.GetType() != typeof(User)) return false;
            return Equals((User)obj);
        }

        public override int GetHashCode()
        {
            return username.GetHashCode();
        }

        public override string ToString()
        {
            return string.Format("Id: {0}, Name: {1}", username, name);
        }
    }

}
