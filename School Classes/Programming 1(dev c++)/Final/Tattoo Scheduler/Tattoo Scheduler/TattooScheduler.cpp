//implementation file for TattooScheduler

#include "TattooScheduler.hpp"

//************************************************************************************************
//function that prints the welcome message
void printWelcome(bool& use){
    if(use == true){ //first time using
        cout << "Welcome to your tattoo schedule.\n- Options are listed below."
        << "\n- Enter your choice and follow the prompts to access or change appointments.\n";
        
        use = false; //update firstUse in main
    }
    else //not first time using
        cout << "Welcome back.\n";
}

//************************************************************************************************
//function that prints the menu for the choices in program
void printMenu(){
    cout << " --------------------------\n"
         << "| 1 - Show All Appointments|\n"
         << "| 2 - Add Appointment      |\n"
         << "| 3 - Remove Appointment   |\n"
         << "| 4 - Search Appointments  |\n"
         << "| 5 - Client View          |\n"
         << "| 111 - Save and Exit      |\n"
         << " --------------------------\n";
}

//************************************************************************************************
//function that takes the vector and sorts TattooAppointments based on date
void sort(vector<TattooAppointment> &appointments){
    //local variables
    TattooAppointment temp;
    
    //simple bubble sort using temp and copy constructor to move elemenets of vector around
    for(int i = 0; i < appointments.size(); i++){
        for(int j = i + 1; j < appointments.size(); j++){
            //if years are the same
            if(appointments[j].getDate().substr(6,2) ==
               appointments[i].getDate().substr(6,2) ) {
                //check if months are also equal
                if(appointments[j].getDate().substr(0,2) ==
                   appointments[i].getDate().substr(0,2) ){
                    //use the days to compare
                    if(appointments[j].getDate().substr(3,2) <
                       appointments[i].getDate().substr(3,2) ){
                        //swap
                        temp = appointments[i];
                        appointments[i] = appointments[j];
                        appointments[j] = temp;
                    } //end day
                }
                //else - the months are not equal and can be used
                else if(appointments[j].getDate().substr(0,2) <
                        appointments[i].getDate().substr(0,2) ){
                    //swap
                    temp = appointments[i];
                    appointments[i] = appointments[j];
                    appointments[j] = temp;
                }//end month
            } //end outer if
            //if year of element i+1 is less than year of element i
            else if(appointments[j].getDate().substr(6,2)  <
               appointments[i].getDate().substr(6,2) ) {
                //swap using temp and copy const
                temp = appointments[i];
                appointments[i] = appointments[j];
                appointments[j] = temp;
            } //end if else
        } //end inner for
    } //end outer for
} //end function

//************************************************************************************************
//funtion that takes the vector of appointments and adds an appointment with user inputted values
// function will provide validation that a client with that name exists.
void addAppointment(vector<TattooAppointment>& appointments, const vector<TattooContact>& clients){
    //variables to hold the data of appointment
    string name, date, desc;
    double price, size;
    
    //prompt for the data and save
    cout << "Enter the name of client: ";
    getline(cin, name);
    
    //validate
    if(!contactExists(clients, name)){ //while name does not exist in contacts
        cout << "Name does not match contact.\n";
        getline(cin, name);
    }
    else { //name does exist
        cout << "Enter date of appointment [mm-dd-yy]: ";
        //verify format
        getline(cin,date);
        while(date.at(2) != '-' || date.at(5) != '-') {
            cout << "Wrong format. Please enter again\n";
            getline(cin,date);
    }
        cout << "Description of tattoo: \n";
        getline(cin, desc);
        cout << "Price: $";
        cin >> price;
        cout << "Size (in inches): ";
        cin >> size;
        
        //enter appointment into vector
        appointments.push_back(TattooAppointment(name, date, desc, price, size));
        
        //print success message
        cout << " -------------------\n"
             << "| Appointment added |\n"
             << " -------------------\n\n";
    }
}
//************************************************************************************************
//function that takes the contacts vector and a name to search for, then loops through the vector
// and prints the info for contact if found
void searchContacts(const vector<TattooContact>& clients){
    //local variables
    string name;
    bool found = false;
    int i = 0;
    cout << "Enter name to search for: ";
    getline(cin,name);
    
    while(i < clients.size() && found != true){
        if(clients[i].getName() == name){ //name is found
            found = true; //exits loop
            clients[i].printContact();
        }
        i++; //increment index
    }//end while
    if(!found) //not found
        cout << "Name not registered.\n";
}

//************************************************************************************************
//function that takes the vector of appointments and name to search for then prints appts by name
void searchAppointments(const vector<TattooAppointment>& appointments){
    //local variables
    string name;
    bool found = false;
    
    //prompt for name to search with
    cout << "Enter name of client: ";
    getline(cin, name);
    
    
    //loop through vector and print the info for any appointments that match the name
    for(const auto& appointment : appointments){
        if(appointment.getName() == name)
            appointment.printData();
        found = true;
    }
    
    if(!found){
        cout << "No appointments found.\n";
    }
}

