// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ssm.PatchGroupArgs;
import io.pulumi.aws.ssm.inputs.PatchGroupState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an SSM Patch Group resource
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:ssm/patchGroup:PatchGroup")
public class PatchGroup extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the patch baseline to register the patch group with.
     * 
     */
    @Export(name="baselineId", type=String.class, parameters={})
    private Output<String> baselineId;

    /**
     * @return The ID of the patch baseline to register the patch group with.
     * 
     */
    public Output<String> getBaselineId() {
        return this.baselineId;
    }
    /**
     * The name of the patch group that should be registered with the patch baseline.
     * 
     */
    @Export(name="patchGroup", type=String.class, parameters={})
    private Output<String> patchGroup;

    /**
     * @return The name of the patch group that should be registered with the patch baseline.
     * 
     */
    public Output<String> getPatchGroup() {
        return this.patchGroup;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PatchGroup(String name) {
        this(name, PatchGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PatchGroup(String name, PatchGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PatchGroup(String name, PatchGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/patchGroup:PatchGroup", name, args == null ? PatchGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PatchGroup(String name, Output<String> id, @Nullable PatchGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/patchGroup:PatchGroup", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PatchGroup get(String name, Output<String> id, @Nullable PatchGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PatchGroup(name, id, state, options);
    }
}
