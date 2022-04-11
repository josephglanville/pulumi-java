// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.admissionregistration.k8s.io_v1beta1;

import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.admissionregistration.k8s.io_v1beta1.ValidatingWebhookConfigurationArgs;
import io.pulumi.kubernetes.admissionregistration.k8s.io_v1beta1.outputs.ValidatingWebhook;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ValidatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and object without changing it. Deprecated in v1.16, planned for removal in v1.19. Use admissionregistration.k8s.io/v1 ValidatingWebhookConfiguration instead.
 * 
 */
@ResourceType(type="kubernetes:admissionregistration.k8s.io/v1beta1:ValidatingWebhookConfiguration")
public class ValidatingWebhookConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Export(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
     * 
     */
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
     * 
     */
    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * Webhooks is a list of webhooks and the affected resources and operations.
     * 
     */
    @Export(name="webhooks", type=List.class, parameters={ValidatingWebhook.class})
    private Output</* @Nullable */ List<ValidatingWebhook>> webhooks;

    /**
     * @return Webhooks is a list of webhooks and the affected resources and operations.
     * 
     */
    public Output</* @Nullable */ List<ValidatingWebhook>> getWebhooks() {
        return this.webhooks;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ValidatingWebhookConfiguration(String name) {
        this(name, ValidatingWebhookConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ValidatingWebhookConfiguration(String name, @Nullable ValidatingWebhookConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ValidatingWebhookConfiguration(String name, @Nullable ValidatingWebhookConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:admissionregistration.k8s.io/v1beta1:ValidatingWebhookConfiguration", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private ValidatingWebhookConfiguration(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:admissionregistration.k8s.io/v1beta1:ValidatingWebhookConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static ValidatingWebhookConfigurationArgs makeArgs(@Nullable ValidatingWebhookConfigurationArgs args) {
        var builder = args == null ? ValidatingWebhookConfigurationArgs.builder() : ValidatingWebhookConfigurationArgs.builder(args);
        return builder
            .apiVersion("admissionregistration.k8s.io/v1beta1")
            .kind("ValidatingWebhookConfiguration")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:admissionregistration.k8s.io/v1:ValidatingWebhookConfiguration").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ValidatingWebhookConfiguration get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ValidatingWebhookConfiguration(name, id, options);
    }
}
