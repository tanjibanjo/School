// Author: Lane Pollock
// Date: 31 Oct 2024
// Title: Tattoo Scheduler
// Description: A comprehensive project to schedule and view tattoo sessions

#include "TattooScheduler.hpp"
using namespace std;


int main() {
    //local variables
    bool firstUse; //regulate welcome message
    int choice, clientChoice; //user choice for functionality
    char newClient = 'y';
    string saveFile = "SaveFile.txt";

    //vector to hold clients
    vector<TattooContact> clients;
    //vector to hold appointments
    vector<TattooAppointment> appointments;
    
    //check for save file and load if exists
    ifstream fin;
    fin.open(saveFile);
    if(!fin){
        fin.close();
        firstUse = true;
    }
    else{
        fin.close();
        firstUse = false;
        load(clients, appointments, saveFile);
    }
    
    //print welcome
    printWelcome(firstUse);
    
    
    //enter loop
    do{
        printMenu();
        cin >> choice;
        cin.ignore(); //clear buffer
        
        //switch choice to reflect function
        switch(choice){
            case 1: //show appointments
                printAppointments(appointments);
                break;
            case 2: //add appointment
                if(clients.size() > 0) {
                    clientNames(clients); //print names to make it easy to search for
                    cout << "New client? [y/n]\n";
                    cin >> newClient;
                    cin.ignore();
                }
                if(newClient == 'y') //if new client, add a contact for them
                    addContact(clients);
                addAppointment(appointments, clients);
                sort(appointments);
                break;
            case 3: //remove appointment
                printAppointments(appointments);
                removeAppointment(appointments);
                break;
            case 4: //search appointments
                searchAppointments(appointments);
                break;
            case 5: //client view
                clientNames(clients);
                clientView(); //print clients and menu
                //nested switch providing funcitonality for client updating/viewing
                cin >> clientChoice;
                cin.ignore();
                while(clientChoice != 9){
                    switch(clientChoice){
                        case 1: //calls searchContact to show the data of a contact
                            searchContacts(clients);
                            break;
                        case 2: //change name
                            alterContactName(clients, appointments);
                            break;
                        case 3: //change contact number
                            alterContactNumber(clients);
                            break;
                        case 4: //change cancellations
                            alterContactCancellations(clients);
                            break;
                        default:
                            cout << "Invalid choice.\n";
                            break;
                    }
                    cin >> clientChoice;
                    cin.ignore();
                }
                break;
            case 111:
                save(clients, appointments, saveFile);
                cout << "Goodbye.\n";
                break;
            default:
                cout << "Invalid option, try again.\n";
        } ///end switch
        
    } while(choice != 111);
    
    return 0;
}
