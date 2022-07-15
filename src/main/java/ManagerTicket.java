

import java.util.Arrays;

public class ManagerTicket  {

    private Repository repo;

    public ManagerTicket(Repository repo) {
        this.repo = repo;
    }

    public void add(Ticket ticket) {
        repo.add(ticket);
    }

    public Ticket[] findAll(String from, String to) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repo.getAll()) {
            if (matches(ticket, from) && matches2(ticket, to)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp.clone();
            }
        }
    Arrays.sort(result);
        return result;
    }


    public boolean matches(Ticket ticket, String search) {
        if (ticket.getDepartureAirport().contains(search)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean matches2(Ticket ticket, String search) {
        if (ticket.getArrivalAirport().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}
