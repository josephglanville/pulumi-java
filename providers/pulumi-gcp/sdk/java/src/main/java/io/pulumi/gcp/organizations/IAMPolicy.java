// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.organizations.IAMPolicyArgs;
import io.pulumi.gcp.organizations.inputs.IAMPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:organizations/iAMPolicy:IAMPolicy")
public class IAMPolicy extends io.pulumi.resources.CustomResource {
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The numeric ID of the organization in which you want to manage the audit logging config.
     * 
     */
    @Export(name="orgId", type=String.class, parameters={})
    private Output<String> orgId;

    /**
     * @return The numeric ID of the organization in which you want to manage the audit logging config.
     * 
     */
    public Output<String> getOrgId() {
        return this.orgId;
    }
    @Export(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IAMPolicy(String name) {
        this(name, IAMPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IAMPolicy(String name, IAMPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IAMPolicy(String name, IAMPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/iAMPolicy:IAMPolicy", name, args == null ? IAMPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IAMPolicy(String name, Output<String> id, @Nullable IAMPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/iAMPolicy:IAMPolicy", name, state, makeResourceOptions(options, id));
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
    public static IAMPolicy get(String name, Output<String> id, @Nullable IAMPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IAMPolicy(name, id, state, options);
    }
}
