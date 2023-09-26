import java.rmi.Remote;
import java.rmi.RemoteException;

public interface YearService extends Remote {
    Year getYear(Year year) throws RemoteException;
}