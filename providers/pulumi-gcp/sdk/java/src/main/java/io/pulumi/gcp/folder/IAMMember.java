// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.folder.IAMMemberArgs;
import io.pulumi.gcp.folder.inputs.IAMMemberState;
import io.pulumi.gcp.folder.outputs.IAMMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:folder/iAMMember:IAMMember")
public class IAMMember extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=IAMMemberCondition.class, parameters={})
    private Output</* @Nullable */ IAMMemberCondition> condition;

    public Output</* @Nullable */ IAMMemberCondition> getCondition() {
        return this.condition;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="folder", type=String.class, parameters={})
    private Output<String> folder;

    public Output<String> getFolder() {
        return this.folder;
    }
    @OutputExport(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IAMMember(String name) {
        this(name, IAMMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IAMMember(String name, IAMMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IAMMember(String name, IAMMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:folder/iAMMember:IAMMember", name, args == null ? IAMMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IAMMember(String name, Input<String> id, @Nullable IAMMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:folder/iAMMember:IAMMember", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static IAMMember get(String name, Input<String> id, @Nullable IAMMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IAMMember(name, id, state, options);
    }
}
