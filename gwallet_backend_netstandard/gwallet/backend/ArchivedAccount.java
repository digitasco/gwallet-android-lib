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

public class ArchivedAccount implements gwallet_backend_netstandard.gwallet.backend.IAccount {
    public com.sun.jna.Pointer __object;

    public ArchivedAccount(com.sun.jna.Pointer object) { this.__object = object; }

    @Override
    public com.sun.jna.Pointer __getObject() { return this.__object; }

    java.lang.String getPrivateKey() {
        java.lang.String __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_ArchivedAccount_get_PrivateKey(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }
}
