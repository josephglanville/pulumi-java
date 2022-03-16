// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dns_v1.PolicyArgs;
import io.pulumi.googlenative.dns_v1.outputs.PolicyAlternativeNameServerConfigResponse;
import io.pulumi.googlenative.dns_v1.outputs.PolicyNetworkResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new Policy.
 * 
 */
@ResourceType(type="google-native:dns/v1:Policy")
public class Policy extends io.pulumi.resources.CustomResource {
    /**
     * Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not available when an alternative name server is specified.
     * 
     */
    @Export(name="alternativeNameServerConfig", type=PolicyAlternativeNameServerConfigResponse.class, parameters={})
    private Output<PolicyAlternativeNameServerConfigResponse> alternativeNameServerConfig;

    /**
     * @return Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not available when an alternative name server is specified.
     * 
     */
    public Output<PolicyAlternativeNameServerConfigResponse> getAlternativeNameServerConfig() {
        return this.alternativeNameServerConfig;
    }
    /**
     * A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the policy's function.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the policy's function.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Allows networks bound to this policy to receive DNS queries sent by VMs or applications over VPN connections. When enabled, a virtual IP address is allocated from each of the subnetworks that are bound to this policy.
     * 
     */
    @Export(name="enableInboundForwarding", type=Boolean.class, parameters={})
    private Output<Boolean> enableInboundForwarding;

    /**
     * @return Allows networks bound to this policy to receive DNS queries sent by VMs or applications over VPN connections. When enabled, a virtual IP address is allocated from each of the subnetworks that are bound to this policy.
     * 
     */
    public Output<Boolean> getEnableInboundForwarding() {
        return this.enableInboundForwarding;
    }
    /**
     * Controls whether logging is enabled for the networks bound to this policy. Defaults to no logging if not set.
     * 
     */
    @Export(name="enableLogging", type=Boolean.class, parameters={})
    private Output<Boolean> enableLogging;

    /**
     * @return Controls whether logging is enabled for the networks bound to this policy. Defaults to no logging if not set.
     * 
     */
    public Output<Boolean> getEnableLogging() {
        return this.enableLogging;
    }
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * User-assigned name for this policy.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return User-assigned name for this policy.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * List of network names specifying networks to which this policy is applied.
     * 
     */
    @Export(name="networks", type=List.class, parameters={PolicyNetworkResponse.class})
    private Output<List<PolicyNetworkResponse>> networks;

    /**
     * @return List of network names specifying networks to which this policy is applied.
     * 
     */
    public Output<List<PolicyNetworkResponse>> getNetworks() {
        return this.networks;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable PolicyArgs.Builder a);
    }
    private static io.pulumi.googlenative.dns_v1.PolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.dns_v1.PolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Policy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Policy(String name) {
        this(name, PolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Policy(String name, @Nullable PolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Policy(String name, @Nullable PolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Policy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1:Policy", name, null, makeResourceOptions(options, id));
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
    public static Policy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, options);
    }
}
