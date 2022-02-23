// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.solutions.JitRequestArgs;
import io.pulumi.azurenative.solutions.outputs.ApplicationClientDetailsResponse;
import io.pulumi.azurenative.solutions.outputs.JitAuthorizationPoliciesResponse;
import io.pulumi.azurenative.solutions.outputs.JitSchedulingPolicyResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Information about JIT request definition.
 * API Version: 2019-07-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:solutions:JitRequest myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Solutions/jitRequests/{jitRequestName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:solutions:JitRequest")
public class JitRequest extends io.pulumi.resources.CustomResource {
    /**
     * The parent application id.
     * 
     */
    @OutputExport(name="applicationResourceId", type=String.class, parameters={})
    private Output<String> applicationResourceId;

    /**
     * @return The parent application id.
     * 
     */
    public Output<String> getApplicationResourceId() {
        return this.applicationResourceId;
    }
    /**
     * The client entity that created the JIT request.
     * 
     */
    @OutputExport(name="createdBy", type=ApplicationClientDetailsResponse.class, parameters={})
    private Output<ApplicationClientDetailsResponse> createdBy;

    /**
     * @return The client entity that created the JIT request.
     * 
     */
    public Output<ApplicationClientDetailsResponse> getCreatedBy() {
        return this.createdBy;
    }
    /**
     * The JIT authorization policies.
     * 
     */
    @OutputExport(name="jitAuthorizationPolicies", type=List.class, parameters={JitAuthorizationPoliciesResponse.class})
    private Output<List<JitAuthorizationPoliciesResponse>> jitAuthorizationPolicies;

    /**
     * @return The JIT authorization policies.
     * 
     */
    public Output<List<JitAuthorizationPoliciesResponse>> getJitAuthorizationPolicies() {
        return this.jitAuthorizationPolicies;
    }
    /**
     * The JIT request state.
     * 
     */
    @OutputExport(name="jitRequestState", type=String.class, parameters={})
    private Output<String> jitRequestState;

    /**
     * @return The JIT request state.
     * 
     */
    public Output<String> getJitRequestState() {
        return this.jitRequestState;
    }
    /**
     * The JIT request properties.
     * 
     */
    @OutputExport(name="jitSchedulingPolicy", type=JitSchedulingPolicyResponse.class, parameters={})
    private Output<JitSchedulingPolicyResponse> jitSchedulingPolicy;

    /**
     * @return The JIT request properties.
     * 
     */
    public Output<JitSchedulingPolicyResponse> getJitSchedulingPolicy() {
        return this.jitSchedulingPolicy;
    }
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The JIT request provisioning state.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The JIT request provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The publisher tenant id.
     * 
     */
    @OutputExport(name="publisherTenantId", type=String.class, parameters={})
    private Output<String> publisherTenantId;

    /**
     * @return The publisher tenant id.
     * 
     */
    public Output<String> getPublisherTenantId() {
        return this.publisherTenantId;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The client entity that last updated the JIT request.
     * 
     */
    @OutputExport(name="updatedBy", type=ApplicationClientDetailsResponse.class, parameters={})
    private Output<ApplicationClientDetailsResponse> updatedBy;

    /**
     * @return The client entity that last updated the JIT request.
     * 
     */
    public Output<ApplicationClientDetailsResponse> getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public JitRequest(String name) {
        this(name, JitRequestArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JitRequest(String name, JitRequestArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JitRequest(String name, JitRequestArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:solutions:JitRequest", name, args == null ? JitRequestArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private JitRequest(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:solutions:JitRequest", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:solutions/v20190701:JitRequest").build()),
                Input.of(Alias.builder().setType("azure-native:solutions/v20200821preview:JitRequest").build()),
                Input.of(Alias.builder().setType("azure-native:solutions/v20210701:JitRequest").build())
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
    public static JitRequest get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new JitRequest(name, id, options);
    }
}
