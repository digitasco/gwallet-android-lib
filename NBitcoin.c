// ----------------------------------------------------------------------------
// <auto-generated>
// This is autogenerated code by Embeddinator-4000.
// Do not edit this file or all your changes will be lost after re-generation.
// </auto-generated>
// ----------------------------------------------------------------------------
#include "NBitcoin.h"
#include "glib.h"
#include "mono_embeddinator.h"
#include "c-support.h"

mono_embeddinator_context_t __mono_context;
MonoImage* __NBitcoin_dll_image;

static MonoClass* class_NBitcoin_IRandom = 0;

static void __initialize_mono()
{
    if (__mono_context.domain)
        return;
    mono_embeddinator_init(&__mono_context, "mono_embeddinator_binding");
}

static void __lookup_assembly_NBitcoin_dll()
{
    if (__NBitcoin_dll_image)
        return;
    __NBitcoin_dll_image = mono_embeddinator_load_assembly(&__mono_context, "NBitcoin.dll");
}

static void __lookup_class_NBitcoin_IRandom()
{
    if (class_NBitcoin_IRandom == 0)
    {
        __initialize_mono();
        __lookup_assembly_NBitcoin_dll();
        class_NBitcoin_IRandom = mono_class_from_name(__NBitcoin_dll_image, "NBitcoin", "IRandom");
    }
}

void NBitcoin_IRandom_GetBytes(NBitcoin_IRandom* object, uint8_t* output)
{
    const char __method_name[] = "NBitcoin.IRandom:GetBytes(byte[])";
    static MonoMethod *__method = 0;

    if (!__method)
    {
        __lookup_class_NBitcoin_IRandom();
        __method = mono_embeddinator_lookup_method(__method_name, class_NBitcoin_IRandom);
    }

    MonoObject* __instance = mono_gchandle_get_target(object->_handle);
    void* __args[1];
    __args[0] = &output;

    MonoObject* __exception = 0;
    MonoMethod* __virtual_method = mono_object_get_virtual_method(__instance, __method);
    MonoObject* __result = mono_runtime_invoke(__virtual_method, __instance, __args, &__exception);

    if (__exception)
        mono_embeddinator_throw_exception(__exception);
}