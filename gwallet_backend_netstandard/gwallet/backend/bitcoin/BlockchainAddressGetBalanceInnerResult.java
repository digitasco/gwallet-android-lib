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

public final class BlockchainAddressGetBalanceInnerResult implements mscorlib.system.collections.IStructuralEquatable, mscorlib.system.IComparable, mscorlib.system.collections.IStructuralComparable {
    public com.sun.jna.Pointer __object;

    public BlockchainAddressGetBalanceInnerResult(com.sun.jna.Pointer object) { this.__object = object; }

    @Override
    public com.sun.jna.Pointer __getObject() { return this.__object; }

    public BlockchainAddressGetBalanceInnerResult(long confirmed, long unconfirmed) {
        __object = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Bitcoin_BlockchainAddressGetBalanceInnerResult_new(confirmed, unconfirmed);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String toString() {
        java.lang.String __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Bitcoin_BlockchainAddressGetBalanceInnerResult_ToString(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public final int compareTo(gwallet_backend_netstandard.gwallet.backend.bitcoin.BlockchainAddressGetBalanceInnerResult obj) {
        int __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Bitcoin_BlockchainAddressGetBalanceInnerResult_CompareTo(__object, obj == null ? null : obj.__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public final boolean equals(gwallet_backend_netstandard.gwallet.backend.bitcoin.BlockchainAddressGetBalanceInnerResult obj) {
        byte __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Bitcoin_BlockchainAddressGetBalanceInnerResult_Equals(__object, obj == null ? null : obj.__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret != 0;
    }

    public long getConfirmed() {
        long __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Bitcoin_BlockchainAddressGetBalanceInnerResult_get_Confirmed(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public long getUnconfirmed() {
        long __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Bitcoin_BlockchainAddressGetBalanceInnerResult_get_Unconfirmed(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }
}