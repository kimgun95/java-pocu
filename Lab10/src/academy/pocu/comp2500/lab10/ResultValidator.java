package academy.pocu.comp2500.lab10;

import academy.pocu.comp2500.lab10.pocuflix.ResultBase;
import academy.pocu.comp2500.lab10.pocuflix.ResultCode;

public final class ResultValidator {
    private ResultBase resultBase;

    public ResultValidator(ResultBase resultBase) {
        this.resultBase = resultBase;
    }
    public boolean isValid(ResultCode resultCode) {
        if (resultBase.getCode() == resultCode) {
            return true;
        }
        return false;
    }
}
