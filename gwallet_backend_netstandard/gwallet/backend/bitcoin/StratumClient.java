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

public class StratumClient implements mscorlib.system.IDisposable {
    public com.sun.jna.Pointer __object;

    public StratumClient(com.sun.jna.Pointer object) { this.__object = object; }

    @Override
    public com.sun.jna.Pointer __getObject() { return this.__object; }

    public StratumClient(gwallet_backend_netstandard.gwallet.backend.Client jsonRpcClient) {
        __object = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Bitcoin_StratumClient_new(jsonRpcClient == null ? null : jsonRpcClient.__object);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public gwallet_backend_netstandard.gwallet.backend.bitcoin.BlockchainEstimateFeeResult blockchainEstimateFee(int numBlocksTarget) {
        com.sun.jna.Pointer __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Bitcoin_StratumClient_BlockchainEstimateFee(__object, numBlocksTarget);
        mono.embeddinator.Runtime.checkExceptions();
        return (__ret == com.sun.jna.Pointer.NULL ? null : new gwallet_backend_netstandard.gwallet.backend.bitcoin.BlockchainEstimateFeeResult(__ret));
    }
}