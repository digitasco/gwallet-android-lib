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

public class AddressWithInvalidChecksum extends mscorlib.system.Exception implements mscorlib.system.collections.IStructuralEquatable {
    public AddressWithInvalidChecksum(com.sun.jna.Pointer object) { super(object); }

    @Override
    public com.sun.jna.Pointer __getObject() { return this.__object; }

    public AddressWithInvalidChecksum(java.lang.String data0) {
        super((com.sun.jna.Pointer)null);
        __object = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_AddressWithInvalidChecksum_new(data0);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public AddressWithInvalidChecksum() {
        super((com.sun.jna.Pointer)null);
        __object = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_AddressWithInvalidChecksum_new_1();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String getData0() {
        java.lang.String __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_AddressWithInvalidChecksum_get_Data0(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }
}