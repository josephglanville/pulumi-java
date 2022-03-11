// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.FirewallPolicyArgs;
import io.pulumi.azurenative.network.outputs.DnsSettingsResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicyInsightsResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicyIntrusionDetectionResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicySNATResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicySkuResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicyThreatIntelWhitelistResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicyTransportSecurityResponse;
import io.pulumi.azurenative.network.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * FirewallPolicy Resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:FirewallPolicy firewallPolicy /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/firewallPolicies/firewallPolicy 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:FirewallPolicy")
public class FirewallPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The parent firewall policy from which rules are inherited.
     * 
     */
    @OutputExport(name="basePolicy", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> basePolicy;

    /**
     * @return The parent firewall policy from which rules are inherited.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getBasePolicy() {
        return this.basePolicy;
    }
    /**
     * List of references to Child Firewall Policies.
     * 
     */
    @OutputExport(name="childPolicies", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> childPolicies;

    /**
     * @return List of references to Child Firewall Policies.
     * 
     */
    public Output<List<SubResourceResponse>> getChildPolicies() {
        return this.childPolicies;
    }
    /**
     * DNS Proxy Settings definition.
     * 
     */
    @OutputExport(name="dnsSettings", type=DnsSettingsResponse.class, parameters={})
    private Output</* @Nullable */ DnsSettingsResponse> dnsSettings;

    /**
     * @return DNS Proxy Settings definition.
     * 
     */
    public Output</* @Nullable */ DnsSettingsResponse> getDnsSettings() {
        return this.dnsSettings;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * List of references to Azure Firewalls that this Firewall Policy is associated with.
     * 
     */
    @OutputExport(name="firewalls", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> firewalls;

    /**
     * @return List of references to Azure Firewalls that this Firewall Policy is associated with.
     * 
     */
    public Output<List<SubResourceResponse>> getFirewalls() {
        return this.firewalls;
    }
    /**
     * The identity of the firewall policy.
     * 
     */
    @OutputExport(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    /**
     * @return The identity of the firewall policy.
     * 
     */
    public Output</* @Nullable */ ManagedServiceIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Insights on Firewall Policy.
     * 
     */
    @OutputExport(name="insights", type=FirewallPolicyInsightsResponse.class, parameters={})
    private Output</* @Nullable */ FirewallPolicyInsightsResponse> insights;

    /**
     * @return Insights on Firewall Policy.
     * 
     */
    public Output</* @Nullable */ FirewallPolicyInsightsResponse> getInsights() {
        return this.insights;
    }
    /**
     * The configuration for Intrusion detection.
     * 
     */
    @OutputExport(name="intrusionDetection", type=FirewallPolicyIntrusionDetectionResponse.class, parameters={})
    private Output</* @Nullable */ FirewallPolicyIntrusionDetectionResponse> intrusionDetection;

    /**
     * @return The configuration for Intrusion detection.
     * 
     */
    public Output</* @Nullable */ FirewallPolicyIntrusionDetectionResponse> getIntrusionDetection() {
        return this.intrusionDetection;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning state of the firewall policy resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the firewall policy resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * List of references to FirewallPolicyRuleCollectionGroups.
     * 
     */
    @OutputExport(name="ruleCollectionGroups", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> ruleCollectionGroups;

    /**
     * @return List of references to FirewallPolicyRuleCollectionGroups.
     * 
     */
    public Output<List<SubResourceResponse>> getRuleCollectionGroups() {
        return this.ruleCollectionGroups;
    }
    /**
     * The Firewall Policy SKU.
     * 
     */
    @OutputExport(name="sku", type=FirewallPolicySkuResponse.class, parameters={})
    private Output</* @Nullable */ FirewallPolicySkuResponse> sku;

    /**
     * @return The Firewall Policy SKU.
     * 
     */
    public Output</* @Nullable */ FirewallPolicySkuResponse> getSku() {
        return this.sku;
    }
    /**
     * The private IP addresses/IP ranges to which traffic will not be SNAT.
     * 
     */
    @OutputExport(name="snat", type=FirewallPolicySNATResponse.class, parameters={})
    private Output</* @Nullable */ FirewallPolicySNATResponse> snat;

    /**
     * @return The private IP addresses/IP ranges to which traffic will not be SNAT.
     * 
     */
    public Output</* @Nullable */ FirewallPolicySNATResponse> getSnat() {
        return this.snat;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The operation mode for Threat Intelligence.
     * 
     */
    @OutputExport(name="threatIntelMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> threatIntelMode;

    /**
     * @return The operation mode for Threat Intelligence.
     * 
     */
    public Output</* @Nullable */ String> getThreatIntelMode() {
        return this.threatIntelMode;
    }
    /**
     * ThreatIntel Whitelist for Firewall Policy.
     * 
     */
    @OutputExport(name="threatIntelWhitelist", type=FirewallPolicyThreatIntelWhitelistResponse.class, parameters={})
    private Output</* @Nullable */ FirewallPolicyThreatIntelWhitelistResponse> threatIntelWhitelist;

    /**
     * @return ThreatIntel Whitelist for Firewall Policy.
     * 
     */
    public Output</* @Nullable */ FirewallPolicyThreatIntelWhitelistResponse> getThreatIntelWhitelist() {
        return this.threatIntelWhitelist;
    }
    /**
     * TLS Configuration definition.
     * 
     */
    @OutputExport(name="transportSecurity", type=FirewallPolicyTransportSecurityResponse.class, parameters={})
    private Output</* @Nullable */ FirewallPolicyTransportSecurityResponse> transportSecurity;

    /**
     * @return TLS Configuration definition.
     * 
     */
    public Output</* @Nullable */ FirewallPolicyTransportSecurityResponse> getTransportSecurity() {
        return this.transportSecurity;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(FirewallPolicyArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.FirewallPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.FirewallPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FirewallPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallPolicy(String name) {
        this(name, FirewallPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallPolicy(String name, FirewallPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallPolicy(String name, FirewallPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:FirewallPolicy", name, args == null ? FirewallPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private FirewallPolicy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:FirewallPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:network/v20190601:FirewallPolicy").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190701:FirewallPolicy").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190801:FirewallPolicy").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190901:FirewallPolicy").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20191101:FirewallPolicy").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20191201:FirewallPolicy").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200301:FirewallPolicy").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200401:FirewallPolicy").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200501:FirewallPolicy").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200601:FirewallPolicy").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200701:FirewallPolicy").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200801:FirewallPolicy").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20201101:FirewallPolicy").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210201:FirewallPolicy").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210301:FirewallPolicy").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210501:FirewallPolicy").build())
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
    public static FirewallPolicy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FirewallPolicy(name, id, options);
    }
}
