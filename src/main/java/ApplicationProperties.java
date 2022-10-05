import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class ApplicationProperties {

    private static ApplicationProperties applicationProperties;
    private String name;
    private OffsetDateTime creationDate;

    private static LocalDate localDate = LocalDate.parse("2022-10-05");
    private static LocalTime localTime = LocalTime.parse("00:23:30");


    private ApplicationProperties(String name, OffsetDateTime creationDate){
        this.name = name;
        this.creationDate = creationDate;
    }

    static ApplicationProperties getInstance(){
        if (applicationProperties == null) applicationProperties = new ApplicationProperties("poc_design_pattern_singleton", OffsetDateTime.of(localDate, localTime,ZoneOffset.UTC));
        return applicationProperties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