//************************************************************************************************
//function that takes the vector of appointments and loops through to print ALL the appt details
void printAppointments(const vector<TattooAppointment>& appointments){
    //local var
    int i = 1;
    
    for(const auto& appointment : appointments){
        cout << endl << i << " ";
        appointment.printData();
        i++;
    }
    if (appointments.size() == 0)
        cout << "No Appointments Found.\n";
}

//************************************************************************************************
//function that takes the vector of clients and prompts through adding a contact into it
void addContact(vector<TattooContact>& clients){
    string name, phone;
    
    cout << "Name of client: ";
    getline(cin, name);
    
    cout << "Phone number / Contact [xxx-xxx-xxxx]: ";
    getline(cin, phone);
    
    //if there is incorrect format, prompt for phone again
    while(phone.at(3) != '-' || phone.at(7) != '-') {
        cout << "Incorrect format. Enter again please.\n";
    getline(cin,phone);
    }
    
    clients.push_back(TattooContact(name, phone));
    
    cout << " ---------------\n"
         << "| Contact added |\n"
         << " ---------------\n\n";
}

//************************************************************************************************
//function that loops through contact vector and returns true if the name searched exists
//this function is for validation that the appointment contains a valid contact, hopefully
// eliminating inconsistency of names, which is what is used for searches.
bool contactExists(const vector<TattooContact>& clients, const string& name){
    for(const auto& client : clients){
        if(client.getName() == name)
            return true;
    }
    return false;
}

//************************************************************************************************
//this function needs to take the vector of contacts, and prompt the user to choose one
//then alter its contents, like name or contact info.
//**** must be cascaded to the relating appointments ****
void alterContactName(vector<TattooContact>& clients, vector<TattooAppointment>& appointments){
    string oldName, newName;
    char validation;
    int i = 0;
    bool found = false;
    
    cout << "Enter old name: ";
    getline(cin,oldName);
    
    while(!contactExists(clients, oldName) )
    {//contact does not exist meaning name entered is wrong
        cout << "Name does not match. Try again.\n";
        getline(cin,oldName);
    }
    
       
    
    cout << "Enter new name to replace: ";
    getline(cin, newName);
    
    //validate name is correct before changing everything
    cout << newName << " correct? [y/n]\n";
    cin >> validation;
    
    //loop until correct
    while(validation != 'y'){ //if user made mistake, redo
        cout << "Enter new name to replace: ";
        getline(cin, newName);
        
        cout << newName << " correct? [y/n]\n";
        cin >> validation;
    }
    
    //loop through the clients to update the client's new name
    while(i < clients.size() && found != true){
        if(clients[i].getName() == oldName){
            found = true; //end loop
            clients[i].setName(newName); //update name
        }
        i++;
    } //end while
    
    //cascade to appointments!
    //this loops through all appointments and if has old name, changes to new name
    for(auto& appointment : appointments){
        if(appointment.getName() == oldName)
            appointment.setName(newName);
    }
    
    cout << " ------------------- \n"
         << "|      success      |\n"
         << " -------------------\n\n";
    
}

//************************************************************************************************
//this function needs to take the vector of contacts, and prompt the user to choose one
//then alter its contents, like name or contact info.
void alterContactNumber(vector<TattooContact>& clients){
    string name;
    string newNumber;
    bool found = false;
    int i = 0;
    char validation;
    
    cout << "Enter name of client to update: ";
    getline(cin,name);
    
    while(!contactExists(clients, name) )
    {//contact does not exist meaning name entered is wrong
        cout << "Name does not match. Try again.\n";
        getline(cin,name);
    }
    
    cout << "Enter new number [xxx-xxx-xxxx]: ";
    cin >> newNumber;
    
    //validate phone is correct before changing everything
    cout << newNumber << " correct? [y/n]\n";
    cin >> validation;
    
    //loop until correct
    while(validation != 'y'){ //if user made mistake, redo
        cout << "Enter new number to replace: ";
        getline(cin, newNumber);
        
        cout << newNumber << " correct? [y/n]\n";
        cin >> validation;
    }
    
    //loop through clients to update the client's new phone
    while(i < clients.size() && found != true){
        if(clients[i].getName() == name){
            found = true; //end loop
            clients[i].setPhone(newNumber); //update name
        }
        i++;
    }
    
    cout << " ------------------- \n"
         << "|      success      |\n"
         << " -------------------\n\n";
}

