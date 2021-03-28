package academy.pocu.comp2500.lab10;

import academy.pocu.comp2500.lab10.pocuflix.ResultBase;
import academy.pocu.comp2500.lab10.pocuflix.ResultCode;

import java.time.OffsetDateTime;

public final class ServiceUnavailableResult extends ResultBase {
    private OffsetDateTime startTime;
    private OffsetDateTime endTime;

    public ServiceUnavailableResult(OffsetDateTime startTime, OffsetDateTime endTime) {
        super(ResultCode.SERVICE_UNAVAILABLE);
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public OffsetDateTime getStartDateTime() {
        return startTime;
    }
    public OffsetDateTime getEndDateTime() {
        return endTime;
    }
}
