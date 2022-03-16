// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotsitewise.AccessPolicyArgs;
import io.pulumi.awsnative.iotsitewise.outputs.AccessPolicyIdentity;
import io.pulumi.awsnative.iotsitewise.outputs.AccessPolicyResource;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::IoTSiteWise::AccessPolicy
 * 
 */
@ResourceType(type="aws-native:iotsitewise:AccessPolicy")
public class AccessPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the access policy.
     * 
     */
    @Export(name="accessPolicyArn", type=String.class, parameters={})
    private Output<String> accessPolicyArn;

    /**
     * @return The ARN of the access policy.
     * 
     */
    public Output<String> getAccessPolicyArn() {
        return this.accessPolicyArn;
    }
    /**
     * The ID of the access policy.
     * 
     */
    @Export(name="accessPolicyId", type=String.class, parameters={})
    private Output<String> accessPolicyId;

    /**
     * @return The ID of the access policy.
     * 
     */
    public Output<String> getAccessPolicyId() {
        return this.accessPolicyId;
    }
    /**
     * The identity for this access policy. Choose either a user or a group but not both.
     * 
     */
    @Export(name="accessPolicyIdentity", type=AccessPolicyIdentity.class, parameters={})
    private Output<AccessPolicyIdentity> accessPolicyIdentity;

    /**
     * @return The identity for this access policy. Choose either a user or a group but not both.
     * 
     */
    public Output<AccessPolicyIdentity> getAccessPolicyIdentity() {
        return this.accessPolicyIdentity;
    }
    /**
     * The permission level for this access policy. Valid values are ADMINISTRATOR or VIEWER.
     * 
     */
    @Export(name="accessPolicyPermission", type=String.class, parameters={})
    private Output<String> accessPolicyPermission;

    /**
     * @return The permission level for this access policy. Valid values are ADMINISTRATOR or VIEWER.
     * 
     */
    public Output<String> getAccessPolicyPermission() {
        return this.accessPolicyPermission;
    }
    /**
     * The AWS IoT SiteWise Monitor resource for this access policy. Choose either portal or project but not both.
     * 
     */
    @Export(name="accessPolicyResource", type=AccessPolicyResource.class, parameters={})
    private Output<AccessPolicyResource> accessPolicyResource;

    /**
     * @return The AWS IoT SiteWise Monitor resource for this access policy. Choose either portal or project but not both.
     * 
     */
    public Output<AccessPolicyResource> getAccessPolicyResource() {
        return this.accessPolicyResource;
    }

    public interface BuilderApplicator {
        public void apply(AccessPolicyArgs.Builder a);
    }
    private static io.pulumi.awsnative.iotsitewise.AccessPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.iotsitewise.AccessPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AccessPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessPolicy(String name) {
        this(name, AccessPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessPolicy(String name, AccessPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessPolicy(String name, AccessPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:AccessPolicy", name, args == null ? AccessPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AccessPolicy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:AccessPolicy", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AccessPolicy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccessPolicy(name, id, options);
    }
}