//************************************************************************************************
//this function needs to take the vector of contacts, and prompt the user to choose one
//then alter its contents, like name or contact info.
void alterContactCancellations(vector<TattooContact>& clients){
    string name;
    int newNumber;
    bool found = false;
    int i = 0;
    char validation;
    
    cout << "Enter name of client to update: ";
    getline(cin,name);
    
    while(!contactExists(clients, name) )
    {//contact does not exist meaning name entered is wrong
        cout << "Name does not match. Try again.\n";
        getline(cin,name);
    }
    
    cout << "Enter amnt of cancellations: ";
    cin >> newNumber;
    
    //validate phone is correct before changing everything
    cout << newNumber << " correct? [y/n]\n";
    cin >> validation;
    
    //loop until correct
    while(validation != 'y'){ //if user made mistake, redo
        cout << "Enter new number to replace: ";
        cin >> newNumber;
        
        cout << newNumber << " correct? [y/n]\n";
        cin >> validation;
    }
    
    //loop through clients to update the client's new phone
    while(i < clients.size() && found != true){
        if(clients[i].getName() == name){
            found = true; //end loop
            clients[i].setCancellations(newNumber); //update name
        }
        i++;
    }
    
    cout << " -------------------\n"
         << "|      success      |\n"
         << " -------------------\n\n";
    
}


//************************************************************************************************
//function to print the client view - menu
void clientView(){
    cout << " --------------------------\n"
         << "| 1 - Print Contact Info   |\n"
         << "| 2 - Change Name          |\n"
         << "| 3 - Change Contact #     |\n"
         << "| 4 - Change Cancellations |\n"
         << "| 9 - Back                 |\n"
         << " --------------------------\n";
}
//************************************************************************************************
//function to print the client view - neat short list of names to make it easier when typing in to select
void clientNames(const vector<TattooContact>& clients){
    //loop and display info
    cout << "CLIENTS ON FILE:\n";
    for(int i = 0; i < clients.size(); i++){
        cout << " - " << clients[i].getName() << endl;
    }
}


//************************************************************************************************
//this function takes the vector of appointments and prompts for one to remove using the element
void removeAppointment(vector<TattooAppointment>& appointments){
    //local variables
    int index;
    
    //prompt for index of element (the appointments are displayed above)
    //user will enter 1 for element 0 and so on
    cout << "Enter appointment number: ";
    cin >> index;
    index--; //decrement to true index
    
    appointments.erase(appointments.begin() + index);
    
    cout << " ------------------- \n"
         << "|      success      |\n"
         << " -------------------\n\n";
}

//************************************************************************************************
//function takes the vectors, and the name of the save file, then loops and writes to file
void save(const vector<TattooContact>& clients, const vector<TattooAppointment>& appointments, const string& fileName){
    //output stream
    ofstream fout;
    
    fout.open(fileName); //open file to write
    
    //first, we output the size of the clients vector so we know how much to load
    fout << clients.size() << endl;
    
    //loop through contacts first, write all the member fields
    //end line after name because we will have to use getLine to read it
    for(const auto& client : clients){
        fout << client.getName() << "|" << client.getPhone() << " " << client.getCancellations() << endl;
    }
    
    //output size of appointments
    fout << appointments.size() << endl;
    
    //loop through appointments to write the data
    for(const auto& appointment : appointments){
        fout << appointment.getName() << "|" << appointment.getDate() << " " << appointment.getDescription() << "|"
        << appointment.getPrice() << " " << appointment.getSize() << endl;
    }
    
    fout.close(); //close the output stream
    
    //success message
    cout << "Data Saved\n";
}

//************************************************************************************************
//function takes both vectors and fileName, opens ifstream to read the data and initialize the vectors with the data
void load(vector<TattooContact>& clients, vector<TattooAppointment>& appointments, const string& fileName){
    //local variables
    //for adding objects to vectors - pointers for dynamic memory since we will be looping through lots of data
    string* name, *phone, *description, *date;
    int *cancellations, *vSize;
    double *price, *size;
    
    //file reading
    ifstream fin;
    fin.open(fileName);
    
    //get size of clients vector
    vSize = new int;
    fin >> *vSize;
    fin.ignore();
    
    if(*vSize > 0){
    //loop through for contacts
        for(int i = 0; i < *vSize; i++){
            //create memory for the variables
            name = new string;
            phone = new string;
            cancellations = new int;
            //read group of data
            getline(fin, *name, '|');
            fin >> *phone >> *cancellations;
            fin.ignore();
            //push back vector with data
            clients.push_back(TattooContact(*name, *phone, *cancellations));
            
            //free memory
            delete name;
            delete phone;
            delete cancellations;
           }
    }
    
    delete vSize; //delete contacts size
    
    //read appointments size
    vSize = new int;
    fin >> *vSize;
    fin.ignore();
    
    //now loop through appointments
    if(*vSize > 0){
        for(int i = 0; i < *vSize; i++){
            //create memory
            name = new string;
            date = new string;
            description = new string;
            price = new double;
            size = new double;
            //read groups of data
            getline(fin, *name, '|');
            fin >> *date;
            getline(fin, *description, '|');
            fin >> *price >> *size;
            fin.ignore();
            //push back appointment with data
            appointments.push_back(TattooAppointment(*name, *date, *description, *price, *size));
            
            //free memory
            delete name;
            delete date;
            delete description;
            delete price;
            delete size;
        }
    }
    delete vSize;
  
    
    //close fin
    fin.close();
}
