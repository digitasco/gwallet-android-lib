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

public class InsufficientFunds extends mscorlib.system.Exception implements mscorlib.system.collections.IStructuralEquatable {
    public InsufficientFunds(com.sun.jna.Pointer object) { super(object); }

    @Override
    public com.sun.jna.Pointer __getObject() { return this.__object; }

    public InsufficientFunds() {
        super((com.sun.jna.Pointer)null);
        __object = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_InsufficientFunds_new();
        mono.embeddinator.Runtime.checkExceptions();
    }
}
