/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package gwallet_backend_netstandard.gwallet.backend.bitcoin;

import mono.embeddinator.*;
import com.sun.jna.*;

public final class ErrorInnerResult implements mscorlib.system.collections.IStructuralEquatable, mscorlib.system.IComparable, mscorlib.system.collections.IStructuralComparable {
    public com.sun.jna.Pointer __object;

    public ErrorInnerResult(com.sun.jna.Pointer object) { this.__object = object; }

    @Override
    public com.sun.jna.Pointer __getObject() { return this.__object; }

    public ErrorInnerResult(java.lang.String message, int code) {
        __object = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Bitcoin_ErrorInnerResult_new(message, code);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String toString() {
        java.lang.String __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Bitcoin_ErrorInnerResult_ToString(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public final int compareTo(gwallet_backend_netstandard.gwallet.backend.bitcoin.ErrorInnerResult obj) {
        int __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Bitcoin_ErrorInnerResult_CompareTo(__object, obj == null ? null : obj.__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public final boolean equals(gwallet_backend_netstandard.gwallet.backend.bitcoin.ErrorInnerResult obj) {
        byte __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Bitcoin_ErrorInnerResult_Equals(__object, obj == null ? null : obj.__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret != 0;
    }

    public java.lang.String getMessage() {
        java.lang.String __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Bitcoin_ErrorInnerResult_get_Message(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public int getCode() {
        int __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Bitcoin_ErrorInnerResult_get_Code(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }
}