/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package mscorlib;

import mono.embeddinator.*;
import com.sun.jna.*;

public interface Native_mscorlib extends com.sun.jna.Library
{
    Native_mscorlib INSTANCE = 
        mono.embeddinator.Runtime.loadLibrary("mscorlib", Native_mscorlib.class);

    public com.sun.jna.Pointer System_Exception_new();
    public com.sun.jna.Pointer System_Exception_new_1(java.lang.String message);
    public java.lang.String System_Exception_ToString(com.sun.jna.Pointer object);
    public java.lang.String System_Exception_get_Message(com.sun.jna.Pointer object);
    public java.lang.String System_Exception_get_StackTrace(com.sun.jna.Pointer object);
    public java.lang.String System_Exception_get_HelpLink(com.sun.jna.Pointer object);
    public void System_Exception_set_HelpLink(com.sun.jna.Pointer object, java.lang.String value);
    public java.lang.String System_Exception_get_Source(com.sun.jna.Pointer object);
    public void System_Exception_set_Source(com.sun.jna.Pointer object, java.lang.String value);
    public java.lang.String System_Exception_get_RemoteStackTrace(com.sun.jna.Pointer object);
    public int System_Exception_get_HResult(com.sun.jna.Pointer object);
    public void System_Exception_set_HResult(com.sun.jna.Pointer object, int value);
    public byte System_Exception_get_IsTransient(com.sun.jna.Pointer object);
    public java.lang.String System_Runtime_InteropServices__Exception_ToString(com.sun.jna.Pointer object);
    public java.lang.String System_Runtime_InteropServices__Exception_get_Message(com.sun.jna.Pointer object);
    public java.lang.String System_Runtime_InteropServices__Exception_get_StackTrace(com.sun.jna.Pointer object);
    public java.lang.String System_Runtime_InteropServices__Exception_get_HelpLink(com.sun.jna.Pointer object);
    public void System_Runtime_InteropServices__Exception_set_HelpLink(com.sun.jna.Pointer object, java.lang.String value);
    public java.lang.String System_Runtime_InteropServices__Exception_get_Source(com.sun.jna.Pointer object);
    public void System_Runtime_InteropServices__Exception_set_Source(com.sun.jna.Pointer object, java.lang.String value);
    public void System_IDisposable_Dispose(com.sun.jna.Pointer object);
}
