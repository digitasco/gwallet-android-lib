/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package gwallet_backend_netstandard.gwallet.backend;

import mono.embeddinator.*;
import com.sun.jna.*;

public class ResultInconsistencyException extends mscorlib.system.Exception {
    public ResultInconsistencyException(com.sun.jna.Pointer object) { super(object); }

    public ResultInconsistencyException(int totalNumberOfSuccesfulResultsObtained, int maxNumberOfConsistentResultsObtained, int numberOfConsistentResultsRequired) {
        super((com.sun.jna.Pointer)null);
        __object = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_ResultInconsistencyException_new(totalNumberOfSuccesfulResultsObtained, maxNumberOfConsistentResultsObtained, numberOfConsistentResultsRequired);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
