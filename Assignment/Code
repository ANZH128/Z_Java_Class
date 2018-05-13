using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Windows;

namespace CCS
{
    public class UserTabViewModel : DatabaseViewModel<User>
    {
        // Fields

        private int _id;
        private string _firstName;
        private string _lastName;
        private string _username;
        private string _password;
        private string _email;
        private ReferenceCode _referenceCode;

        // Constructors

        public UserTabViewModel(MainWindowViewModel mainWindow)
        {
            MainWindow = mainWindow;
            Collection = new ObservableCollection<User>(MainWindow.Database.GetUsers());
        }

        // Properties

        public IEnumerable<ReferenceCode> ReferenceCodes
        {
            get
            {
                return Enum.GetValues(typeof(ReferenceCode)).Cast<ReferenceCode>();
            }
        }

        // Observables

        public int Id
        {
            get
            {
                return _id;
            }
            set
            {
                _id = value;
                NotifyPropertyChanged("Id");
            }
        }

        public string FirstName
        {
            get
            {
                return _firstName;
            }
            set
            {
                _firstName = value;
                NotifyPropertyChanged("FirstName");
            }
        }

        public string LastName
        {
            get
            {
                return _lastName;
            }
            set
            {
                _lastName = value;
                NotifyPropertyChanged("LastName");
            }
        }

        public string Username
        {
            get
            {
                return _username;
            }
            set
            {
                _username = value;
                NotifyPropertyChanged("Username");
            }
        }

        public string Password
        {
            get
            {
                return _password;
            }
            set
            {
                _password = value;
                NotifyPropertyChanged("Password");
            }
        }

        public string Email
        {
            get
            {
                return _email;
            }
            set
            {
                _email = value;
                NotifyPropertyChanged("Email");
            }
        }

        public ReferenceCode ReferenceCode
        {
            get
            {
                return _referenceCode;
            }
            set
            {
                _referenceCode = value;
                NotifyPropertyChanged("ReferenceCode");
            }
        }

        // Public Methods

        public override void Create()
        {
            if (Validate())
            {
                if (MainWindow.Database.Create(new User(0, FirstName, LastName, Username, Password, Email, ReferenceCode)))
                {
                    Collection = new ObservableCollection<User>(MainWindow.Database.GetUsers());
                }
            }
        }

        public override void Update()
        {
            if (MessageBox.Show("Are you sure?", "Warning", MessageBoxButton.YesNo, MessageBoxImage.Question, MessageBoxResult.Yes) == MessageBoxResult.Yes)
            {
                if (Validate())
                {
                    MainWindow.Database.Update(new User(Id, FirstName, LastName, Username, Password, Email, ReferenceCode));
                    Collection = new ObservableCollection<User>(MainWindow.Database.GetUsers());
                    Clear();
                    MessageBox.Show("Success!");
                }
            }
        }

        public override void Delete(User user)
        {
            if (MessageBox.Show("Are you sure?", "Warning", MessageBoxButton.YesNo, MessageBoxImage.Question, MessageBoxResult.Yes) == MessageBoxResult.Yes)
            {
                MainWindow.Database.Delete(user);
                Collection = new ObservableCollection<User>(MainWindow.Database.GetUsers());
                Clear();
                MessageBox.Show("Success!");
            }
        }

        // Protected Methods

        protected override bool Validate()
        {
            string error = "";
            if (string.IsNullOrEmpty(FirstName))
            {
                error += "First Name can't be empty\n";
            }
            if (string.IsNullOrEmpty(LastName))
            {
                error += "Last Name can't be empty\n";
            }
            if (string.IsNullOrEmpty(Password))
            {
                error += "Password can't be empty\n";
            }
            if (!Password.IsSecurePassword())
            {
                error += "Password must contain six characters, at least one uppercase letter, one lowercase letter, one number, and one special character\n";
            }
            if (!Email.IsEmail())
            {
                error += "Please enter a valid Email\n";
            }
            if (string.IsNullOrEmpty(error))
            {
                return true;
            }
            else
            {
                MessageBox.Show(error, "Validation Error", MessageBoxButton.OK, MessageBoxImage.Error);
                return false;
            }
        }

        protected override void Clear()
        {
            Id = 0;
            FirstName = string.Empty;
            LastName = string.Empty;
            Password = string.Empty;
            Username = string.Empty;
            Email = string.Empty;
            ReferenceCode = ReferenceCode.ADM;
            IsEditing = false;
        }

        protected override void Fill(User user)
        {
            Id = user.Id;
            FirstName = user.FirstName;
            LastName = user.LastName;
            Password = user.Password;
            Username = user.Username;
            Email = user.Email;
            ReferenceCode = user.ReferenceCode;
            IsEditing = true;
        }
    }
}
