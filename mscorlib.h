// ----------------------------------------------------------------------------
// <auto-generated>
// This is autogenerated code by Embeddinator-4000.
// Do not edit this file or all your changes will be lost after re-generation.
// </auto-generated>
// ----------------------------------------------------------------------------
#pragma once

#include "glib.h"
#include "mono_embeddinator.h"
#include "c-support.h"

MONO_EMBEDDINATOR_BEGIN_DECLS

typedef MonoEmbedObject System_Exception;
typedef MonoEmbedObject System_Runtime_Serialization_ISerializable;
typedef MonoEmbedObject System_Runtime_InteropServices__Exception;
typedef MonoEmbedObject System_IEquatable_1;
typedef MonoEmbedObject System_IComparable_1;
typedef MonoEmbedObject System_IComparable;
typedef MonoEmbedObject System_IDisposable;
typedef MonoEmbedObject System_Collections_IStructuralEquatable;
typedef MonoEmbedObject System_Collections_IStructuralComparable;

MONO_EMBEDDINATOR_API System_Exception* System_Exception_new();
MONO_EMBEDDINATOR_API System_Exception* System_Exception_new_1(const char* message);
MONO_EMBEDDINATOR_API const char* System_Exception_ToString(System_Exception* object);
MONO_EMBEDDINATOR_API const char* System_Exception_get_Message(System_Exception* object);
MONO_EMBEDDINATOR_API const char* System_Exception_get_StackTrace(System_Exception* object);
MONO_EMBEDDINATOR_API const char* System_Exception_get_HelpLink(System_Exception* object);
MONO_EMBEDDINATOR_API void System_Exception_set_HelpLink(System_Exception* object, const char* value);
MONO_EMBEDDINATOR_API const char* System_Exception_get_Source(System_Exception* object);
MONO_EMBEDDINATOR_API void System_Exception_set_Source(System_Exception* object, const char* value);
MONO_EMBEDDINATOR_API const char* System_Exception_get_RemoteStackTrace(System_Exception* object);
MONO_EMBEDDINATOR_API int32_t System_Exception_get_HResult(System_Exception* object);
MONO_EMBEDDINATOR_API void System_Exception_set_HResult(System_Exception* object, int32_t value);
MONO_EMBEDDINATOR_API bool System_Exception_get_IsTransient(System_Exception* object);

MONO_EMBEDDINATOR_API const char* System_Runtime_InteropServices__Exception_ToString(System_Runtime_InteropServices__Exception* object);
MONO_EMBEDDINATOR_API const char* System_Runtime_InteropServices__Exception_get_Message(System_Runtime_InteropServices__Exception* object);
MONO_EMBEDDINATOR_API const char* System_Runtime_InteropServices__Exception_get_StackTrace(System_Runtime_InteropServices__Exception* object);
MONO_EMBEDDINATOR_API const char* System_Runtime_InteropServices__Exception_get_HelpLink(System_Runtime_InteropServices__Exception* object);
MONO_EMBEDDINATOR_API void System_Runtime_InteropServices__Exception_set_HelpLink(System_Runtime_InteropServices__Exception* object, const char* value);
MONO_EMBEDDINATOR_API const char* System_Runtime_InteropServices__Exception_get_Source(System_Runtime_InteropServices__Exception* object);
MONO_EMBEDDINATOR_API void System_Runtime_InteropServices__Exception_set_Source(System_Runtime_InteropServices__Exception* object, const char* value);

MONO_EMBEDDINATOR_API void System_IDisposable_Dispose(System_IDisposable* object);

MONO_EMBEDDINATOR_END_DECLS
