package enthuware.revision;

import java.util.*;
import java.util.stream.Collectors;

public class SortingAlgorithm {

    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(new Date(600), new Date(700), "All right"));
        contacts.add(new Contact(new Date(300), new Date(500), "All right"));
        contacts.add(new Contact(new Date(50), new Date(100), "All right"));
        contacts.add(new Contact(new Date(300), new Date(400), "All right"));
        contacts.add(new Contact(null, null, "All right"));
        contacts.add(new Contact(new Date(300), null, "All right"));
        contacts.add(new Contact(new Date(300), null, "All right"));
        contacts.add(new Contact(new Date(50), null, "All right"));
        contacts.add(new Contact(new Date(50), new Date(200), "All right"));
        contacts.add(new Contact(null, new Date(100), "All right"));
        contacts.add(new Contact(null, new Date(700), "All right"));
        contacts.add(new Contact(new Date(600), null, "All right"));

        filter(contacts);
//        contacts.sort(Comparator.comparing(Contact::getEndDate, Comparator.nullsLast(Comparator.naturalOrder()))
//                .thenComparing(Comparator.comparing(Contact::getStartDate)));
//        contacts.sort(Comparator.comparing(Contact::getStartDate));
        contacts.sort(Comparator.comparing(Contact::getStartDate)
                .thenComparing(Comparator.comparing(Contact::getEndDate, Comparator.nullsLast(Comparator.naturalOrder()))));



        Map<Date, List<Contact>> dateListMap = contacts.stream().collect(Collectors.groupingBy(Contact::getStartDate));
        dateListMap.forEach((date, contacts1) -> contacts.forEach(System.out::println));
    }

    public static void filter(List<Contact> contacts) {
        contacts.removeIf(contact -> contact.getStartDate() == null);
    }
}

class Contact {
    private Date startDate;
    private Date endDate;
    private String endReason;

    public Contact(Date startDate, Date endDate, String endReason) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.endReason = endReason;
    }

    public Contact() {
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setEndReason(String endReason) {
        this.endReason = endReason;
    }

    public Date getStartDate() {

        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getEndReason() {
        return endReason;
    }

    @Override
    public String toString() {
        return (this.startDate == null ? "null" : this.startDate.getTime()) +
                " : " + (this.endDate == null ? "null" : this.endDate.getTime());
    }
}
