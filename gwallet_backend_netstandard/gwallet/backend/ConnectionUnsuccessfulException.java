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

public class ConnectionUnsuccessfulException extends mscorlib.system.Exception {
    public ConnectionUnsuccessfulException(com.sun.jna.Pointer object) { super(object); }

    public ConnectionUnsuccessfulException(java.lang.String message) {
        super((com.sun.jna.Pointer)null);
        __object = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_ConnectionUnsuccessfulException_new(message);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public ConnectionUnsuccessfulException() {
        super((com.sun.jna.Pointer)null);
        __object = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_ConnectionUnsuccessfulException_new_1();
        mono.embeddinator.Runtime.checkExceptions();
    }
}
