// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.appstream.EntitlementArgs;
import io.pulumi.awsnative.appstream.outputs.EntitlementAttribute;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::AppStream::Entitlement
 * 
 */
@ResourceType(type="aws-native:appstream:Entitlement")
public class Entitlement extends io.pulumi.resources.CustomResource {
    @OutputExport(name="appVisibility", type=String.class, parameters={})
    private Output<String> appVisibility;

    public Output<String> getAppVisibility() {
        return this.appVisibility;
    }
    @OutputExport(name="attributes", type=List.class, parameters={EntitlementAttribute.class})
    private Output<List<EntitlementAttribute>> attributes;

    public Output<List<EntitlementAttribute>> getAttributes() {
        return this.attributes;
    }
    @OutputExport(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="stackName", type=String.class, parameters={})
    private Output<String> stackName;

    public Output<String> getStackName() {
        return this.stackName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Entitlement(String name) {
        this(name, EntitlementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Entitlement(String name, EntitlementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Entitlement(String name, EntitlementArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appstream:Entitlement", name, args == null ? EntitlementArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Entitlement(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appstream:Entitlement", name, null, makeResourceOptions(options, id));
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
    public static Entitlement get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Entitlement(name, id, options);
    }
}
