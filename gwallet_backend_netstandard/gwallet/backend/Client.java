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

public class Client implements mscorlib.system.IDisposable {
    public com.sun.jna.Pointer __object;

    public Client(com.sun.jna.Pointer object) { this.__object = object; }

    @Override
    public com.sun.jna.Pointer __getObject() { return this.__object; }

    public Client(java.lang.String host, int port) {
        __object = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Client_new(host, port);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public java.lang.String request(java.lang.String request) {
        java.lang.String __ret = gwallet_backend_netstandard.Native_GWallet_Backend_NetStandard.INSTANCE.GWallet_Backend_Client_Request(__object, request);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }
}
