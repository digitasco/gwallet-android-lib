/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package gwallet_backend_netstandard.gwallet.backend.ether;

import mono.embeddinator.*;
import com.sun.jna.*;

public class MinerFee {
    public com.sun.jna.Pointer __object;

    public MinerFee(com.sun.jna.Pointer object) { this.__object = object; }

    public java.math.BigDecimal calculateAbsoluteValue() {
        mono.embeddinator.Decimal __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Ether_MinerFee_CalculateAbsoluteValue(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret.getValue();
    }

    public long getGasPriceInWei() {
        long __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Ether_MinerFee_get_GasPriceInWei(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public gwallet_backend_netstandard.gwallet.backend.Currency getCurrency() {
        com.sun.jna.Pointer __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Ether_MinerFee_get_Currency(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return (__ret == com.sun.jna.Pointer.NULL ? null : new gwallet_backend_netstandard.gwallet.backend.Currency(__ret));
    }
}
