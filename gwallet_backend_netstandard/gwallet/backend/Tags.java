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

public final class Tags {
    public static int getBTC() {
        int __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Tags_get_BTC();
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public static void setBTC(int value) {
        gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Tags_set_BTC(value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public static int getETH() {
        int __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Tags_get_ETH();
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public static void setETH(int value) {
        gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Tags_set_ETH(value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public static int getETC() {
        int __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Tags_get_ETC();
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public static void setETC(int value) {
        gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Tags_set_ETC(value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
