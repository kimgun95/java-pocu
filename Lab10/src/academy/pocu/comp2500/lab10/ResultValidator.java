package academy.pocu.comp2500.lab10;

import academy.pocu.comp2500.lab10.pocuflix.NotFoundResult;
import academy.pocu.comp2500.lab10.pocuflix.OkResult;
import academy.pocu.comp2500.lab10.pocuflix.ResultBase;
import academy.pocu.comp2500.lab10.pocuflix.ResultCode;

public final class ResultValidator {
    private ResultBase resultBase;

    public ResultValidator(ResultBase resultBase) {
        this.resultBase = resultBase;
    }
    public boolean isValid(ResultCode resultCode) {
        if (resultBase.getCode() != resultCode) {
            return false;
        }

        boolean isValid;
        // 인자로 받은 resultCode에 따라 케이스를 만들어 resultBase가 해당 인스턴스인지 valid 체크한다.
        switch (resultCode) {
            case OK:
                isValid = resultBase instanceof OkResult;
                break;
            case NOT_FOUND:
                isValid = resultBase instanceof NotFoundResult;
                break;
            case NOT_MODIFIED:
                isValid = resultBase instanceof CachedResult;
                break;
            case UNAUTHORIZED:
                isValid = resultBase instanceof UnauthorizedResult;
                break;
            case SERVICE_UNAVAILABLE:
                isValid = resultBase instanceof ServiceUnavailableResult;
                break;
            default:
                assert (false) : "Unknown Type!";
                isValid = false;
                break;
        }
        return isValid;
    }
}
