// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.documentai_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.documentai_v1.ProcessorArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a processor from the type processor that the user chose. The processor will be at "ENABLED" state by default after its creation.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:documentai/v1:Processor")
public class Processor extends io.pulumi.resources.CustomResource {
    /**
     * The time the processor was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the processor was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The default processor version.
     * 
     */
    @OutputExport(name="defaultProcessorVersion", type=String.class, parameters={})
    private Output<String> defaultProcessorVersion;

    /**
     * @return The default processor version.
     * 
     */
    public Output<String> getDefaultProcessorVersion() {
        return this.defaultProcessorVersion;
    }
    /**
     * The display name of the processor.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name of the processor.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The KMS key used for encryption/decryption in CMEK scenarios. See https://cloud.google.com/security-key-management.
     * 
     */
    @OutputExport(name="kmsKeyName", type=String.class, parameters={})
    private Output<String> kmsKeyName;

    /**
     * @return The KMS key used for encryption/decryption in CMEK scenarios. See https://cloud.google.com/security-key-management.
     * 
     */
    public Output<String> getKmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * Immutable. The resource name of the processor. Format: `projects/{project}/locations/{location}/processors/{processor}`
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The resource name of the processor. Format: `projects/{project}/locations/{location}/processors/{processor}`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Immutable. The http endpoint that can be called to invoke processing.
     * 
     */
    @OutputExport(name="processEndpoint", type=String.class, parameters={})
    private Output<String> processEndpoint;

    /**
     * @return Immutable. The http endpoint that can be called to invoke processing.
     * 
     */
    public Output<String> getProcessEndpoint() {
        return this.processEndpoint;
    }
    /**
     * The state of the processor.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the processor.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The processor type, e.g., INVOICE_PARSING, W2_PARSING, etc.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The processor type, e.g., INVOICE_PARSING, W2_PARSING, etc.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Processor(String name) {
        this(name, ProcessorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Processor(String name, @Nullable ProcessorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Processor(String name, @Nullable ProcessorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:documentai/v1:Processor", name, args == null ? ProcessorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Processor(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:documentai/v1:Processor", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Processor get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Processor(name, id, options);
    }
}
