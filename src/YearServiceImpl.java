import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class YearServiceImpl extends UnicastRemoteObject implements YearService {
    public YearServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public Year getYear(Year year) throws RemoteException {

        return year;
    }
}