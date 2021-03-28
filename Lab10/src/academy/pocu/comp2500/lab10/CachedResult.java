package academy.pocu.comp2500.lab10;

import academy.pocu.comp2500.lab10.pocuflix.ResultBase;
import academy.pocu.comp2500.lab10.pocuflix.ResultCode;

public final class CachedResult extends ResultBase {
    private int remainExpiryCount;

    public CachedResult(int remainExpiryCount) {
        super(ResultCode.NOT_MODIFIED);
        this.remainExpiryCount = remainExpiryCount;
    }
    public int getExpiryCount() {
        return remainExpiryCount;
    }
}
